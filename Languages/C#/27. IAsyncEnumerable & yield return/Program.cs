await foreach (int value in Numbers())
{
    Console.WriteLine(value);
}

static async IAsyncEnumerable<int> Numbers()
{
    for (int i = 1; i <= 3; i++)
    {
        await Task.Delay(1);
        yield return i;
    }
}
