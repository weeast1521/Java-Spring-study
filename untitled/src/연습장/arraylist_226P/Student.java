package 연습장.arraylist_226P;

import java.util.ArrayList;

public class Student {
    private static int studentNum = 1000;
    String name;
    ArrayList<Subject> subject;

    public Student(String name){
        studentNum++;
        this.name = name;
        subject = new ArrayList<Subject>();
    }

    public static int getStudentNum() {
        // name = "seo"; -> static을 붙이면 왜 오류가 발생하는거지?
        return studentNum;
    }

    public void addSubject(String name, double score){
        Subject subject1 = new Subject(name, score);
        subject.add(subject1);
    }
    public void showInfo(){
        double total = 0;
        for(Subject s : subject){
            total += s.getSubjectScore();
            System.out.println("학생 " + name + "의 " + s.getSubjectName() + " 과목 성적은 " + s.getSubjectScore());
        }
        System.out.println("학생 " + name + "의 총점은 " + total);
    }
}
