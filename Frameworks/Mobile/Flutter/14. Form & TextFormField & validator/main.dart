import 'package:flutter/material.dart';

void main() => runApp(const MaterialApp(home: Lesson()));
class Lesson extends StatefulWidget {
  const Lesson({super.key});
  @override
  State<Lesson> createState() => _LessonState();
}
class _LessonState extends State<Lesson> {
final formKey = GlobalKey<FormState>();
String message = '';



  @override
  Widget build(BuildContext context) => Scaffold(
    appBar: AppBar(title: const Text('Flutter lesson')),
    body: Padding(padding: const EdgeInsets.all(24), child: Form(key: formKey, child: Column(children: [TextFormField(decoration: const InputDecoration(labelText: 'Name'), validator: (value) => value == null || value.trim().isEmpty ? 'Name required' : null), ElevatedButton(onPressed: () { if (formKey.currentState!.validate()) setState(() => message = 'valid'); }, child: const Text('Validate')), Text(message)]))),
  );
}
