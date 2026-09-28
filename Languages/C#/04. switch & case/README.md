# switch & case

## 개념과 사용 시점

switch는 값·패턴에 따라 여러 분기를 선택합니다. 일반 case에서는 break·return 같은 명확한 종료가 필요합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **C# 과정 루트**입니다.

```powershell
dotnet run --project "04. switch & case/Example.csproj"
```


## 코드 읽기

```csharp
string command = "save";
switch (command)
{
    case "save":
        Console.WriteLine("saved");
        break;
    case "load":
        Console.WriteLine("loaded");
        break;
    default:
        Console.WriteLine("unknown");
        break;
}
```

[실행 파일](Program.cs)

## 예상 결과

```text
saved
```

## 주의사항

switch 식으로 값을 계산하는 문법과 switch 문을 구분하세요. 일반적으로 다음 case로 자동 실행이 이어지지 않습니다.

## 연습

switch 식으로 바꿔 동일한 결과를 만드세요.

[과정 목차](../README.md)
