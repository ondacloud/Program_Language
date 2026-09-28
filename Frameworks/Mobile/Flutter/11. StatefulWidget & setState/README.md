# StatefulWidget & setState

## 개념과 사용 시점

State는 위젯 구성과 분리된 변경 가능한 상태입니다. setState 콜백에서 값을 바꾸면 UI가 다시 build됩니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Flutter 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "11. StatefulWidget & setState/main.dart"
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
int count = 0;



  @override
  Widget build(BuildContext context) => Scaffold(
    appBar: AppBar(title: const Text('Flutter lesson')),
    body: Padding(padding: const EdgeInsets.all(24), child: ElevatedButton(onPressed: () => setState(() => count++), child: Text('Count: $count'))),
  );
}
```

[실행 파일](main.dart)

## 예상 결과

클릭마다 count 증가

## 주의사항

setState 콜백은 동기적으로 실행하세요. async 작업을 먼저 await한 뒤 mounted를 확인하고 상태를 변경합니다.

## 연습

감소·초기화 버튼을 추가하세요.

[과정 목차](../README.md)
