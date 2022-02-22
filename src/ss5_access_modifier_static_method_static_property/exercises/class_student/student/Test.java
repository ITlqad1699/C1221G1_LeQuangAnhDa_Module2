package ss5_access_modifier_static_method_static_property.exercises.class_student.student;

public class Test {
    public static void main(String[] args) {
        System.out.print("<----------------------------------------------<<Initialize A Default Object Of Student Class>>------------------------------------------------->\n");
        Student student1 = new Student();
        System.out.println(student1);
        System.out.print("<--------------------------------------------<<Initialize An Object Of Student Class With Setter>>---------------------------------------------->\n");
        Student student2 = new Student();
        student2.setName("max");
        student2.setClasses("C1221G1");
        System.out.println(student2);
        System.out.print("<----Note:If access modifier is public, protected or default we don't need to call Object.toString, just print Object, toString methods will be called automatically----> ");
    }
}
