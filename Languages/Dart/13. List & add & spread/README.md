# List & add & spread

## 개념과 사용 시점

List는 순서가 있는 컬렉션입니다. add로 추가하고 spread로 다른 Iterable의 원소를 펼칠 수 있습니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **Dart 과정 루트**입니다.

```powershell
dart run "13. List & add & spread/main.dart"
```


## 코드 읽기

```dart
void main() {
  final scores = <int>[60, 80];
  scores.add(90);
  final copied = [0, ...scores];
  print(copied);
}
```

[실행 파일](main.dart)

## 예상 결과

```text
[0, 60, 80, 90]
```

## 주의사항

spread는 얕은 복사입니다. 객체 원소의 내부 상태가 독립 복사되는 것은 아닙니다.

## 연습

컬렉션 if로 선택적 항목을 추가하세요.

[과정 목차](../README.md)
