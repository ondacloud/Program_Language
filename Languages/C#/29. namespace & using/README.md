# namespace & using

## 개념과 사용 시점

namespace는 타입 이름의 범위를 나누고 using으로 긴 이름을 줄여 참조합니다. 파일 분리와 공개 범위를 함께 설계합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **C# 과정 루트**입니다.

```powershell
dotnet run --project "29. namespace & using/Example.csproj"
```


## 코드 읽기

```csharp
using Course.Math;
Console.WriteLine(Calculator.Sum(2, 3));
```

[실행 파일](Program.cs)

## 예상 결과

```text
5
```

## 주의사항

using 지시문과 자원 해제용 using 선언은 다른 기능입니다. C#의 # 문자는 Markdown 링크에서 %23으로 인코딩해야 합니다.

## 연습

곱셈 메서드를 별도 파일에 추가하세요.

[과정 목차](../README.md)
