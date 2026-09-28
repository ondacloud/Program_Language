# Console.WriteLine & Console.Write

## 개념과 사용 시점

Write는 줄바꿈 없이 출력하고 WriteLine은 줄바꿈을 추가합니다. 문자열 보간으로 값을 넣을 수 있습니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **C# 과정 루트**입니다.

```powershell
dotnet run --project "01. Console.WriteLine & Console.Write/Example.csproj"
```


## 코드 읽기

```csharp
var name = "Mina";
Console.Write("Hello, ");
Console.WriteLine(name);
Console.WriteLine($"length: {name.Length}");
```

[실행 파일](Program.cs)

## 예상 결과

```text
Hello, Mina
length: 4
```

## 주의사항

콘솔 출력과 웹 HTTP 응답은 별개입니다. 이 과정은 콘솔 앱을 사용합니다.

## 연습

형식 문자열로 점수를 출력하세요.

[과정 목차](../README.md)
