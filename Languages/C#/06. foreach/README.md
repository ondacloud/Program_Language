# foreach

## 개념과 사용 시점

컬렉션 원소를 순서대로 읽습니다. 인덱스 관리가 필요 없는 경우 읽기 쉽습니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **C# 과정 루트**입니다.

```powershell
dotnet run --project "06. foreach/Example.csproj"
```


## 코드 읽기

```csharp
foreach (string name in new[] { "Mina", "Jin" })
{
    Console.WriteLine(name);
}
```

[실행 파일](Program.cs)

## 예상 결과

```text
Mina
Jin
```

## 주의사항

많은 컬렉션은 순회 중 원소 추가·삭제를 허용하지 않습니다. 변경할 항목을 먼저 모으거나 새 컬렉션을 만드세요.

## 연습

이름의 길이도 출력하세요.

[과정 목차](../README.md)
