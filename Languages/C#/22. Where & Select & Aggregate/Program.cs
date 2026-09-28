int[] scores = { 60, 80, 90 };
var passed = scores.Where(n => n >= 70).Select(n => n + 1).ToArray();
Console.WriteLine(string.Join(",", passed));
Console.WriteLine(scores.Aggregate(0, (total, n) => total + n));
