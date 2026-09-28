class Account {
  int _balance = 0;
  int get balance => _balance;
  set balance(int value) {
    if (value < 0) throw ArgumentError('negative balance');
    _balance = value;
  }
}

void main() {
  final account = Account();
  account.balance = 20;
  print(account.balance);
}
