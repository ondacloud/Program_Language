# AnimatedContainer

## 개념과 사용 시점

AnimatedContainer는 크기·색 같은 속성 변화 사이를 암시적으로 애니메이션 처리합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Flutter 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "21. AnimatedContainer/main.dart"
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
bool expanded = false;



  @override
  Widget build(BuildContext context) => Scaffold(
    appBar: AppBar(title: const Text('Flutter lesson')),
    body: Padding(padding: const EdgeInsets.all(24), child: Column(children: [ElevatedButton(onPressed: () => setState(() => expanded = !expanded), child: const Text('Animate')), AnimatedContainer(duration: const Duration(milliseconds: 250), width: expanded ? 180 : 100, height: 100, color: expanded ? Colors.teal : Colors.blue)])),
  );
}
```

[실행 파일](main.dart)

## 예상 결과

버튼을 누르면 사각형 너비와 색이 전환됩니다.

## 주의사항

복잡한 애니메이션의 AnimationController는 dispose가 필요합니다. 움직임을 줄이는 접근성 설정도 고려하세요.

## 연습

모서리 반경 변화를 추가하세요.

[과정 목차](../README.md)
