# final & const & null safety

## 개념과 사용 시점

final은 한 번 할당, const는 컴파일 시간 상수를 나타냅니다. nullable 타입은 ?로 표시하고 ??로 기본값을 선택합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Flutter 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "08. final & const & null safety/main.dart"
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
final String? name = null;
static const fallback = 'guest';



  @override
  Widget build(BuildContext context) => Scaffold(
    appBar: AppBar(title: const Text('Flutter lesson')),
    body: Padding(padding: const EdgeInsets.all(24), child: Text('Hello, ${name ?? fallback}')),
  );
}
```

[실행 파일](main.dart)

## 예상 결과

Hello, guest

## 주의사항

!는 null일 때 예외를 발생시킬 수 있습니다. final 컬렉션의 내용까지 불변인 것은 아닙니다.

## 연습

name에 Mina를 넣어 결과를 비교하세요.

[과정 목차](../README.md)
