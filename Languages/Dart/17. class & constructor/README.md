# class & constructor

## 개념과 사용 시점

클래스는 데이터와 동작을 묶습니다. this 매개변수로 필드를 초기화하고 named constructor로 생성 방식을 구분할 수 있습니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **Dart 과정 루트**입니다.

```powershell
dart run "17. class & constructor/main.dart"
```


## 코드 읽기

```dart
class Student {
  final String name;
  final int score;
  Student(this.name, this.score);
  Student.guest() : this('guest', 0);
  String summary() => '$name: $score';
}

void main() {
  final student = Student('Mina', 80);
  print(student.summary());
  print(Student.guest().summary());
}
```

[실행 파일](main.dart)

## 예상 결과

```text
Mina: 80
guest: 0
```

## 주의사항

클래스 이름 앞의 new는 생략할 수 있습니다. 생성 시 불변 조건을 확인하는 책임을 정하세요.

## 연습

음수 점수를 거절하도록 생성자를 수정하세요.

[과정 목차](../README.md)
