# Dictionary & HashSet

## 개념과 사용 시점

Dictionary는 키와 값, HashSet은 중복 없는 원소를 관리합니다. 없는 키 조회는 TryGetValue로 처리할 수 있습니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **C# 과정 루트**입니다.

```powershell
dotnet run --project "14. Dictionary & HashSet/Example.csproj"
```


## 코드 읽기

```csharp
var scores = new Dictionary<string, int> { ["Mina"] = 80 };
Console.WriteLine(scores.TryGetValue("Mina", out int score) ? score : 0);
var teams = new HashSet<string> { "A", "A", "B" };
Console.WriteLine(teams.Count);
```

[실행 파일](Program.cs)

## 예상 결과

```text
80
2
```

## 주의사항

키 비교의 대소문자 정책이 필요하면 적절한 StringComparer를 지정하세요. 순서가 API 계약이면 정렬을 명시합니다.

## 연습

없는 키와 대소문자가 다른 이름을 조회하세요.

[과정 목차](../README.md)
