# switch & case

## 개념과 사용 시점

switch 문은 값이나 패턴에 맞는 분기를 실행합니다. Dart 3의 비어 있지 않은 case는 암묵적으로 다음 case로 흐르지 않습니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **Dart 과정 루트**입니다.

```powershell
dart run "04. switch & case/main.dart"
```


## 코드 읽기

```dart
void main() {
  final command = 'save';
  switch (command) {
    case 'save':
      print('saved');
    case 'load':
      print('loaded');
    default:
      print('unknown');
  }
}
```

[실행 파일](main.dart)

## 예상 결과

```text
saved
```

## 주의사항

C 계열의 fall-through 동작을 그대로 가정하지 마세요. 여러 경우의 공통 처리를 명시합니다.

## 연습

delete 분기를 추가하세요.

[과정 목차](../README.md)
