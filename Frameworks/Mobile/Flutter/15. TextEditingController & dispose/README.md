# TextEditingController & dispose

## 개념과 사용 시점

컨트롤러로 입력 텍스트를 프로그램에서 읽거나 변경할 수 있습니다. 소유한 컨트롤러는 dispose에서 정리합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Flutter 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "15. TextEditingController & dispose/main.dart"
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
final controller = TextEditingController(text: 'Mina');


@override void dispose() { controller.dispose(); super.dispose(); }
  @override
  Widget build(BuildContext context) => Scaffold(
    appBar: AppBar(title: const Text('Flutter lesson')),
    body: Padding(padding: const EdgeInsets.all(24), child: Column(children: [TextField(controller: controller, decoration: const InputDecoration(labelText: 'Name')), ElevatedButton(onPressed: controller.clear, child: const Text('Clear'))])),
  );
}
```

[실행 파일](main.dart)

## 예상 결과

기본 Mina가 표시되고 Clear로 비워집니다.

## 주의사항

컨트롤러를 build 안에서 매번 생성하지 마세요. 외부 소유 컨트롤러의 정리 책임도 구분합니다.

## 연습

선택 범위나 커서 위치를 바꿔 보세요.

[과정 목차](../README.md)
