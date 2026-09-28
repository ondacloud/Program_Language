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
    body: Padding(padding: const EdgeInsets.all(24), child: Row(children: [Expanded(child: Container(color: Colors.blue.shade100, child: const Text('Left'))), const SizedBox(width: 12), Expanded(child: Container(color: Colors.green.shade100, child: const Text('Right')))])),
  );
}
