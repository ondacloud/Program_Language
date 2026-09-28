# import & export

## 개념과 사용 시점

라이브러리 경계를 import·export로 구성합니다. show·hide·as로 공개 이름과 충돌을 관리할 수 있습니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **Dart 과정 루트**입니다.

```powershell
dart run "29. import & export/main.dart"
```


## 코드 읽기

```dart
import 'math.dart' as math;

void main() {
  print(math.sum(2, 3));
}
```

[실행 파일](main.dart)

## 예상 결과

```text
5
```

## 주의사항

Dart 라이브러리의 _ 이름은 다른 라이브러리에서 접근할 수 없습니다. 공개 API를 필요한 만큼만 노출하세요.

## 연습

곱셈 함수를 추가해 export하세요.

[과정 목차](../README.md)
