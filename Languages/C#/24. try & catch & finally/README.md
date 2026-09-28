# try & catch & finally

## 개념과 사용 시점

예외 타입에 따라 실패를 처리하고 finally에서 정리합니다. 처리할 수 없는 예외는 상위로 전달합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **C# 과정 루트**입니다.

```powershell
dotnet run --project "24. try & catch & finally/Example.csproj"
```


## 코드 읽기

```csharp
try
{
    int.Parse("wrong");
}
catch (FormatException)
{
    Console.WriteLine("invalid number");
}
finally
{
    Console.WriteLine("done");
}
```

[실행 파일](Program.cs)

## 예상 결과

```text
invalid number
done
```

## 주의사항

다시 던질 때 throw;는 기존 스택을 보존합니다. 예상 가능한 입력 오류는 TryParse가 더 간단할 수 있습니다.

## 연습

정상 숫자로 바꾸고 finally 실행을 확인하세요.

[과정 목차](../README.md)
