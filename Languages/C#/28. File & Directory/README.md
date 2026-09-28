# File & Directory

## 개념과 사용 시점

File과 Directory로 파일 시스템을 다룹니다. 예제는 임시 디렉터리 안에만 쓰고 finally에서 정리합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 작업 폴더는 **C# 과정 루트**입니다.

```powershell
dotnet run --project "28. File & Directory/Example.csproj"
```


## 코드 읽기

```csharp
DirectoryInfo directory = Directory.CreateTempSubdirectory("csharp-course-");
try
{
    string path = Path.Combine(directory.FullName, "note.txt");
    await File.WriteAllTextAsync(path, "Hello C#");
    Console.WriteLine(await File.ReadAllTextAsync(path));
}
finally
{
    directory.Delete(recursive: true);
}
```

[실행 파일](Program.cs)

## 예상 결과

```text
Hello C#
```

## 주의사항

외부 경로 입력과 접근 권한을 검증하세요. 이 예제는 직접 생성한 임시 폴더만 제거합니다.

## 연습

두 줄을 저장하고 ReadAllLinesAsync로 읽으세요.

[과정 목차](../README.md)
