Func<int, int> doubleValue = n => n * 2;
Console.WriteLine(doubleValue(3));
var counter = new Counter();
counter.Changed += value => Console.WriteLine($"changed: {value}");
counter.Increase();

class Counter
{
    private int value;
    public event Action<int>? Changed;
    public void Increase()
    {
        value++;
        Changed?.Invoke(value);
    }
}
