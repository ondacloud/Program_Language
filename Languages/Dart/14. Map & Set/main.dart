void main() {
  final scores = <String, int>{'Mina': 80};
  final teams = <String>{'A', 'B'};
  teams.add('A');
  print(scores['Mina']);
  print(scores['Jin'] ?? 0);
  print(teams.length);
}
