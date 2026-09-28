# Row & Column & Expanded

## 개념과 사용 시점

Row와 Column은 가로·세로 레이아웃이고 Expanded는 남은 주축 공간을 나눠 가집니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Flutter 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "12. Row & Column & Expanded/main.dart"
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
    body: Padding(padding: const EdgeInsets.all(24), child: Row(children: [Expanded(child: Container(color: Colors.blue.shade100, child: const Text('Left'))), const SizedBox(width: 12), Expanded(child: Container(color: Colors.green.shade100, child: const Text('Right')))])),
  );
}
```

[실행 파일](main.dart)

## 예상 결과

가로 두 영역이 남은 너비를 나눠 차지합니다.

## 주의사항

제약이 무한한 축에서 Expanded를 사용하면 레이아웃 오류가 생길 수 있습니다. 부모 제약을 먼저 이해하세요.

## 연습

flex를 1과 2로 나눠 보세요.

[과정 목차](../README.md)
