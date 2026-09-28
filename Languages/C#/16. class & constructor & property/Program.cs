var student = new Student("Mina", 80);
Console.WriteLine(student.Summary());

class Student
{
    public string Name { get; }
    public int Score { get; private set; }
    public Student(string name, int score)
    {
        if (score < 0 || score > 100) throw new ArgumentOutOfRangeException(nameof(score));
        Name = name;
        Score = score;
    }
    public string Summary() => $"{Name}: {Score}";
}
