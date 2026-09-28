# Theme & ThemeData

## 개념과 사용 시점

Theme은 하위 위젯에 공통 색·글꼴 같은 디자인 설정을 제공합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Flutter 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "19. Theme & ThemeData/main.dart"
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
    body: Padding(padding: const EdgeInsets.all(24), child: Theme(data: ThemeData(colorSchemeSeed: Colors.teal, useMaterial3: true), child: const Card(child: Padding(padding: EdgeInsets.all(16), child: Text('Themed card'))))),
  );
}
```

[실행 파일](main.dart)

## 예상 결과

테마를 적용한 카드

## 주의사항

MaterialApp 전체 테마와 일부 영역의 Theme을 구분하세요. 텍스트 확대·다크 모드·대비도 확인합니다.

## 연습

밝은 테마와 어두운 테마를 전환하세요.

[과정 목차](../README.md)
