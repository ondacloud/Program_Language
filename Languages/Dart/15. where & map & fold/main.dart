void main() {
  final scores = [60, 80, 90];
  print(scores.where((n) => n >= 70).map((n) => n + 1).toList());
  print(scores.fold<int>(0, (total, n) => total + n));
}
