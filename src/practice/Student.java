package practice;

public class Student { //student 클래스
    int studentID; //학생 번호
    String studentName; // 학생 이름
    int grade; // 학생 성적                  // 맴버 변수
    String address; // 학생 주소

    public String getStudentName(){
        return studentName;
    }

    public static void main(String[] args) {
        Student studentAnn = new Student();
        studentAnn.studentName = "안연수";

        System.out.println(studentAnn.studentName);
        System.out.println(studentAnn.getStudentName());
    }
}

