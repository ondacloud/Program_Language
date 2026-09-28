# Form & TextFormField & validator

## 개념과 사용 시점

Form과 validator로 입력 검증 결과를 UI에 표시합니다. 서버 저장 시 서버에서도 다시 검증해야 합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Flutter 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "14. Form & TextFormField & validator/main.dart"
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
final formKey = GlobalKey<FormState>();
String message = '';



  @override
  Widget build(BuildContext context) => Scaffold(
    appBar: AppBar(title: const Text('Flutter lesson')),
    body: Padding(padding: const EdgeInsets.all(24), child: Form(key: formKey, child: Column(children: [TextFormField(decoration: const InputDecoration(labelText: 'Name'), validator: (value) => value == null || value.trim().isEmpty ? 'Name required' : null), ElevatedButton(onPressed: () { if (formKey.currentState!.validate()) setState(() => message = 'valid'); }, child: const Text('Validate')), Text(message)]))),
  );
}
```

[실행 파일](main.dart)

## 예상 결과

빈 입력 제출 시 Name required, 유효한 입력 시 valid

## 주의사항

GlobalKey는 build마다 새로 만들지 않고 State에 보관합니다. 예제의 !는 Form이 연결된 버튼 콜백에서만 사용합니다.

## 연습

최소 두 글자 조건을 추가하세요.

[과정 목차](../README.md)
