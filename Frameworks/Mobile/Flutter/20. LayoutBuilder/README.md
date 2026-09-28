# LayoutBuilder

## 개념과 사용 시점

LayoutBuilder는 부모가 허용하는 크기 제약에 따라 레이아웃을 선택할 때 사용합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Flutter 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "20. LayoutBuilder/main.dart"
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
    body: Padding(padding: const EdgeInsets.all(24), child: LayoutBuilder(builder: (context, constraints) => Text(constraints.maxWidth >= 600 ? 'wide layout' : 'compact layout'))),
  );
}
```

[실행 파일](main.dart)

## 예상 결과

창 너비에 따라 wide layout 또는 compact layout

## 주의사항

기기 이름보다 실제 영역의 제약을 기준으로 설계하면 분할 화면에도 대응하기 쉽습니다.

## 연습

넓을 때 Row, 좁을 때 Column을 반환하세요.

[과정 목차](../README.md)
