# Text & debugPrint

## 개념과 사용 시점

Text 위젯은 화면에 글자를 표시하고 debugPrint는 개발 로그를 출력합니다. 화면 출력과 진단 로그를 구분합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Flutter 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "01. Text & debugPrint/main.dart"
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
    body: Padding(padding: const EdgeInsets.all(24), child: ElevatedButton(onPressed: () => debugPrint('Hello from Flutter'), child: const Text('Print log'))),
  );
}
```

[실행 파일](main.dart)

## 예상 결과

화면에는 Print log 버튼, 클릭하면 실행 터미널/개발 로그에 Hello from Flutter

## 주의사항

로그를 실제 사용자 알림 대신 사용하지 마세요. 로그에 비밀 정보를 남기지 않습니다.

## 연습

Text에 이름과 점수를 표시하세요.

[과정 목차](../README.md)
