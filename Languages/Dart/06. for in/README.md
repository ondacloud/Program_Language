# for in

## 개념과 사용 시점

for-in은 Iterable의 원소를 차례대로 읽습니다. 인덱스 관리 없이 순회할 때 적합합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **Dart 과정 루트**입니다.

```powershell
dart run "06. for in/main.dart"
```


## 코드 읽기

```dart
void main() {
  for (final name in ['Mina', 'Jin']) {
    print(name);
  }
}
```

[실행 파일](main.dart)

## 예상 결과

```text
Mina
Jin
```

## 주의사항

순회 중 원본 컬렉션의 구조를 변경하면 오류가 날 수 있습니다. 변환 결과는 새 목록으로 만드세요.

## 연습

각 이름의 길이도 출력하세요.

[과정 목차](../README.md)
