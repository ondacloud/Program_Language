# Console.ReadLine & TryParse

## 개념과 사용 시점

ReadLine은 한 줄 입력을 읽고 입력 종료 시 null을 반환합니다. TryParse로 예외 없이 숫자 변환 성공 여부를 확인합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **C# 과정 루트**입니다.

```powershell
dotnet run --project "02. Console.ReadLine & TryParse/Example.csproj"
```

입력 예: `80`를 입력한 뒤 Enter를 누르세요. [입력 파일](input.txt)도 제공합니다.

## 코드 읽기

```csharp
string? input = Console.ReadLine();
if (int.TryParse(input, out int score))
{
    Console.WriteLine(score + 1);
}
else
{
    Console.WriteLine("invalid");
}
```

[실행 파일](Program.cs)

## 예상 결과

```text
81
```

## 주의사항

변환 성공과 유효 범위 충족은 다릅니다. 빈 입력·EOF·잘못된 숫자를 함께 처리하세요.

## 연습

0~100 범위의 점수만 허용하세요.

[과정 목차](../README.md)
