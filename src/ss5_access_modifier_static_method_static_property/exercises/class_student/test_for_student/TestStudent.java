package ss5_access_modifier_static_method_static_property.exercises.class_student.test_for_student;

import ss5_access_modifier_static_method_static_property.exercises.class_student.student.Student;

public class TestStudent extends Student {


    public static void main(String[] args) {
        System.out.print("<---------------------------------------------<<Initialize A Default Object Of Student Class>>-------------------------------------------------->\n");
        TestStudent student1 = new TestStudent("jonh");
        System.out.println(student1.toString());
        System.out.print("<-------------------------------------------<<Initialize An Object Of Student Class With Setter>>----------------------------------------------->\n");
        TestStudent student2 = new TestStudent();
        student2.setName("max");
        student2.setClasses("C1221G1");
        System.out.println(student2.toString());
    }

    public TestStudent() {
    }

    public TestStudent(String name) {
        super(name);
    }
    //If access modifier of SuperClass is protected we can use protected or public before void setName(){}
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public void setClasses(String classOfStudent) {
        super.setClasses(classOfStudent);
    }
}
