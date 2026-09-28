var scores = new Dictionary<string, int> { ["Mina"] = 80 };
Console.WriteLine(scores.TryGetValue("Mina", out int score) ? score : 0);
var teams = new HashSet<string> { "A", "A", "B" };
Console.WriteLine(teams.Count);
