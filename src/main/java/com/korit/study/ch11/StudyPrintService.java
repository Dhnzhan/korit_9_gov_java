package com.korit.study.ch11;

public class StudyPrintService {

    void prinInfoAll(Study study) {
        prinInfoSubject(study.subject);
        prinInfoStudents(study.students);

    }

    void prinInfoSubject(Subject subject) {
        System.out.println("[과목정보]");
        System.out.println("과목명: " + subject.name);
        Object Teacher = null;
        printInfoTeacher(subject, Teacher);
    }

    private void printInfoTeacher(Subject subject, Object teacher) {
    }

    void printInfoTeacher(Teacher teacher) {

    }

    void prinInfoStudents(Student[] students) {
        System.out.println("[학생정보 전체조회]");
        for (Student student : students) {
            printINfoStudent(student);

        }
    }

    void printINfoStudent(Student student) {
        System.out.println("[학생정보]");
        System.out.println("학번: " + student.id);
        System.out.println("학생이름: " + student.name);
        System.out.println("학생나이: " + student.age);
    }

}
