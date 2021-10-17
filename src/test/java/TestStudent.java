import org.junit.Test;

public class TestStudent {
    Student stu = new Student("xiaoming", 25);

    @Test
    public void testAddAge() {
        int result = stu.AddAge(10);
        System.out.println(result);
    }

    @Test
    public void testAddAge2() {
        int result = stu.AddAge(20);
        System.out.println(result);
    }
}
