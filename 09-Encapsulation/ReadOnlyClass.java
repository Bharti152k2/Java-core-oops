public class ReadOnlyClass {

    private final int id;

    public ReadOnlyClass(int id) {

        this.id = id;
    }

    public int getId() {

        return id;
    }

    public static void main(String[] args) {

        ReadOnlyClass student = new ReadOnlyClass(101);

        System.out.println("Student ID: " + student.getId());

        // No setter is provided.
        // Therefore, external code cannot modify id through a setter.
    }
}