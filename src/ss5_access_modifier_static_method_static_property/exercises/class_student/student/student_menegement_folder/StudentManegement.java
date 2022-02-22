package ss5_access_modifier_static_method_static_property.exercises.class_student.student.student_menegement_folder;

import ss5_access_modifier_static_method_static_property.exercises.class_student.student.Student;

import java.util.Scanner;

public class StudentManegement extends Student {
    private static Student[] students = new Student[100];

    static {
        students[0] = new Student("max", "C11", 1, "1-6");
        students[1] = new Student("jonh", "C11", 2, "16-6");
        students[2] = new Student("micheal", "C11", 3, "2-6");
        students[3] = new Student("alex", "C11", 4, "2-2");
    }


    public void showListStudent() {
        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            } else {
                break;
            }
        }
    }

    public void addNewStudent(String name, String classOfStudent, int id, String birthday) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = new Student(name, classOfStudent, id, birthday);
                break;
            }
        }
        showListStudent();
    }

    public void deleteStudent(int id) {
//        for (int i = 0; i < students.length; i++) {
//            if (students[i].getId() == id) {
//                students[i] = null;
//                break;
//            }
//        }
        for (Student student: students){
            if (student.getId() == id){
                student = null;
                break;
            }
        }
        showListStudent();
    }

    public void editStudent(int editId, String name, String classOfStudent, int id, String birthday) {
//        for (Student student : students) {
//            if (student.getId() == editId) {
//                student.setName() = name;
//                student.setClasses() = classOfStudent;
//                student.setBirthday() = birthday;
//                student.setId() = id;
//                break;
//            }
//        }
        showListStudent();
    }

    public void searchStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("we can find student by id = " + id + "\nhe/she is: \n" +
                        "<-------------------------------------------->\n" +
                        student +
                        "\n<-------------------------------------------->\n");
                break;
            } else {
                System.out.println("Can't find student by id = " + id);
                break;
            }
        }
    }
}
