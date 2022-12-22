package lab9.task2;

import lab9.task1.Student;

import java.util.Comparator;


public class SortingStudentsByGPA implements Comparator<Student>{
    Student[] students = {
            new Student(22, 3),
            new Student(15, 5),
            new Student(43, 3),
            new Student(22, 4),
            new Student(3, 3),
            new Student(4, 2),
            new Student(59, 5),
            new Student(32, 5)
    };
    public int compare(Student o1, Student o2) {
        return o1.getGPA() - o2.getGPA();
    }
    public void quickSort(Student[] source, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = source[(leftMarker + rightMarker) / 2].getGPA();
        do {
            // Двигаем левый маркер слева направо пока элемент меньше, чем pivot
            while (source[leftMarker].getGPA() > pivot) {
                leftMarker++;
            }
            // Двигаем правый маркер, пока элемент больше, чем pivot
            while (source[rightMarker].getGPA() < pivot) {
                rightMarker--;
            }
            // Проверим, не нужно обменять местами элементы, на которые указывают маркеры
            if (leftMarker <= rightMarker) {
                // Левый маркер будет меньше правого только если мы должны выполнить swap
                if (leftMarker < rightMarker) {
                    Student tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }
                // Сдвигаем маркеры, чтобы получить новые границы
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        // Выполняем рекурсивно для частей
        if (leftMarker < rightBorder) {
            quickSort(source, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(source, leftBorder, rightMarker);
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
    public Student[] getStudents() {
        return students;
    }
    public int getLen() {
        return students.length;
    }
}
