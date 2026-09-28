# try & on & catch & finally

## 개념과 사용 시점

예외를 특정 타입으로 잡고 finally에서 정리합니다. catch의 두 번째 인자로 스택 추적을 받을 수 있습니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **Dart 과정 루트**입니다.

```powershell
dart run "25. try & on & catch & finally/main.dart"
```


## 코드 읽기

```dart
void main() {
  try {
    int.parse('wrong');
  } on FormatException {
    print('invalid number');
  } finally {
    print('done');
  }
}
```

[실행 파일](main.dart)

## 예상 결과

```text
invalid number
done
```

## 주의사항

예외를 조용히 무시하지 마세요. 처리 가능한 오류와 상위로 전달할 오류를 구분합니다.

## 연습

throw FormatException을 직접 발생시켜 보세요.

[과정 목차](../README.md)
