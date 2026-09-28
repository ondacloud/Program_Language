# while

## 개념과 사용 시점

while은 매 반복 전에 조건을 검사합니다. 조건이 처음부터 거짓이면 실행하지 않습니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **Dart 과정 루트**입니다.

```powershell
dart run "07. while/main.dart"
```


## 코드 읽기

```dart
void main() {
  var count = 3;
  while (count > 0) {
    print(count);
    count--;
  }
}
```

[실행 파일](main.dart)

## 예상 결과

```text
3
2
1
```

## 주의사항

종료 조건에 영향을 주는 상태가 갱신되는지 확인하세요.

## 연습

초기 count를 0으로 바꿔 보세요.

[과정 목차](../README.md)
