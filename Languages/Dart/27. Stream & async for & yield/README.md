# Stream & async for & yield

## 개념과 사용 시점

Stream은 시간에 따라 전달되는 여러 값을 나타냅니다. async*와 yield로 만들고 await for로 소비합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **Dart 과정 루트**입니다.

```powershell
dart run "27. Stream & async for & yield/main.dart"
```


## 코드 읽기

```dart
Stream<int> numbers() async* {
  for (var i = 1; i <= 3; i++) {
    yield i;
  }
}

Future<void> main() async {
  await for (final value in numbers()) {
    print(value);
  }
}
```

[실행 파일](main.dart)

## 예상 결과

```text
1
2
3
```

## 주의사항

단일 구독과 broadcast Stream은 구독 방식이 다릅니다. listen을 쓰면 구독 취소 책임도 고려하세요.

## 연습

오류 이벤트나 조기 종료를 처리하세요.

[과정 목차](../README.md)
