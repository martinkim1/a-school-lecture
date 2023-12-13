package javabean;

public class ScoreBean {
	private String name;
    private int score;

    // 기본 생성자 및 getter, setter 메소드 생략

    // 학점 계산 메소드
    public String calculateGrade() {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
