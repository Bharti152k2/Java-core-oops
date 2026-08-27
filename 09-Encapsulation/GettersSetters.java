public class GettersSetters {

    private String name;
    private int age;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public static void main(String[] args) {

        GettersSetters student = new GettersSetters();

        student.setName("Rahul");
        student.setAge(20);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}