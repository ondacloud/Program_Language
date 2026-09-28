# extends & override

## 개념과 사용 시점

extends는 구현 상속을, override는 상위 동작을 재정의한다는 의도를 표현합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **Dart 과정 루트**입니다.

```powershell
dart run "19. extends & override/main.dart"
```


## 코드 읽기

```dart
class Animal {
  String speak() => 'sound';
}

class Dog extends Animal {
  @override
  String speak() => 'woof';
}

void main() {
  Animal animal = Dog();
  print(animal.speak());
}
```

[실행 파일](main.dart)

## 예상 결과

```text
woof
```

## 주의사항

Dart는 클래스의 단일 상속을 사용합니다. 재사용 목적만으로 깊은 상속 계층을 만들기보다 조합도 고려하세요.

## 연습

Cat 클래스를 추가하세요.

[과정 목차](../README.md)
