class Student {
  final String name;
  final int score;
  Student(this.name, this.score);
  Student.guest() : this('guest', 0);
  String summary() => '$name: $score';
}

void main() {
  final student = Student('Mina', 80);
  print(student.summary());
  print(Student.guest().summary());
}
