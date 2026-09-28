# IAsyncEnumerable & yield return

## 개념과 사용 시점

비동기 스트림으로 여러 값을 순차적으로 전달합니다. 소비자는 await foreach로 읽습니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **C# 과정 루트**입니다.

```powershell
dotnet run --project "27. IAsyncEnumerable & yield return/Example.csproj"
```


## 코드 읽기

```csharp
await foreach (int value in Numbers())
{
    Console.WriteLine(value);
}

static async IAsyncEnumerable<int> Numbers()
{
    for (int i = 1; i <= 3; i++)
    {
        await Task.Delay(1);
        yield return i;
    }
}
```

[실행 파일](Program.cs)

## 예상 결과

```text
1
2
3
```

## 주의사항

스트림을 선언하는 시점과 열거하는 시점은 다릅니다. 취소·오류·자원 수명도 고려하세요.

## 연습

일반 IEnumerable의 yield return과 비교하세요.

[과정 목차](../README.md)
