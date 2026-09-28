# function & return

## 개념과 사용 시점

함수는 매개변수를 받아 결과를 반환합니다. 이름 있는 매개변수로 호출의 의미를 드러낼 수 있습니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **Dart 과정 루트**입니다.

```powershell
dart run "12. function & return/main.dart"
```


## 코드 읽기

```dart
String greet({required String name, String prefix = 'Hi'}) => '$prefix, $name';
int add(int a, int b) {
  return a + b;
}

void main() {
  print(greet(name: 'Mina'));
  print(add(2, 3));
}
```

[실행 파일](main.dart)

## 예상 결과

```text
Hi, Mina
5
```

## 주의사항

required는 이름 있는 인자의 필수 여부입니다. 타입의 null 허용 여부와는 별개입니다.

## 연습

선택적 prefix 인자를 바꿔 호출하세요.

[과정 목차](../README.md)
