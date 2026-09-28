# if & else

## 개념과 사용 시점

bool 조건에 따라 실행할 블록을 고릅니다. else if로 여러 범위를 순서대로 검사합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **C# 과정 루트**입니다.

```powershell
dotnet run --project "03. if & else/Example.csproj"
```


## 코드 읽기

```csharp
int score = 80;
if (score >= 90)
{
    Console.WriteLine("excellent");
}
else if (score >= 70)
{
    Console.WriteLine("pass");
}
else
{
    Console.WriteLine("retry");
}
```

[실행 파일](Program.cs)

## 예상 결과

```text
pass
```

## 주의사항

점수 범위가 겹치면 검사 순서가 결과에 영향을 줍니다. 숫자를 자동으로 bool처럼 사용하지 않습니다.

## 연습

100 초과를 invalid로 분기하세요.

[과정 목차](../README.md)
