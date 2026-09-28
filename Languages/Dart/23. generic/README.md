# generic

## 개념과 사용 시점

제네릭은 타입 관계를 유지한 채 클래스와 함수를 재사용하게 합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **Dart 과정 루트**입니다.

```powershell
dart run "23. generic/main.dart"
```


## 코드 읽기

```dart
class Box<T> {
  final T value;
  Box(this.value);
}

T? first<T>(List<T> items) => items.isEmpty ? null : items.first;
void main() {
  final box = Box<int>(80);
  print(box.value);
  print(first<String>([]));
}
```

[실행 파일](main.dart)

## 예상 결과

```text
80
null
```

## 주의사항

dynamic으로 바꾸면 컴파일 시 타입 검사가 약해집니다. 빈 컬렉션의 결과를 반환 타입에 반영하세요.

## 연습

두 타입을 묶는 Pair<A, B>를 만드세요.

[과정 목차](../README.md)
