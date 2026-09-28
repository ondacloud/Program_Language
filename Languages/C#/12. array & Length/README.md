# array & Length

## 개념과 사용 시점

배열은 길이가 고정된 같은 타입 원소의 모음입니다. 인덱스는 0부터 시작합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **C# 과정 루트**입니다.

```powershell
dotnet run --project "12. array & Length/Example.csproj"
```


## 코드 읽기

```csharp
int[] scores = { 60, 80, 90 };
scores[0] = 70;
Console.WriteLine(scores.Length);
Console.WriteLine(string.Join(",", scores));
```

[실행 파일](Program.cs)

## 예상 결과

```text
3
70,80,90
```

## 주의사항

없는 인덱스에 접근하면 IndexOutOfRangeException이 납니다. 길이를 바꿀 필요가 있으면 List를 검토하세요.

## 연습

마지막 원소를 ^1 인덱스로 읽어 보세요.

[과정 목차](../README.md)
