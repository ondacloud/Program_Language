import 'dart:io';

Future<void> main() async {
  final dir = await Directory.systemTemp.createTemp('dart-course-');
  try {
    final file = File('${dir.path}/note.txt');
    await file.writeAsString('Hello Dart');
    print(await file.readAsString());
  } finally {
    await dir.delete(recursive: true);
  }
}
