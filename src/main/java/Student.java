import java.util.ArrayList;

public class Student {
    //  FIELDS
    public long id;
    public String name;
    public ArrayList<Integer> grades;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public void addGrade(int num){
        grades.add(num);
    }

    public double getGradeAverage(){
        ArrayList<Integer> grades = this.getGrades();
        double sum = 0;
        for(Integer grade : grades){
            sum += grade;
        }
        return sum / grades.size();
    }

    public Student(){}

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public static void main(String[] args) {
        Student derrick = new Student(22, "King Henry");
        System.out.println(derrick.getName() + " has been created!");
        derrick.addGrade(90);
        derrick.addGrade(97);
        derrick.addGrade(99);
        System.out.println(derrick.getName() + "'s grades are: \n" + derrick.getGrades());
        System.out.printf( "%s's average is: %.2f!%n", derrick.getName(), derrick.getGradeAverage());
    }
}
