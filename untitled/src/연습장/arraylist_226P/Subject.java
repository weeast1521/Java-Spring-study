package 연습장.arraylist_226P;

public class Subject {
    private String subjectName;
    private double subjectScore;

    Subject(String subjectName, double subjectScore){
        this.subjectName = subjectName;
        this.subjectScore = subjectScore;
    }
    public double getSubjectScore() {
        return subjectScore;
    }

    public void setSubjectScore(double subjectScore) {
        this.subjectScore = subjectScore;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
