# operator

## 개념과 사용 시점

산술·비교·논리 연산자로 값을 계산합니다. int끼리의 나눗셈과 double 나눗셈은 결과가 다릅니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **C# 과정 루트**입니다.

```powershell
dotnet run --project "00. operator/Example.csproj"
```


## 코드 읽기

```csharp
Console.WriteLine(7 + 2);
Console.WriteLine(7 / 2);
Console.WriteLine(7.0 / 2);
Console.WriteLine(7 % 2);
Console.WriteLine(80 >= 70 && 80 <= 100);
```

[실행 파일](Program.cs)

## 예상 결과

```text
9
3
3.5
1
True
```

## 주의사항

C#의 bool 출력은 True·False입니다. 큰 정수 계산에는 자료형 범위와 checked 처리도 고려하세요.

## 연습

checked 안에서 int 최댓값에 1을 더해 보세요.

[과정 목차](../README.md)
