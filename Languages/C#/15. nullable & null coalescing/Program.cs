Console.WriteLine(LengthOrZero(null));
Console.WriteLine(LengthOrZero("Mina"));

static int LengthOrZero(string? name) => name?.Length ?? 0;
