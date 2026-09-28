# TextField & onChanged

## 개념과 사용 시점

TextField는 사용자 입력을 받고 onChanged는 문자열 변경을 알립니다. setState로 상태 변경 뒤 다시 그리도록 요청합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Flutter 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "02. TextField & onChanged/main.dart"
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
String name = '';



  @override
  Widget build(BuildContext context) => Scaffold(
    appBar: AppBar(title: const Text('Flutter lesson')),
    body: Padding(padding: const EdgeInsets.all(24), child: Column(children: [TextField(decoration: const InputDecoration(labelText: 'Name'), onChanged: (value) => setState(() => name = value)), Text('Hello, ${name.isEmpty ? 'guest' : name}')])),
  );
}
```

[실행 파일](main.dart)

## 예상 결과

입력에 따라 인사말이 바뀝니다.

## 주의사항

입력은 문자열입니다. 숫자 키보드를 선택해도 유효한 숫자만 들어온다고 보장하지 않습니다.

## 연습

trim으로 공백 이름을 처리하세요.

[과정 목차](../README.md)
