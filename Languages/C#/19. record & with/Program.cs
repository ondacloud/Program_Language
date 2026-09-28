var original = new Student("Mina", 80);
var updated = original with { Score = 90 };
Console.WriteLine($"{original.Name}: {original.Score}");
Console.WriteLine($"{updated.Name}: {updated.Score}");

record Student(string Name, int Score);
