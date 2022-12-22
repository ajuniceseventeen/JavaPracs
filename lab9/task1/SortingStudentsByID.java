package lab9.task1;

public class SortingStudentsByID {
    Student[] students = {
            new Student(22, 3),
            new Student(35, 2),
            new Student(43, 4),
            new Student(52, 2),
            new Student(12, 3),
            new Student(34, 2),
            new Student(59, 5),
            new Student(3, 5)
    };
    public void sortStudents() {
        for (int i = 1; i < students.length; i++) {
            for (int j = i; j > 0; j--) {
                if(students[j].getID() > students[j-1].getID()){
                    Student temp2 = students[j];
                    students[j] = students[j-1];
                    students[j-1] = temp2;
                }
                else {
                    break;
                }
            }
        }
    }
    public void print() {
        String tmp;
        System.out.println("Students: ");
        for (int i = 0; i < students.length; i++) {
            tmp = i + " " + students[i];
            System.out.println(tmp);
        }
    }
}
