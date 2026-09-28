Animal animal = new Dog();
Console.WriteLine(animal.Speak());

class Animal
{
    public virtual string Speak() => "sound";
}
class Dog : Animal
{
    public override string Speak() => base.Speak() + ": woof";
}
