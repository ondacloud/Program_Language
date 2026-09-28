class Animal {
  String speak() => 'sound';
}

class Dog extends Animal {
  @override
  String speak() => 'woof';
}

void main() {
  Animal animal = Dog();
  print(animal.speak());
}
