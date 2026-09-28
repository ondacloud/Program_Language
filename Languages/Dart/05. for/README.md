# for

## 개념과 사용 시점

for는 초기화·조건·갱신으로 반복 횟수를 제어합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **Dart 과정 루트**입니다.

```powershell
dart run "05. for/main.dart"
```


## 코드 읽기

```dart
void main() {
  var sum = 0;
  for (var i = 1; i <= 3; i++) {
    sum += i;
  }
  print(sum);
}
```

[실행 파일](main.dart)

## 예상 결과

```text
6
```

## 주의사항

<=와 <의 차이가 반복 횟수를 바꿉니다. 인덱스가 필요 없으면 for-in을 검토하세요.

## 연습

1부터 10까지 합계를 구하세요.

[과정 목차](../README.md)
