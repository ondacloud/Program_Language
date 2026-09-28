# generic & where

## 개념과 사용 시점

제네릭으로 타입 관계를 유지하며 코드를 재사용합니다. where 제약으로 필요한 타입 기능을 제한합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **C# 과정 루트**입니다.

```powershell
dotnet run --project "21. generic & where/Example.csproj"
```


## 코드 읽기

```csharp
var box = new Box<int>(80);
Console.WriteLine(box.Value);
Console.WriteLine(Max(3, 7));

static T Max<T>(T a, T b) where T : IComparable<T> => a.CompareTo(b) >= 0 ? a : b;
class Box<T>
{
    public T Value { get; }
    public Box(T value) => Value = value;
}
```

[실행 파일](Program.cs)

## 예상 결과

```text
80
7
```

## 주의사항

object로 저장한 뒤 캐스팅하는 방식과 다르게 타입 관계를 컴파일 시 검사합니다.

## 연습

문자열 Max를 호출해 비교 규칙을 확인하세요.

[과정 목차](../README.md)
