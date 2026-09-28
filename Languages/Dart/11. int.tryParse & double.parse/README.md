# int.tryParse & double.parse

## 개념과 사용 시점

문자열 입력을 숫자로 변환합니다. tryParse는 실패 시 null, parse는 잘못된 형식에서 예외를 반환하는 대신 던집니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **Dart 과정 루트**입니다.

```powershell
dart run "11. int.tryParse & double.parse/main.dart"
```


## 코드 읽기

```dart
void main() {
  print(int.tryParse('80'));
  print(int.tryParse('wrong') ?? -1);
  print(double.parse('3.5'));
}
```

[실행 파일](main.dart)

## 예상 결과

```text
80
-1
3.5
```

## 주의사항

숫자 변환 성공과 허용 범위 충족은 별도입니다. 입력이 외부에서 왔다면 둘 다 확인하세요.

## 연습

0~100만 허용하는 함수를 만드세요.

[과정 목차](../README.md)
