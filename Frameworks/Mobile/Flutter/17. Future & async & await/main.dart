import 'package:flutter/material.dart';

void main() => runApp(const MaterialApp(home: Lesson()));
class Lesson extends StatefulWidget {
  const Lesson({super.key});
  @override
  State<Lesson> createState() => _LessonState();
}
class _LessonState extends State<Lesson> {
String message = 'ready';
Future<void> load() async { setState(() => message = 'loading'); await Future<void>.delayed(const Duration(milliseconds: 300)); if (!mounted) return; setState(() => message = 'done'); }


  @override
  Widget build(BuildContext context) => Scaffold(
    appBar: AppBar(title: const Text('Flutter lesson')),
    body: Padding(padding: const EdgeInsets.all(24), child: Column(children: [ElevatedButton(onPressed: load, child: const Text('Load')), Text(message)])),
  );
}
