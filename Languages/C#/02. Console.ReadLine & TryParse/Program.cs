string? input = Console.ReadLine();
if (int.TryParse(input, out int score))
{
    Console.WriteLine(score + 1);
}
else
{
    Console.WriteLine("invalid");
}
