import 'dart:io';

void main() {
  final name = stdin.readLineSync()?.trim();
  print('Hello, ${name == null || name.isEmpty ? 'guest' : name}');
}
