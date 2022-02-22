package ss5_access_modifier_static_method_static_property.exercises.student;

public class Student {
    public static void main(String[] args) {
    }

    private String name = "John";
    private String classOfStudent = "C02";

    public Student() {
    }

    /***************Setter, getter with public access modifier:***************/
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return this.classOfStudent;
    }

    public void setClasses(String classOfStudent) {
        this.classOfStudent = classOfStudent;
    }
    /***************Setter, getter with private access modifier:***************/
//    private String getName() {
//        return this.name;
//    }
//
//    private void setName(String name) {
//        this.name = name;
//    }
//
//    private String getClasses() {
//        return this.classOfStudent;
//    }
//
//    private void setClasses(String classOfStudent) {
//        this.classOfStudent = classOfStudent;
//    }
    /***************Setter, getter with protected access modifier:***************/
//    protected String getName() {
//        return this.name;
//    }
//
//    protected void setName(String name) {
//        this.name = name;
//    }
//
//    protected String getClasses() {
//        return this.classOfStudent;
//    }
//
//    protected void setClasses(String classOfStudent) {
//        this.classOfStudent = classOfStudent;
//    }
    /***************Setter, getter with default access modifier:***************/
//    String getName() {
//        return this.name;
//    }
//
//    void setName(String name) {
//        this.name = name;
//    }
//
//    String getClasses() {
//        return this.classOfStudent;
//    }
//
//    void setClasses(String classOfStudent) {
//        this.classOfStudent = classOfStudent;
//    }

    @Override
    public String toString() {
        return "name of student is: " + this.name + "\n" + "class of student is: " + this.classOfStudent;
    }
}
