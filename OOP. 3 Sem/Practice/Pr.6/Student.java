package ru.mirea;

import javax.print.attribute.standard.PrinterInfo;

public class Student {
    public String name;
    public int id;
    public String surname;

    public Student(){
        id = 0;
        name = " ";
        surname = " ";
    }

    public  Student(int i, String n, String sn){
        id = i;
        name = n;
        surname = sn;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public static void Sort1 (int s, Student[] st_s){
        int begin = 0;
        int end = s;
        Sort2(begin, end, st_s);
    }

    private static void Sort2(int begin, int end, Student[] st_s){
        if (begin >= end)
            return;
        int i = begin;
        int j = end;
        int cur = i - (i - j) / 2;
        while (i < j){
            while (i < cur && (st_s[i].id <= st_s[cur].id)){
                i++;
            }
            while (j > cur && (st_s[cur].id <= st_s[j].id)){
                j--;
            }
            if (i < j){
                Student temp = st_s[i];
                st_s[i] = st_s[j];
                st_s[j] = temp;
                if (i == cur){
                    cur = j;
                }else if (j == cur){
                    cur = i;
                }
            }
            Sort2(begin, cur, st_s);
            Sort2(cur+1, end, st_s);
        }
    }

    @Override
    public String toString() {
        return "id: " + id + " name: " + " surname: " + surname;
    }

    public void Info(){
        System.out.println("Student's id: " + getId());
        System.out.println("Student's name: " + getName());
        System.out.println("Student's surname: " + getSurname());
    }


}
