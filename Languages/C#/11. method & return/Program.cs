Console.WriteLine(Greet(name: "Mina"));
Console.WriteLine(Add(2, 3));

static string Greet(string name, string prefix = "Hi") => $"{prefix}, {name}";
static int Add(int a, int b)
{
    return a + b;
}
