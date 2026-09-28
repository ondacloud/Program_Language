# record & with

## 개념과 사용 시점

record는 데이터 중심 타입을 표현하며 값 기반 동등성 기능을 제공합니다. with로 일부 값을 바꾼 복사본을 만듭니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **C# 과정 루트**입니다.

```powershell
dotnet run --project "19. record & with/Example.csproj"
```


## 코드 읽기

```csharp
var original = new Student("Mina", 80);
var updated = original with { Score = 90 };
Console.WriteLine($"{original.Name}: {original.Score}");
Console.WriteLine($"{updated.Name}: {updated.Score}");

record Student(string Name, int Score);
```

[실행 파일](Program.cs)

## 예상 결과

```text
Mina: 80
Mina: 90
```

## 주의사항

with는 얕은 복사입니다. 내부에 List 같은 가변 참조가 있으면 공유될 수 있습니다.

## 연습

동일한 값의 record 두 개를 ==로 비교하세요.

[과정 목차](../README.md)
