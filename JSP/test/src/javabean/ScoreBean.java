package javabean;

public class ScoreBean {
	private String name;
    private int score;

    // �⺻ ������ �� getter, setter �޼ҵ� ����

    // ���� ��� �޼ҵ�
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
