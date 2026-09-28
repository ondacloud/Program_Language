# get & set

## 개념과 사용 시점

getter와 setter로 속성 접근의 계산·검증을 캡슐화합니다. 밑줄 이름은 라이브러리 범위의 비공개입니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **Dart 과정 루트**입니다.

```powershell
dart run "18. get & set/main.dart"
```


## 코드 읽기

```dart
class Account {
  int _balance = 0;
  int get balance => _balance;
  set balance(int value) {
    if (value < 0) throw ArgumentError('negative balance');
    _balance = value;
  }
}

void main() {
  final account = Account();
  account.balance = 20;
  print(account.balance);
}
```

[실행 파일](main.dart)

## 예상 결과

```text
20
```

## 주의사항

Dart의 _ 비공개는 클래스 단위가 아니라 라이브러리 단위입니다. setter가 비싼 부수 효과를 숨기지 않도록 설계하세요.

## 연습

음수 대입 시 ArgumentError를 잡아 보세요.

[과정 목차](../README.md)
