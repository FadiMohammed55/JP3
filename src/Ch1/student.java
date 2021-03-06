package Ch1;

public class student implements Person {

    private String name;
    private String major;
    private double grade;

    public student(String name, String major, double grade) {
        this.name = name;
        this.major = major;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "student{" + "name=" + name + ", major=" + major + ", grade=" + grade + '}';
    }
    
    

}
