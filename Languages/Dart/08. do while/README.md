# do while

## 개념과 사용 시점

do-while은 본문을 먼저 실행하고 조건을 검사하므로 최소 한 번 실행합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **Dart 과정 루트**입니다.

```powershell
dart run "08. do while/main.dart"
```


## 코드 읽기

```dart
void main() {
  var count = 0;
  do {
    print(count);
    count++;
  } while (count < 0);
}
```

[실행 파일](main.dart)

## 예상 결과

```text
0
```

## 주의사항

마지막 while 뒤 세미콜론이 필요합니다. 조건이 거짓이어도 첫 실행은 발생합니다.

## 연습

1부터 3까지 출력하도록 바꾸세요.

[과정 목차](../README.md)
