# break & continue

## 개념과 사용 시점

break는 가장 가까운 반복을 종료하고 continue는 현재 회차의 나머지를 건너뜁니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **Dart 과정 루트**입니다.

```powershell
dart run "09. break & continue/main.dart"
```


## 코드 읽기

```dart
void main() {
  for (var n = 1; n <= 5; n++) {
    if (n == 2) continue;
    if (n == 4) break;
    print(n);
  }
}
```

[실행 파일](main.dart)

## 예상 결과

```text
1
3
```

## 주의사항

continue 뒤에 필요한 증가 코드가 놓여 있으면 while이 끝나지 않을 수 있습니다.

## 연습

짝수를 건너뛰고 1·3·5를 출력하세요.

[과정 목차](../README.md)
