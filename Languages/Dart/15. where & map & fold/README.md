# where & map & fold

## 개념과 사용 시점

where로 선택하고 map으로 변환하며 fold로 누적합니다. Iterable의 지연 평가와 결과 목록 생성을 구분하세요.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **Dart 과정 루트**입니다.

```powershell
dart run "15. where & map & fold/main.dart"
```


## 코드 읽기

```dart
void main() {
  final scores = [60, 80, 90];
  print(scores.where((n) => n >= 70).map((n) => n + 1).toList());
  print(scores.fold<int>(0, (total, n) => total + n));
}
```

[실행 파일](main.dart)

## 예상 결과

```text
[81, 91]
230
```

## 주의사항

where·map 결과가 필요할 때 계산됩니다. 같은 결과를 반복 사용할 경우 toList 시점을 생각하세요.

## 연습

평균 점수를 계산하세요.

[과정 목차](../README.md)
