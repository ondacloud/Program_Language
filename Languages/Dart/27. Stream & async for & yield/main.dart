Stream<int> numbers() async* {
  for (var i = 1; i <= 3; i++) {
    yield i;
  }
}

Future<void> main() async {
  await for (final value in numbers()) {
    print(value);
  }
}
