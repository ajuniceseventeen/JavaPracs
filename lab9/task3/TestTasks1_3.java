package lab9.task3;

import lab9.task1.SortingStudentsByID;
import lab9.task2.SortingStudentsByGPA;

public class TestTasks1_3 {
    public static void main(String[] args) {
        // 1
        System.out.println("1 - задание");
        SortingStudentsByID sbi = new SortingStudentsByID();
        sbi.print();
        sbi.sortStudents();
        System.out.print("Отсортированный массив ");
        sbi.print();
        // 2
        System.out.println("2 - задание");
        SortingStudentsByGPA sbg = new SortingStudentsByGPA();
        sbg.print();
        sbg.quickSort(sbg.getStudents(), 0, sbg.getLen() - 1);
        System.out.print("Отсортированный массив ");
        sbg.print();
        // 3
        System.out.println("3 - задание");
        Sorting2Students s2s = new Sorting2Students();
        System.out.println("1 массив");
        s2s.print(s2s.students1);
        System.out.println("2 массив");
        s2s.print(s2s.students2);
        s2s.setStudents1(s2s.sortArray(s2s.getStudents1()));
        s2s.setStudents2(s2s.sortArray(s2s.getStudents2()));
        s2s.setStudents3(s2s.mergeArray(s2s.getStudents1(), s2s.getStudents2()));
        System.out.println("1 + 2 массивы");
        s2s.print(s2s.getStudents3());
    }
}
