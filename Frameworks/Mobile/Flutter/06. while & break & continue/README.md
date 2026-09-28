# while & break & continue

## 개념과 사용 시점

while과 반복 제어는 Dart 코드에서 사용합니다. UI에는 계산된 결과를 표시합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Flutter 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "06. while & break & continue/main.dart"
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

String numbers() { final result = <int>[]; var n = 0; while (n < 5) { n++; if (n == 2) continue; if (n == 4) break; result.add(n); } return result.join(','); }


  @override
  Widget build(BuildContext context) => Scaffold(
    appBar: AppBar(title: const Text('Flutter lesson')),
    body: Padding(padding: const EdgeInsets.all(24), child: Text(numbers())),
  );
}
```

[실행 파일](main.dart)

## 예상 결과

1,3

## 주의사항

build 안의 무한 반복은 UI를 멈춥니다. 오래 걸리는 CPU 작업은 별도 isolate 설계가 필요할 수 있습니다.

## 연습

짝수를 건너뛰고 5까지 출력하세요.

[과정 목차](../README.md)
