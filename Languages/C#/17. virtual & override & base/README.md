# virtual & override & base

## 개념과 사용 시점

상속 계층에서 virtual 동작을 파생 클래스가 override할 수 있습니다. base로 부모 구현을 호출합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **C# 과정 루트**입니다.

```powershell
dotnet run --project "17. virtual & override & base/Example.csproj"
```


## 코드 읽기

```csharp
Animal animal = new Dog();
Console.WriteLine(animal.Speak());

class Animal
{
    public virtual string Speak() => "sound";
}
class Dog : Animal
{
    public override string Speak() => base.Speak() + ": woof";
}
```

[실행 파일](Program.cs)

## 예상 결과

```text
sound: woof
```

## 주의사항

new 키워드로 메서드를 숨기는 것과 override는 다릅니다. 객체를 상위 타입으로 참조할 때 결과가 달라질 수 있습니다.

## 연습

Cat 구현을 추가하세요.

[과정 목차](../README.md)
