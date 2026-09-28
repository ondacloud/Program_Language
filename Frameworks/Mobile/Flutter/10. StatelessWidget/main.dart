import 'package:flutter/material.dart';
class StudentCard extends StatelessWidget { const StudentCard({super.key, required this.name}); final String name; @override Widget build(BuildContext context) => Text('Student: $name'); }
void main() => runApp(const MaterialApp(home: Lesson()));
class Lesson extends StatefulWidget {
  const Lesson({super.key});
  @override
  State<Lesson> createState() => _LessonState();
}
class _LessonState extends State<Lesson> {




  @override
  Widget build(BuildContext context) => Scaffold(
    appBar: AppBar(title: const Text('Flutter lesson')),
    body: Padding(padding: const EdgeInsets.all(24), child: const StudentCard(name: 'Mina')),
  );
}
