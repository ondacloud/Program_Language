# Where & Select & Aggregate

## 개념과 사용 시점

LINQ로 컬렉션을 필터링·변환·누적합니다. IEnumerable 기반 질의는 흔히 지연 실행됩니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **C# 과정 루트**입니다.

```powershell
dotnet run --project "22. Where & Select & Aggregate/Example.csproj"
```


## 코드 읽기

```csharp
int[] scores = { 60, 80, 90 };
var passed = scores.Where(n => n >= 70).Select(n => n + 1).ToArray();
Console.WriteLine(string.Join(",", passed));
Console.WriteLine(scores.Aggregate(0, (total, n) => total + n));
```

[실행 파일](Program.cs)

## 예상 결과

```text
81,91
230
```

## 주의사항

ToArray·ToList의 실행 시점과 원본 변경의 영향을 이해하세요. IQueryable의 DB 질의와 인메모리 LINQ는 실행 위치가 다릅니다.

## 연습

OrderBy와 GroupBy를 적용해 보세요.

[과정 목차](../README.md)
