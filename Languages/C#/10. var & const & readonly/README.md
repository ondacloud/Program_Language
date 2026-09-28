# var & const & readonly

## 개념과 사용 시점

var는 컴파일 시 타입 추론, const는 컴파일 시간 상수, readonly 필드는 선언부나 생성자에서 할당합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **C# 과정 루트**입니다.

```powershell
dotnet run --project "10. var & const & readonly/Example.csproj"
```


## 코드 읽기

```csharp
var score = 80;
score += 5;
const int limit = 100;
var student = new Student("Mina");
Console.WriteLine($"{student.Name}: {score}/{limit}");

class Student
{
    public readonly string Name;
    public Student(string name) => Name = name;
}
```

[실행 파일](Program.cs)

## 예상 결과

```text
Mina: 85/100
```

## 주의사항

var는 dynamic이 아닙니다. readonly 참조형 필드가 가리키는 객체의 내부까지 불변인 것은 아닙니다.

## 연습

readonly List의 Add와 필드 재할당 차이를 확인하세요.

[과정 목차](../README.md)
