# var & final & const

## 개념과 사용 시점

var는 타입을 추론하고 final은 재할당을 막으며 const는 컴파일 시간 상수를 선언합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **Dart 과정 루트**입니다.

```powershell
dart run "10. var & final & const/main.dart"
```


## 코드 읽기

```dart
void main() {
  var score = 80;
  score += 5;
  final names = ['Mina'];
  names.add('Jin');
  const limit = 100;
  print('$score / $limit');
  print(names.join(','));
}
```

[실행 파일](main.dart)

## 예상 결과

```text
85 / 100
Mina,Jin
```

## 주의사항

final 목록은 참조 재할당만 막습니다. const 목록은 내용도 수정할 수 없습니다.

## 연습

final 목록을 const로 바꾸고 수정 오류를 확인하세요.

[과정 목차](../README.md)
