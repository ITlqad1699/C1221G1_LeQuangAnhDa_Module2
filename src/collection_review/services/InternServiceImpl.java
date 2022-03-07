package collection_review.services;

import collection_review.models.Fresher;
import collection_review.models.Intern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InternServiceImpl implements IServices {
    Scanner scanner = new Scanner(System.in);
    private static List<Intern> interns = new ArrayList<>();
    static {
        interns.add(new Intern(3, "Le", "Da", 1999, "Cam Le", "0962654467", "lqad1649engineer@gmail.com", 2, "IT",6,"DHBK"));
    }
    @Override
    public void addNew() {
        System.out.println("Enter candidate's ID: ");
        int cadidateID = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter candidate's first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter candidate's last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter candidate's birth day: ");
        int birthDate = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter candidate's address: ");
        String address = scanner.nextLine();
        System.out.println("Enter candidate's number phone: ");
        String numberPhone = scanner.nextLine();
        System.out.println("Enter candidate's email: ");
        String email = scanner.nextLine();
        System.out.println("Enter candidate's major: ");
        String major = scanner.nextLine();
        System.out.println("Enter candidate's semester: ");
        int semester = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter candidate's university: ");
        String universityName = scanner.nextLine();
        int candidateType = 2;
        Intern newIntern = new Intern(cadidateID,firstName,lastName,birthDate,address,numberPhone,email,candidateType,major,semester,universityName);
        interns.add(newIntern);
    }

    @Override
    public void edit() {

    }

    @Override
    public void search() {
        System.out.println("enter first name or last name to search: ");
        String name = scanner.nextLine().toLowerCase();
        boolean flag = false;
        for (int i = 0; i < interns.size(); i++) {
            if (interns.get(i).getFirstName().toLowerCase().contains(name) || interns.get(i).getLastName().toLowerCase().contains(name)) {
                System.out.println(
                        interns.get(i).getFirstName() + " " + interns.get(i).getLastName() + " | "
                                + interns.get(i).getBirthDate() + " | "
                                + interns.get(i).getAddress() + " | "
                                + interns.get(i).getPhone() + " | "
                                + interns.get(i).getEmail() + " | "
                                + interns.get(i).getCandidateType());
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("not exist in list");
        }
    }

    @Override
    public void display() {
        for (Intern intern: interns){
            System.out.println(intern);
        }
    }

    @Override
    public void delete() {

    }
}
