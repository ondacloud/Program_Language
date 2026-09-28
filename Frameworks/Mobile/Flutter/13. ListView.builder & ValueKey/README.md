# ListView.builder & ValueKey

## 개념과 사용 시점

긴 목록은 builder로 화면에 필요한 항목을 생성합니다. 항목의 안정된 식별자를 key에 사용합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Flutter 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "13. ListView.builder & ValueKey/main.dart"
# 웹 브라우저에서 실행합니다. 첫 실행에는 Flutter SDK가 필요합니다.
```

## 코드 읽기

```dart
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
```

[실행 파일](main.dart)

## 예상 결과

스크롤 가능한 학생 목록

## 주의사항

이 예제는 이름이 고유하다고 가정합니다. 실제 데이터는 고유 id를 key로 쓰세요.

## 연습

항목 100개를 만들어 스크롤을 확인하세요.

[과정 목차](../README.md)
