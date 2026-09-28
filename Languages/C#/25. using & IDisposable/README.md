# using & IDisposable

## 개념과 사용 시점

using 선언은 스코프가 끝날 때 IDisposable.Dispose를 호출하여 자원을 정리합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **C# 과정 루트**입니다.

```powershell
dotnet run --project "25. using & IDisposable/Example.csproj"
```


## 코드 읽기

```csharp
{
    using var resource = new Resource();
    Console.WriteLine("using");
}

class Resource : IDisposable
{
    public void Dispose() => Console.WriteLine("disposed");
}
```

[실행 파일](Program.cs)

## 예상 결과

```text
using
disposed
```

## 주의사항

가비지 컬렉션과 자원 해제 시점은 다릅니다. 비동기 정리에는 IAsyncDisposable과 await using을 사용합니다.

## 연습

본문에서 예외가 발생해도 Dispose가 호출되는지 확인하세요.

[과정 목차](../README.md)
