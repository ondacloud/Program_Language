# Future & async & await

## 개념과 사용 시점

Future는 나중에 완료되는 값입니다. 비동기 작업 완료 후 위젯이 살아 있을 때만 상태를 갱신합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Flutter 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "17. Future & async & await/main.dart"
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
String message = 'ready';
Future<void> load() async { setState(() => message = 'loading'); await Future<void>.delayed(const Duration(milliseconds: 300)); if (!mounted) return; setState(() => message = 'done'); }


  @override
  Widget build(BuildContext context) => Scaffold(
    appBar: AppBar(title: const Text('Flutter lesson')),
    body: Padding(padding: const EdgeInsets.all(24), child: Column(children: [ElevatedButton(onPressed: load, child: const Text('Load')), Text(message)])),
  );
}
```

[실행 파일](main.dart)

## 예상 결과

Load를 누르면 loading 후 약 0.3초 뒤 done

## 주의사항

네트워크 실패는 try/catch로 처리하고 중복 요청·오래된 결과에 대한 정책을 정하세요. mounted 확인은 폐기된 State 갱신을 막습니다.

## 연습

로딩 중 버튼을 비활성화하세요.

[과정 목차](../README.md)
