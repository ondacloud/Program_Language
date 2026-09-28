void main() {
  final student = (name: 'Mina', score: 80);
  final (:name, :score) = student;
  print('$name: $score');
}
