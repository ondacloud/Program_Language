# method & return

## 개념과 사용 시점

메서드와 지역 함수는 입력을 받아 결과를 반환합니다. 기본 매개변수와 이름 있는 인자를 사용할 수 있습니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **C# 과정 루트**입니다.

```powershell
dotnet run --project "11. method & return/Example.csproj"
```


## 코드 읽기

```csharp
Console.WriteLine(Greet(name: "Mina"));
Console.WriteLine(Add(2, 3));

static string Greet(string name, string prefix = "Hi") => $"{prefix}, {name}";
static int Add(int a, int b)
{
    return a + b;
}
```

[실행 파일](Program.cs)

## 예상 결과

```text
Hi, Mina
5
```

## 주의사항

이 예제는 최상위 문 안의 지역 함수입니다. 클래스의 인스턴스 메서드·static 메서드와 호출 방식도 구분하세요.

## 연습

점수 배열의 평균을 반환하는 함수를 만드세요.

[과정 목차](../README.md)
