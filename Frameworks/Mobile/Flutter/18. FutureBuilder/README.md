# FutureBuilder

## 개념과 사용 시점

FutureBuilder는 Future의 대기·실패·완료 상태를 바탕으로 UI를 선택합니다. Future는 build 밖에서 준비합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Flutter 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "18. FutureBuilder/main.dart"
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
late final Future<String> result;

@override void initState() { super.initState(); result = Future<String>.delayed(const Duration(milliseconds: 300), () => 'Mina'); }

  @override
  Widget build(BuildContext context) => Scaffold(
    appBar: AppBar(title: const Text('Flutter lesson')),
    body: Padding(padding: const EdgeInsets.all(24), child: FutureBuilder<String>(future: result, builder: (context, snapshot) { if (snapshot.hasError) return const Text('failed'); if (snapshot.connectionState != ConnectionState.done) return const CircularProgressIndicator(); return Text(snapshot.data ?? 'empty'); })),
  );
}
```

[실행 파일](main.dart)

## 예상 결과

잠시 로딩 표시 후 Mina

## 주의사항

build마다 새 Future를 만들면 부모 재렌더 때 작업이 반복될 수 있습니다. 실패 상태와 데이터 없음 상태를 구분하세요.

## 연습

실패 Future를 반환하여 오류 UI를 확인하세요.

[과정 목차](../README.md)
