# null safety & optional access

## 개념과 사용 시점

nullable 타입은 ?로 표시합니다. ?.는 null일 때 접근을 멈추고 ??는 대체값을 선택합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **Dart 과정 루트**입니다.

```powershell
dart run "16. null safety & optional access/main.dart"
```


## 코드 읽기

```dart
int lengthOrZero(String? name) => name?.length ?? 0;
void main() {
  print(lengthOrZero(null));
  print(lengthOrZero('Mina'));
}
```

[실행 파일](main.dart)

## 예상 결과

```text
0
4
```

## 주의사항

!는 검사 없이 non-null을 단언하므로 null일 때 예외가 납니다. 검사나 기본값으로 처리하는 편이 명확합니다.

## 연습

주소처럼 중첩된 nullable 객체를 안전하게 읽어 보세요.

[과정 목차](../README.md)
