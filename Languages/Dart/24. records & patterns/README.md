# records & patterns

## 개념과 사용 시점

record는 이름 없는 복합 값을 묶고 패턴으로 값을 분해합니다. 간단한 다중 반환값에 적합합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **Dart 과정 루트**입니다.

```powershell
dart run "24. records & patterns/main.dart"
```


## 코드 읽기

```dart
void main() {
  final student = (name: 'Mina', score: 80);
  final (:name, :score) = student;
  print('$name: $score');
}
```

[실행 파일](main.dart)

## 예상 결과

```text
Mina: 80
```

## 주의사항

record 필드 참조는 불변이지만 내부에 가변 객체가 있으면 그 객체까지 불변은 아닙니다. 업무 동작이 많으면 클래스를 검토하세요.

## 연습

위치 필드 record (x, y)를 분해하세요.

[과정 목차](../README.md)
