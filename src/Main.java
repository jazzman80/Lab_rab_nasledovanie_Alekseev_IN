public class Main {
    public static void main(String[] args) {
        Student studentpetrov = new Aspirant("Ivan", "Petrov", "802", 3, "Issledovanie");
        Student[] students = new Student[]{
                new Student("Petr", "Ivanov", "802", 4),
                new Student("Petr", "Petrov", "802", 5),
                new Aspirant("Ivan", "Petrov", "802", 3, "Issledovanie"),
                new Aspirant("Ivan", "Ivanov", "802", 5, "New Issledovanie"),
        };

        for(Student student : students){
            System.out.println(student.getScholarship());
        }
    }
}