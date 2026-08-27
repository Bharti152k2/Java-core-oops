public class ValidationUsingSetter {

    private int age;

    public void setAge(int age) {

        if (age >= 0 && age <= 150) {

            this.age = age;

        } else {

            System.out.println("Invalid age");
        }
    }

    public int getAge() {

        return age;
    }

    public static void main(String[] args) {

        ValidationUsingSetter student = new ValidationUsingSetter();

        student.setAge(24);

        System.out.println("Age: " + student.getAge());

        student.setAge(-10);

        System.out.println("Age after invalid value: "
                + student.getAge());
    }
}