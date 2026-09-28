# StatelessWidget

## 개념과 사용 시점

입력값만으로 화면을 만드는 재사용 위젯에는 StatelessWidget을 사용합니다. 부모의 변경으로 다시 build될 수 있습니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Flutter 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "10. StatelessWidget/main.dart"
# 웹 브라우저에서 실행합니다. 첫 실행에는 Flutter SDK가 필요합니다.
```

## 코드 읽기

```dart
import 'package:flutter/material.dart';
class StudentCard extends StatelessWidget { const StudentCard({super.key, required this.name}); final String name; @override Widget build(BuildContext context) => Text('Student: $name'); }
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
    body: Padding(padding: const EdgeInsets.all(24), child: const StudentCard(name: 'Mina')),
  );
}
```

[실행 파일](main.dart)

## 예상 결과

Student: Mina

## 주의사항

StatelessWidget도 다시 build될 수 있습니다. 인스턴스 필드는 final로 두고 외부 변경은 새 입력으로 전달하세요.

## 연습

점수 매개변수를 추가하세요.

[과정 목차](../README.md)
