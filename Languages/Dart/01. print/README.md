# print

## 개념과 사용 시점

print는 값을 문자열로 변환하여 줄바꿈과 함께 콘솔에 표시합니다. 문자열 보간으로 값을 문장에 넣을 수 있습니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **Dart 과정 루트**입니다.

```powershell
dart run "01. print/main.dart"
```


## 코드 읽기

```dart
void main() {
  final name = 'Mina';
  final score = 80;
  print('Hello, $name');
  print('next: ${score + 1}');
}
```

[실행 파일](main.dart)

## 예상 결과

```text
Hello, Mina
next: 81
```

## 주의사항

Flutter의 화면 글자 출력은 Text 위젯입니다. print는 콘솔 출력이며 UI 자체를 만들지 않습니다.

## 연습

여러 줄 문자열로 자기소개를 출력하세요.

[과정 목차](../README.md)
