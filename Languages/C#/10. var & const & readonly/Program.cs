var score = 80;
score += 5;
const int limit = 100;
var student = new Student("Mina");
Console.WriteLine($"{student.Name}: {score}/{limit}");

class Student
{
    public readonly string Name;
    public Student(string name) => Name = name;
}
