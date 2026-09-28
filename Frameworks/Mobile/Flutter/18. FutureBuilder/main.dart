import 'package:flutter/material.dart';

void main() => runApp(const MaterialApp(home: Lesson()));
class Lesson extends StatefulWidget {
  const Lesson({super.key});
  @override
  State<Lesson> createState() => _LessonState();
}
class _LessonState extends State<Lesson> {
late final Future<String> result;

@override void initState() { super.initState(); result = Future<String>.delayed(const Duration(milliseconds: 300), () => 'Mina'); }

  @override
  Widget build(BuildContext context) => Scaffold(
    appBar: AppBar(title: const Text('Flutter lesson')),
    body: Padding(padding: const EdgeInsets.all(24), child: FutureBuilder<String>(future: result, builder: (context, snapshot) { if (snapshot.hasError) return const Text('failed'); if (snapshot.connectionState != ConnectionState.done) return const CircularProgressIndicator(); return Text(snapshot.data ?? 'empty'); })),
  );
}
