# Navigator.push & Navigator.pop

## 개념과 사용 시점

Navigator로 새 화면을 스택에 넣고 pop으로 이전 화면으로 돌아옵니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Flutter 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "16. Navigator.push & Navigator.pop/main.dart"
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
    body: Padding(padding: const EdgeInsets.all(24), child: ElevatedButton(onPressed: () => Navigator.of(context).push(MaterialPageRoute<void>(builder: (_) => Scaffold(appBar: AppBar(title: const Text('Details')), body: Center(child: ElevatedButton(onPressed: () => Navigator.of(context).pop(), child: const Text('Back')))))), child: const Text('Open details'))),
  );
}
```

[실행 파일](main.dart)

## 예상 결과

상세 화면으로 이동하고 Back으로 복귀합니다.

## 주의사항

복잡한 웹 URL·딥링크는 Router 계열이나 라우팅 패키지를 검토하세요. 간단한 스택 탐색과 주소 기반 라우팅은 다릅니다.

## 연습

pop 결과를 await해 이전 화면에 표시하세요.

[과정 목차](../README.md)
