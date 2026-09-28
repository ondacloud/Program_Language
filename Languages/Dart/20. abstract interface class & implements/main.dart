abstract interface class Greeter {
  String greet(String name);
}

class Friendly implements Greeter {
  @override
  String greet(String name) => 'Hello, $name';
}

void main() {
  Greeter greeter = Friendly();
  print(greeter.greet('Mina'));
}
