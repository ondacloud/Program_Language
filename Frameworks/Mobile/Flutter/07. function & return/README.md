# function & return

## 개념과 사용 시점

Dart 함수는 매개변수를 받고 값을 반환합니다. 이름 있는 필수 매개변수는 required로 표시합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Flutter 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "07. function & return/main.dart"
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

String greet({required String name}) => 'Hi, $name';


  @override
  Widget build(BuildContext context) => Scaffold(
    appBar: AppBar(title: const Text('Flutter lesson')),
    body: Padding(padding: const EdgeInsets.all(24), child: Text(greet(name: 'Mina'))),
  );
}
```

[실행 파일](main.dart)

## 예상 결과

Hi, Mina

## 주의사항

값을 계산하는 함수와 상태를 변경하는 콜백을 구분하면 테스트와 유지보수가 쉬워집니다.

## 연습

기본 prefix 매개변수를 추가하세요.

[과정 목차](../README.md)
