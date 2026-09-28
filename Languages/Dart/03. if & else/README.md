# if & else

## 개념과 사용 시점

if는 bool 조건에 따라 분기합니다. else if로 여러 범위를 순서대로 검사할 수 있습니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **Dart 과정 루트**입니다.

```powershell
dart run "03. if & else/main.dart"
```


## 코드 읽기

```dart
void main() {
  final score = 80;
  if (score >= 90) {
    print('excellent');
  } else if (score >= 70) {
    print('pass');
  } else {
    print('retry');
  }
}
```

[실행 파일](main.dart)

## 예상 결과

```text
pass
```

## 주의사항

Dart 조건은 bool이어야 합니다. 숫자 0이나 빈 문자열을 자동으로 거짓처럼 사용할 수 없습니다.

## 연습

0~100 밖의 점수는 invalid로 처리하세요.

[과정 목차](../README.md)
