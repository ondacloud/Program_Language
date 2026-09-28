# Future & async & await

## 개념과 사용 시점

Future는 나중에 완료될 단일 결과를 나타냅니다. async 함수에서 await로 완료를 기다립니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **Dart 과정 루트**입니다.

```powershell
dart run "26. Future & async & await/main.dart"
```


## 코드 읽기

```dart
Future<int> load(int value) async {
  await Future<void>.delayed(const Duration(milliseconds: 10));
  return value;
}

Future<void> main() async {
  final values = await Future.wait([load(80), load(90)]);
  print(values);
}
```

[실행 파일](main.dart)

## 예상 결과

```text
[80, 90]
```

## 주의사항

await는 CPU 작업을 자동으로 별도 isolate로 옮기지 않습니다. 실패 Future는 try/catch로 처리하세요.

## 연습

하나의 작업이 실패할 때 처리를 확인하세요.

[과정 목차](../README.md)
