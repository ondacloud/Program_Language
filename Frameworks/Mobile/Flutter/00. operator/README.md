# operator

## 개념과 사용 시점

Flutter의 로직은 Dart로 작성합니다. /는 실수 나눗셈, ~/는 정수 나눗셈입니다. 문자열 보간으로 결과를 화면에 넣습니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Flutter 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "00. operator/main.dart"
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




  @override
  Widget build(BuildContext context) => Scaffold(
    appBar: AppBar(title: const Text('Flutter lesson')),
    body: Padding(padding: const EdgeInsets.all(24), child: Text('sum: ${7 + 2}, divide: ${7 / 2}, integer: ${7 ~/ 2}, remainder: ${7 % 2}')),
  );
}
```

[실행 파일](main.dart)

## 예상 결과

sum: 9, divide: 3.5, integer: 3, remainder: 1

## 주의사항

UI를 계산하는 build는 여러 번 호출될 수 있습니다. 계산 외 부수 효과는 적절한 생명주기나 이벤트로 옮기세요.

## 연습

비교 연산 결과를 표시하세요.

[과정 목차](../README.md)
