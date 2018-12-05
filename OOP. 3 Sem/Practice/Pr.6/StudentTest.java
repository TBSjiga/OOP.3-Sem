package ru.mirea;

import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of students: ");
        int n = in.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i<n; i++){
            students[i] = new Student();

            System.out.println("Enter student's id: ");
            students[i].setId(in.nextInt());

            System.out.println("Enter student's name: ");
            students[i].setName(in.next());

            System.out.println("Enter student's surname: ");
            students[i].setSurname(in.next());
        }
        Student.Sort1(n-1, students);

        for(int i = 0; i < n; i++){
            students[i].Info();
        }
    }
}
