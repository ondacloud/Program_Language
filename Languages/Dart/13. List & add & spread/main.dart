void main() {
  final scores = <int>[60, 80];
  scores.add(90);
  final copied = [0, ...scores];
  print(copied);
}
