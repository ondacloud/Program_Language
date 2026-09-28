Status state = Status.Ready;
string action = state switch
{
    Status.Ready => "go",
    Status.Busy => "wait",
    _ => "unknown"
};
Console.WriteLine(action);

enum Status { Ready, Busy }
