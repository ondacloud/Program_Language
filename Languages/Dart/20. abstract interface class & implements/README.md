# abstract interface class & implements

## 개념과 사용 시점

인터페이스 계약을 선언하고 implements로 필요한 멤버를 구현합니다. 다른 구현으로 교체 가능한 경계를 만들 때 사용합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **Dart 과정 루트**입니다.

```powershell
dart run "20. abstract interface class & implements/main.dart"
```


## 코드 읽기

```dart
abstract interface class Greeter {
  String greet(String name);
}

class Friendly implements Greeter {
  @override
  String greet(String name) => 'Hello, $name';
}

void main() {
  Greeter greeter = Friendly();
  print(greeter.greet('Mina'));
}
```

[실행 파일](main.dart)

## 예상 결과

```text
Hello, Mina
```

## 주의사항

implements는 기존 메서드 구현을 상속하지 않습니다. 계약의 모든 필요한 멤버를 구현하세요.

## 연습

다른 언어로 인사하는 구현을 추가하세요.

[과정 목차](../README.md)
