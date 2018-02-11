package Lab4Start;

public class Faculty extends Employee {
    private String[] courses;

    public Faculty(String sig,double sal,String[] classes){
        super(sig,sal);
        courses= new String[classes.length];
        for (int i = 0; i < classes.length; i++)
            courses[i] = classes[i];
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return ("Professor "+super.toString());
    }

    public String[] getCourses() {
        return courses;
    }
}
