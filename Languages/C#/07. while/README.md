# while

## 개념과 사용 시점

매 회차 시작 전에 조건을 검사합니다. 처음부터 거짓이면 본문을 실행하지 않습니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **C# 과정 루트**입니다.

```powershell
dotnet run --project "07. while/Example.csproj"
```


## 코드 읽기

```csharp
int count = 3;
while (count > 0)
{
    Console.WriteLine(count);
    count--;
}
```

[실행 파일](Program.cs)

## 예상 결과

```text
3
2
1
```

## 주의사항

종료 조건의 갱신을 빠뜨리면 무한 반복이 됩니다.

## 연습

count가 0일 때 결과를 확인하세요.

[과정 목차](../README.md)
