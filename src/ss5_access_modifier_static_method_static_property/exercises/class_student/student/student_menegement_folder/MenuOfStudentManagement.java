package ss5_access_modifier_static_method_static_property.exercises.class_student.student.student_menegement_folder;

import java.util.Scanner;

public class MenuOfStudentManagement {
    static StudentManegement studentManegement = new StudentManegement();

    public static void main(String[] args) {
        System.out.print("<---------------------------<<This is an extension of my StudentClass, i made an application name: StudentManegement>>------------------------------------>\n");
        int choice;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Main Menu:\n" +
                    "1. Add New\n" +
                    "2. Edit\n" +
                    "3. Display\n" +
                    "4. Delete\n" +
                    "5. Search\n" +
                    "6. Exit\n"
            );
            System.out.print("Select Function: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Enter new student's name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new student's class: ");
                    String newClass = scanner.nextLine();
                    System.out.print("Enter new student's birthday: ");
                    String newBirth = scanner.nextLine();
                    System.out.print("Enter new student's id: ");
                    int newId = Integer.parseInt(scanner.nextLine());
                    studentManegement.addNewStudent(newName, newClass, newId, newBirth);
                    break;
                case 2:
                    System.out.print("Enter student's id that you want to edit ");
                    int editId = Integer.parseInt(scanner.nextLine());
                    System.out.println("Edit student's name: ");
                    String name = scanner.nextLine();
                    System.out.println("Edit student's class: ");
                    String classes = scanner.nextLine();
                    System.out.println("Edit student's birthday: ");
                    String birth = scanner.nextLine();
                    System.out.print("Edit student's id: ");
                    int id1 = Integer.parseInt(scanner.nextLine());
                    studentManegement.editStudent(editId, name, classes, id1, birth);
                    break;
                case 3:
                    studentManegement.showListStudent();
                    break;
                case 4:
                    System.out.print("Enter student's id you want to delete: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    studentManegement.deleteStudent(id);
                    break;
                case 5:
                    System.out.print("Enter student's id you want to find: ");
                    int id2 = Integer.parseInt(scanner.nextLine());
                    studentManegement.searchStudent(id2);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.print("no choice \n");
            }
        }
    }

}
