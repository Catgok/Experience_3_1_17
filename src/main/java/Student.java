public class Student {
    public Student(String name, int Age) {

        this.setName("xiaoming");
        this.setAge(Age);
    }

    private String Name;
    private int Age;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int AddAge(int num) {
        this.setAge(this.Age + num);
        return this.Age;
    }
}
