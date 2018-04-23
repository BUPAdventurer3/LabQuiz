package data.model;

public class StudentInfo {

    private int studentRoll1;
    private String studentName1;

    private int studentRoll2;
    private String studentName2;





    public StudentInfo() {
        studentRoll1 = 1;
        studentName1 = "A";
        studentRoll2 = 2;
        studentName2 = "B";
    }

    public int getStudentRoll1() {
        return studentRoll1;
    }

    public void setStudentRoll1(int studentRoll1) {
        this.studentRoll1 = studentRoll1;
    }

    public String getStudentName1() {
        return studentName1;
    }

    public void setStudentName1(String studentName1) {
        this.studentName1 = studentName1;
    }

    public int getStudentRoll2() {
        return studentRoll2;
    }

    public void setStudentRoll2(int studentRoll2) {
        this.studentRoll2 = studentRoll2;
    }

    public String getStudentName2() {
        return studentName2;
    }

    public void setStudentName2(String studentName2) {
        this.studentName2 = studentName2;
    }
}
