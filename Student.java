package homework5;

import java.util.ArrayList;

public class Student {

    // Задание 1. Студенческий справочник
    // Реализуйте программу для работы с простым справочником студентов.
    // Программа должна иметь следующие функции:
    // ● addStudent(String name, Integer grade): Добавляет или
    // обновляет запись о студенте с именем name и оценкой grade. Если
    // студент уже существует, обновляет его оценку.
    // ● findStudent(String name): Находит оценки студента по его имени.
    // Если студент существует, возвращает список его оценок. Если нет —
    // пустой список.
    // ● getAllStudents(): Возвращает весь справочник студентов в виде
    // HashMap, где ключи — имена студентов, а значения — списки их оценок.
    // ● removeStudent(String name): Удаляет запись о студенте по имени
    // из справочника. Если запись не существует, ничего не происходит.
    public static void main(String[] args) {

    }

    String name;
    Integer grade;

    public Student(String name, Integer grade) {
        this.name = name;
        this.grade = grade;
    }

    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(String name, Integer grade) {
        Student newStudent = new Student(name, grade);
        students.add(newStudent);
    }

    public void findStudent(String name) {
        for (Student student : students) {
            if (student.name.equals(name)) {
                System.out.println(student);
            }
        }
    }

    public void getAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void removeStudent(String name) {
        for (Student student : students) {
            if (student.name.equals(name)) {
                students.remove(student);
                return;
            }
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Grade: " + grade;
    }

}
