var box = new Box<int>(80);
Console.WriteLine(box.Value);
Console.WriteLine(Max(3, 7));

static T Max<T>(T a, T b) where T : IComparable<T> => a.CompareTo(b) >= 0 ? a : b;
class Box<T>
{
    public T Value { get; }
    public Box(T value) => Value = value;
}
