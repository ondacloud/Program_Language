# break & continue

## 개념과 사용 시점

break는 반복 종료, continue는 현재 회차 나머지 생략에 사용합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **C# 과정 루트**입니다.

```powershell
dotnet run --project "09. break & continue/Example.csproj"
```


## 코드 읽기

```csharp
for (int n = 1; n <= 5; n++)
{
    if (n == 2) continue;
    if (n == 4) break;
    Console.WriteLine(n);
}
```

[실행 파일](Program.cs)

## 예상 결과

```text
1
3
```

## 주의사항

중첩 반복에서는 가장 가까운 반복문이 대상입니다. 종료 의도를 읽기 쉽게 표현하세요.

## 연습

짝수를 건너뛰고 1·3·5를 출력하세요.

[과정 목차](../README.md)
