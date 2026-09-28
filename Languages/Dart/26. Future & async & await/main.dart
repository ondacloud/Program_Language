Future<int> load(int value) async {
  await Future<void>.delayed(const Duration(milliseconds: 10));
  return value;
}

Future<void> main() async {
  final values = await Future.wait([load(80), load(90)]);
  print(values);
}
