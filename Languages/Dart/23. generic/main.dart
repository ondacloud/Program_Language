class Box<T> {
  final T value;
  Box(this.value);
}

T? first<T>(List<T> items) => items.isEmpty ? null : items.first;
void main() {
  final box = Box<int>(80);
  print(box.value);
  print(first<String>([]));
}
