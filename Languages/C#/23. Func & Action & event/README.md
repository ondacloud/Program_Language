# Func & Action & event

## 개념과 사용 시점

Func는 반환값 있는 함수, Action은 반환값 없는 동작을 나타냅니다. event는 구독자에게 발생 사실을 알립니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **C# 과정 루트**입니다.

```powershell
dotnet run --project "23. Func & Action & event/Example.csproj"
```


## 코드 읽기

```csharp
Func<int, int> doubleValue = n => n * 2;
Console.WriteLine(doubleValue(3));
var counter = new Counter();
counter.Changed += value => Console.WriteLine($"changed: {value}");
counter.Increase();

class Counter
{
    private int value;
    public event Action<int>? Changed;
    public void Increase()
    {
        value++;
        Changed?.Invoke(value);
    }
}
```

[실행 파일](Program.cs)

## 예상 결과

```text
6
changed: 1
```

## 주의사항

구독 수명이 발행자보다 짧으면 구독 해제로 참조 유지 문제를 방지하세요. event는 외부에서 임의로 발행할 수 없습니다.

## 연습

이름 있는 핸들러를 등록했다가 -=로 해제하세요.

[과정 목차](../README.md)
