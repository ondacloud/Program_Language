IGreeter greeter = new Friendly();
Console.WriteLine(greeter.Greet("Mina"));

interface IGreeter
{
    string Greet(string name);
}
class Friendly : IGreeter
{
    public string Greet(string name) => $"Hello, {name}";
}
