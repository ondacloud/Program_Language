void main() {
  print(int.tryParse('80'));
  print(int.tryParse('wrong') ?? -1);
  print(double.parse('3.5'));
}
