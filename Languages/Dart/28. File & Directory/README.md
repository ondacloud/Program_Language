# File & Directory

## 개념과 사용 시점

dart:io로 파일을 읽고 씁니다. 예제는 시스템 임시 디렉터리를 만들고 사용 후 제거합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **Dart 과정 루트**입니다.

```powershell
dart run "28. File & Directory/main.dart"
```


## 코드 읽기

```dart
import 'dart:io';

Future<void> main() async {
  final dir = await Directory.systemTemp.createTemp('dart-course-');
  try {
    final file = File('${dir.path}/note.txt');
    await file.writeAsString('Hello Dart');
    print(await file.readAsString());
  } finally {
    await dir.delete(recursive: true);
  }
}
```

[실행 파일](main.dart)

## 예상 결과

```text
Hello Dart
```

## 주의사항

파일 경로는 외부 입력을 그대로 신뢰하지 마세요. 이 예제는 직접 만든 임시 폴더만 정리합니다.

## 연습

두 줄을 저장한 뒤 readAsLines로 읽으세요.

[과정 목차](../README.md)
