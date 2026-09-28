# interface & class

## 개념과 사용 시점

interface는 호출자가 기대하는 계약을 정의합니다. C#에서는 콜론 뒤에 인터페이스를 지정하여 구현합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **C# 과정 루트**입니다.

```powershell
dotnet run --project "18. interface & class/Example.csproj"
```


## 코드 읽기

```csharp
IGreeter greeter = new Friendly();
Console.WriteLine(greeter.Greet("Mina"));

interface IGreeter
{
    string Greet(string name);
}
class Friendly : IGreeter
{
    public string Greet(string name) => $"Hello, {name}";
}
```

[실행 파일](Program.cs)

## 예상 결과

```text
Hello, Mina
```

## 주의사항

인터페이스 구현 문법은 class Friendly : IGreeter입니다. 호출자는 구체적인 클래스보다 필요한 계약에 의존할 수 있습니다.

## 연습

다른 인사말을 제공하는 구현으로 교체하세요.

[과정 목차](../README.md)
