# Map & Set

## 개념과 사용 시점

Map은 키와 값, Set은 중복 없는 원소를 저장합니다. 없는 키 조회 결과는 nullable입니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **Dart 과정 루트**입니다.

```powershell
dart run "14. Map & Set/main.dart"
```


## 코드 읽기

```dart
void main() {
  final scores = <String, int>{'Mina': 80};
  final teams = <String>{'A', 'B'};
  teams.add('A');
  print(scores['Mina']);
  print(scores['Jin'] ?? 0);
  print(teams.length);
}
```

[실행 파일](main.dart)

## 예상 결과

```text
80
0
2
```

## 주의사항

빈 {}는 기본적으로 Map입니다. 빈 Set은 <String>{}처럼 타입을 명시하세요.

## 연습

키 존재 여부를 containsKey로 검사하세요.

[과정 목차](../README.md)
