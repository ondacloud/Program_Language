String greet({required String name, String prefix = 'Hi'}) => '$prefix, $name';
int add(int a, int b) {
  return a + b;
}

void main() {
  print(greet(name: 'Mina'));
  print(add(2, 3));
}
