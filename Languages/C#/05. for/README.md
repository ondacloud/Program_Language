# for

## 개념과 사용 시점

초기화·조건·갱신을 지정해 반복합니다. 인덱스나 정해진 횟수가 필요한 경우에 사용합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **C# 과정 루트**입니다.

```powershell
dotnet run --project "05. for/Example.csproj"
```


## 코드 읽기

```csharp
int sum = 0;
for (int i = 1; i <= 3; i++)
{
    sum += i;
}
Console.WriteLine(sum);
```

[실행 파일](Program.cs)

## 예상 결과

```text
6
```

## 주의사항

배열의 마지막 인덱스는 Length - 1입니다. 경계값을 확인하세요.

## 연습

1부터 10까지 합계를 구하세요.

[과정 목차](../README.md)
