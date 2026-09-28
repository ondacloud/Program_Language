# stdin.readLineSync

## 개념과 사용 시점

dart:io의 stdin에서 한 줄을 읽습니다. 입력 종료 시 null을 반환하므로 빈 입력과 함께 처리해야 합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **Dart 과정 루트**입니다.

```powershell
dart run "02. stdin.readLineSync/main.dart"
```

입력 예: `Mina`를 입력한 뒤 Enter를 누르세요. [입력 파일](input.txt)도 제공합니다.

## 코드 읽기

```dart
import 'dart:io';

void main() {
  final name = stdin.readLineSync()?.trim();
  print('Hello, ${name == null || name.isEmpty ? 'guest' : name}');
}
```

[실행 파일](main.dart)

## 예상 결과

```text
Hello, Mina
```

## 주의사항

동기 입력은 입력이 올 때까지 현재 isolate를 막습니다. dart:io 콘솔 예제를 웹 브라우저에서 그대로 실행할 수는 없습니다.

## 연습

빈 줄과 EOF에서는 guest가 나오는지 확인하세요.

[과정 목차](../README.md)
