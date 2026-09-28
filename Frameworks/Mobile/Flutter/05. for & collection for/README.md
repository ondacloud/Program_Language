# for & collection for

## 개념과 사용 시점

collection for로 데이터에서 위젯 목록을 구성할 수 있습니다. 긴 목록은 ListView.builder로 필요한 항목만 만드세요.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Flutter 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "05. for & collection for/main.dart"
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
final names = ['Mina', 'Jin', 'Sol'];



  @override
  Widget build(BuildContext context) => Scaffold(
    appBar: AppBar(title: const Text('Flutter lesson')),
    body: Padding(padding: const EdgeInsets.all(24), child: Column(children: [for (final name in names) Text(name)])),
  );
}
```

[실행 파일](main.dart)

## 예상 결과

Mina·Jin·Sol 세 줄

## 주의사항

Column은 스크롤하지 않습니다. 많은 항목은 화면을 넘칠 수 있습니다.

## 연습

합격 점수 이상만 collection if로 선택하세요.

[과정 목차](../README.md)
