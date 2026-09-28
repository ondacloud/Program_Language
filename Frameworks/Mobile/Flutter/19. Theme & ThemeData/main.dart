import 'package:flutter/material.dart';

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
    body: Padding(padding: const EdgeInsets.all(24), child: Theme(data: ThemeData(colorSchemeSeed: Colors.teal, useMaterial3: true), child: const Card(child: Padding(padding: EdgeInsets.all(16), child: Text('Themed card'))))),
  );
}
