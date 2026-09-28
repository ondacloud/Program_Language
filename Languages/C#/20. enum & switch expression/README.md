# enum & switch expression

## 개념과 사용 시점

enum으로 상태 집합을 표현하고 switch 식으로 상태별 값을 계산합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **C# 과정 루트**입니다.

```powershell
dotnet run --project "20. enum & switch expression/Example.csproj"
```


## 코드 읽기

```csharp
Status state = Status.Ready;
string action = state switch
{
    Status.Ready => "go",
    Status.Busy => "wait",
    _ => "unknown"
};
Console.WriteLine(action);

enum Status { Ready, Busy }
```

[실행 파일](Program.cs)

## 예상 결과

```text
go
```

## 주의사항

enum은 정의되지 않은 숫자 값으로도 변환될 수 있습니다. 외부 입력 검증을 생략하지 마세요.

## 연습

Failed 상태를 추가하세요.

[과정 목차](../README.md)
