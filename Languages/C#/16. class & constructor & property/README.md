# class & constructor & property

## 개념과 사용 시점

클래스로 데이터와 동작을 묶고 생성자로 유효한 초기 상태를 만듭니다. property로 필드 접근을 제한합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **C# 과정 루트**입니다.

```powershell
dotnet run --project "16. class & constructor & property/Example.csproj"
```


## 코드 읽기

```csharp
var student = new Student("Mina", 80);
Console.WriteLine(student.Summary());

class Student
{
    public string Name { get; }
    public int Score { get; private set; }
    public Student(string name, int score)
    {
        if (score < 0 || score > 100) throw new ArgumentOutOfRangeException(nameof(score));
        Name = name;
        Score = score;
    }
    public string Summary() => $"{Name}: {Score}";
}
```

[실행 파일](Program.cs)

## 예상 결과

```text
Mina: 80
```

## 주의사항

public 필드를 무제한으로 변경하게 하기보다 객체의 불변 조건을 보호하세요.

## 연습

검증하는 점수 변경 메서드를 추가하세요.

[과정 목차](../README.md)
