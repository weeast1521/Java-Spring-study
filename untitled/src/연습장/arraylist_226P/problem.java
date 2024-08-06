package 연습장.arraylist_226P;

public class problem {
    public static void main(String[] args) {
        Student student1 = new Student("Lee");
        Student student2 = new Student("kim");

        student1.addSubject("국어", 100);
        student1.addSubject("수학", 90);

        student2.addSubject("국어", 90);
        student2.addSubject("수학", 50);

        student1.showInfo();
        // System.out.println(student1.get);

    }
}
