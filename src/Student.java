import java.util.Scanner;

public class Student extends Person {
    private String className;
    private float scoreMath;
    private float scoreLiterature;
    private float scoreLEnglish;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public float getScoreMath() {
        return scoreMath;
    }

    public void setScoreMath(float scoreMath) {
        this.scoreMath = scoreMath;
    }

    public float getScoreLiterature() {
        return scoreLiterature;
    }

    public void setScoreLiterature(float scoreLiterature) {
        this.scoreLiterature = scoreLiterature;
    }

    public float getScoreLEnglish() {
        return scoreLEnglish;
    }

    public void setScoreLEnglish(float scoreLEnglish) {
        this.scoreLEnglish = scoreLEnglish;
    }

    @Override
    public void addInfo() {
        Scanner sc = new Scanner(System.in);
        super.addInfo();
        System.out.println("Enter class: ");
        className = sc.nextLine();
        System.out.println("Enter score of math: ");
        scoreMath = Float.parseFloat(sc.nextLine());
        System.out.println("Enter score of literature: ");
        scoreLiterature = Float.parseFloat(sc.nextLine());
        System.out.println("Enter score of english: ");
        scoreLEnglish = Float.parseFloat(sc.nextLine());
    }
}
