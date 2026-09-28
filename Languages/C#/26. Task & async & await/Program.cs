int[] scores = await Task.WhenAll(Load(80), Load(90));
Console.WriteLine(string.Join(",", scores));

static async Task<int> Load(int score)
{
    await Task.Delay(10);
    return score;
}
