# if & else

## 개념과 사용 시점

Dart if는 로직을 분기하고 collection if는 위젯 목록에 조건부 항목을 넣습니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Flutter 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "03. if & else/main.dart"
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
bool passed = true;



  @override
  Widget build(BuildContext context) => Scaffold(
    appBar: AppBar(title: const Text('Flutter lesson')),
    body: Padding(padding: const EdgeInsets.all(24), child: Column(children: [Switch(value: passed, onChanged: (value) => setState(() => passed = value)), if (passed) const Text('pass') else const Text('retry')])),
  );
}
```

[실행 파일](main.dart)

## 예상 결과

스위치를 바꾸면 pass·retry가 바뀝니다.

## 주의사항

조건부로 제거된 위젯의 로컬 상태가 유지될 것이라고 가정하지 마세요.

## 연습

점수에 따른 세 가지 등급을 표시하세요.

[과정 목차](../README.md)
