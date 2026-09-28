import 'package:flutter/material.dart';

void main() => runApp(const MaterialApp(home: Lesson()));
class Lesson extends StatefulWidget {
  const Lesson({super.key});
  @override
  State<Lesson> createState() => _LessonState();
}
class _LessonState extends State<Lesson> {
final students = List.generate(30, (i) => 'Student ${i + 1}');



  @override
  Widget build(BuildContext context) => Scaffold(
    appBar: AppBar(title: const Text('Flutter lesson')),
    body: Padding(padding: const EdgeInsets.all(24), child: ListView.builder(itemCount: students.length, itemBuilder: (context, index) { final student = students[index]; return ListTile(key: ValueKey(student), title: Text(student)); })),
  );
}
