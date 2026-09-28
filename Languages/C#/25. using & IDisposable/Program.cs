{
    using var resource = new Resource();
    Console.WriteLine("using");
}

class Resource : IDisposable
{
    public void Dispose() => Console.WriteLine("disposed");
}
