try
{
    int.Parse("wrong");
}
catch (FormatException)
{
    Console.WriteLine("invalid number");
}
finally
{
    Console.WriteLine("done");
}
