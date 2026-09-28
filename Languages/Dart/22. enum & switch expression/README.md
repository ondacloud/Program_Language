# enum & switch expression

## 개념과 사용 시점

enum은 유한한 상태 집합을 나타내고 switch 식으로 상태별 값을 계산합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **Dart 과정 루트**입니다.

```powershell
dart run "22. enum & switch expression/main.dart"
```


## 코드 읽기

```dart
enum Status { ready, busy }

void main() {
  final state = Status.ready;
  print(switch (state) { Status.ready => 'go', Status.busy => 'wait' });
}
```

[실행 파일](main.dart)

## 예상 결과

```text
go
```

## 주의사항

enum의 경우를 모두 처리하면 새 상태 추가 시 누락된 분기를 검사하기 쉽습니다.

## 연습

failed 상태를 추가하고 분기도 갱신하세요.

[과정 목차](../README.md)
