# List & map & where

## 개념과 사용 시점

Dart 컬렉션 메서드로 선택·변환하고 위젯에 연결합니다. where와 map은 지연 Iterable을 반환합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Flutter 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "09. List & map & where/main.dart"
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
final scores = [60, 80, 90];



  @override
  Widget build(BuildContext context) => Scaffold(
    appBar: AppBar(title: const Text('Flutter lesson')),
    body: Padding(padding: const EdgeInsets.all(24), child: Text(scores.where((s) => s >= 70).map((s) => s + 1).join(','))),
  );
}
```

[실행 파일](main.dart)

## 예상 결과

81,91

## 주의사항

children에 Iterable을 전달할 때는 필요에 따라 toList로 List<Widget>을 만듭니다.

## 연습

fold로 합계를 구하세요.

[과정 목차](../README.md)
