string command = "save";
switch (command)
{
    case "save":
        Console.WriteLine("saved");
        break;
    case "load":
        Console.WriteLine("loaded");
        break;
    default:
        Console.WriteLine("unknown");
        break;
}
