var names = new List<string> { "Mina", "Jin" };
names.Add("Sol");
names.Remove("Jin");
Console.WriteLine(names.Count);
Console.WriteLine(string.Join(",", names));
