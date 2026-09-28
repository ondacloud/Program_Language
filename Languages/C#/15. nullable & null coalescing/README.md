# nullable & null coalescing

## 개념과 사용 시점

nullable 참조 타입 주석은 컴파일 시 null 가능성을 추적합니다. ?.와 ??로 안전한 접근과 기본값을 표현합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **C# 과정 루트**입니다.

```powershell
dotnet run --project "15. nullable & null coalescing/Example.csproj"
```


## 코드 읽기

```csharp
Console.WriteLine(LengthOrZero(null));
Console.WriteLine(LengthOrZero("Mina"));

static int LengthOrZero(string? name) => name?.Length ?? 0;
```

[실행 파일](Program.cs)

## 예상 결과

```text
0
4
```

## 주의사항

null 억제 연산자 !는 실행 시 검사를 추가하지 않습니다. string? 주석도 런타임 null을 자동으로 막지 않습니다.

## 연습

int?의 HasValue와 Value를 비교하세요.

[과정 목차](../README.md)
