# mixin & with

## 개념과 사용 시점

mixin은 여러 클래스에 공통 동작을 조합하는 방법입니다. with로 기능을 포함합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **Dart 과정 루트**입니다.

```powershell
dart run "21. mixin & with/main.dart"
```


## 코드 읽기

```dart
mixin Labelled {
  String label(String message) => '[course] $message';
}

class Worker with Labelled {}

void main() {
  final worker = Worker();
  print(worker.label('ready'));
}
```

[실행 파일](main.dart)

## 예상 결과

```text
[course] ready
```

## 주의사항

mixin이 기대하는 수신 타입을 제한해야 한다면 on 제약을 검토하세요. 기능 간 이름 충돌과 적용 순서를 이해합니다.

## 연습

로깅 대신 시간 측정 기능을 조합해 보세요.

[과정 목차](../README.md)
