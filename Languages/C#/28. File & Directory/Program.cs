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
