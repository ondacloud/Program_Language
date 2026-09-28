import 'package:flutter/material.dart';

void main() => runApp(const MaterialApp(home: Lesson()));
class Lesson extends StatefulWidget {
  const Lesson({super.key});
  @override
  State<Lesson> createState() => _LessonState();
}
class _LessonState extends State<Lesson> {
bool expanded = false;



  @override
  Widget build(BuildContext context) => Scaffold(
    appBar: AppBar(title: const Text('Flutter lesson')),
    body: Padding(padding: const EdgeInsets.all(24), child: Column(children: [ElevatedButton(onPressed: () => setState(() => expanded = !expanded), child: const Text('Animate')), AnimatedContainer(duration: const Duration(milliseconds: 250), width: expanded ? 180 : 100, height: 100, color: expanded ? Colors.teal : Colors.blue)])),
  );
}
