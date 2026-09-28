# do while

## 개념과 사용 시점

본문을 먼저 실행하고 조건을 검사합니다. 최소 한 번 실행할 작업에 사용합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **C# 과정 루트**입니다.

```powershell
dotnet run --project "08. do while/Example.csproj"
```


## 코드 읽기

```csharp
int count = 0;
do
{
    Console.WriteLine(count);
    count++;
} while (count < 0);
```

[실행 파일](Program.cs)

## 예상 결과

```text
0
```

## 주의사항

끝의 세미콜론을 빠뜨리지 마세요. 첫 실행은 조건과 무관하게 발생합니다.

## 연습

1부터 3까지 출력하세요.

[과정 목차](../README.md)
