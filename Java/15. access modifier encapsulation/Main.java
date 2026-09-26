class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) throw new IllegalArgumentException("age must be >= 0");
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person(); p.setAge(20); System.out.println(p.getAge()); try { p.setAge(-1); } catch (IllegalArgumentException e) { System.out.println(e.getMessage()); }
    }
}
