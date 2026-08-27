public class EncapsulationBasics {

    private String name;
    private int age;

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public int getAge() {

        return age;
    }

    public static void main(String[] args) {

        EncapsulationBasics student = new EncapsulationBasics();

        student.setName("Bharti");
        student.setAge(24);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}