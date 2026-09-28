# Task & async & await

## 개념과 사용 시점

Task는 비동기 작업의 완료를 표현합니다. await로 결과를 기다리고 독립 작업은 WhenAll로 함께 기다릴 수 있습니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **C# 과정 루트**입니다.

```powershell
dotnet run --project "26. Task & async & await/Example.csproj"
```


## 코드 읽기

```csharp
int[] scores = await Task.WhenAll(Load(80), Load(90));
Console.WriteLine(string.Join(",", scores));

static async Task<int> Load(int score)
{
    await Task.Delay(10);
    return score;
}
```

[실행 파일](Program.cs)

## 예상 결과

```text
80,90
```

## 주의사항

async가 자동으로 새 스레드를 만든다는 뜻은 아닙니다. .Result나 .Wait로 비동기 흐름을 막기보다 await를 사용하세요.

## 연습

CancellationToken을 함수에 전달해 취소를 지원하세요.

[과정 목차](../README.md)
