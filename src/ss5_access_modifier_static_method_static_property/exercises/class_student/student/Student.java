package ss5_access_modifier_static_method_static_property.exercises.class_student.student;

public class Student {
    public static void main(String[] args) {
        System.out.print("<-------------------------------------------<<Initialize A Default Object Of Student Class>>----------------------------------------------->\n");
        System.out.print("<-------------------------------------------<<Help Us Realize The Operating Range Of Private>>--------------------------------------------->\n");
        System.out.print("<--------------------------<<If We Just Use Private Access Modifier Object Student Only Initialize On This Class>>------------------------->\n");
        Student student = new Student();
        System.out.println(student);
    }

    private String name = "John";
    private String classOfStudent = "C02";
    private int id;
    private String birthday;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String classOfStudent, int id, String birthday) {
        this.name = name;
        this.classOfStudent = classOfStudent;
        this.id = id;
        this.birthday = birthday;
    }

    /***************Setter, getter for id and birthday:***************/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
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
//    /***************Setter, getter with default access modifier:***************/
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
        return "name : " + this.name + ", " + "class: " + this.classOfStudent + ", " + "id: " + this.id + ", " + "birthday: " + this.birthday;
    }
}
