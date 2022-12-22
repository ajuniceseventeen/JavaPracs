package lab9.task3;

import lab9.task1.Student;

public class Sorting2Students {
    Student[] students1 = {
            new Student(22, 4),
            new Student(24, 5),
            new Student(18, 3),
            new Student(12, 4),
            new Student(17, 3),
            new Student(15, 2),
            new Student(19, 5),
            new Student(32, 4)
    };
    Student[] students2 = {
            new Student(5, 3),
            new Student(25, 5),
            new Student(13, 2),
            new Student(14, 4),
            new Student(11, 3),
            new Student(6, 2),
            new Student(18, 5),
            new Student(27, 2)
    };
    Student[] students3;
    public Student [] mergeArray(Student [] a1, Student [] a2) {
        Student[] b = new Student[a1.length + a2.length];
        int positionA1 = 0;
        int positionA2 = 0;
        for(int i = 0; i < b.length; i++) {
            if(positionA1 == a1.length){
                b[i] = a2[positionA2];
                positionA2++;
            } else if(positionA2 == a2.length){
                b[i] = a1[positionA1];
                positionA1++;
            } else if(a1[positionA1].getID() < a2[positionA2].getID()){
                b[i] = a1[positionA1];
                positionA1++;
            } else {
                b[i] = a2[positionA2];
                positionA2++;
            }
        }
        return b;
    }
    public Student [] sortArray(Student[] arrayA){
        if (arrayA == null) {
            return null;
        }
        if (arrayA.length < 2) {
            return arrayA;
        }
        Student[] arrayB = new Student[arrayA.length / 2];
        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length / 2);
        Student [] arrayC = new Student[arrayA.length - arrayA.length / 2];
        System.arraycopy(arrayA, arrayA.length / 2, arrayC, 0, arrayA.length - arrayA.length / 2);
        arrayB = sortArray(arrayB);
        arrayC = sortArray(arrayC);
        return mergeArray(arrayB, arrayC);
    }
    public void print(Student [] studentsR) {
        String tmp;
        System.out.println("Students: ");
        for (int i = 0; i < studentsR.length; i++) {
            tmp = i + " " + studentsR[i];
            System.out.println(tmp);
        }
    }
    public Student [] getStudents1() {
        return students1;
    }
    public Student [] getStudents2() {
        return students2;
    }
    public Student [] getStudents3() {
        return students3;
    }
    public void setStudents1(Student [] s) {
        this.students1 = s;
    }
    public void setStudents2(Student [] s) {
        this.students2 = s;
    }
    public void setStudents3(Student [] s) {
        this.students3 = s;
    }
}
