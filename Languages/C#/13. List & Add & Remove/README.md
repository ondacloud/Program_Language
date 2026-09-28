# List & Add & Remove

## 개념과 사용 시점

List<T>는 크기가 변하는 목록입니다. Add로 추가하고 Remove로 값에 맞는 원소를 제거합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **C# 과정 루트**입니다.

```powershell
dotnet run --project "13. List & Add & Remove/Example.csproj"
```


## 코드 읽기

```csharp
var names = new List<string> { "Mina", "Jin" };
names.Add("Sol");
names.Remove("Jin");
Console.WriteLine(names.Count);
Console.WriteLine(string.Join(",", names));
```

[실행 파일](Program.cs)

## 예상 결과

```text
2
Mina,Sol
```

## 주의사항

Count는 원소 수입니다. Capacity와 의미가 다릅니다. 인덱스 범위 검사는 여전히 필요합니다.

## 연습

RemoveAt과 Remove의 차이를 확인하세요.

[과정 목차](../README.md)
