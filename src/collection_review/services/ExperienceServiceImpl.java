package collection_review.services;

import collection_review.models.Experience;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExperienceServiceImpl implements IServices {
    Scanner scanner = new Scanner(System.in);
    private static List<Experience> experiences = new ArrayList<>();

    static {
        experiences.add(new Experience(1, "Le", "Da", 1999, "Cam Le", "0962654467", "lqad1649engineer@gmail.com", 0, 3, "java, C++, Python"));
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
        int candidateType = 0;
        System.out.println("Enter candidate's expericens year: ");
        int expYear = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter candidate's skill: ");
        String proSkill = scanner.nextLine();
        Experience newExperience = new Experience(cadidateID, firstName, lastName, birthDate, address, numberPhone, email, candidateType, expYear, proSkill);
        experiences.add(newExperience);
    }

    @Override
    public void edit() {

    }

    @Override
    public void search() {
        System.out.println("enter first name or last name to search: ");
        String name = scanner.nextLine().toLowerCase();
        boolean flag = false;
        for (int i = 0; i < experiences.size(); i++) {
            if (experiences.get(i).getFirstName().toLowerCase().contains(name) || experiences.get(i).getLastName().toLowerCase().contains(name)) {
                System.out.println(
                        experiences.get(i).getFirstName() + " " + experiences.get(i).getLastName() + " | "
                                + experiences.get(i).getBirthDate() + " | "
                                + experiences.get(i).getAddress() + " | "
                                + experiences.get(i).getPhone() + " | "
                                + experiences.get(i).getEmail() + " | "
                                + experiences.get(i).getCandidateType());
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("not exist in list");
        }
    }


    @Override
    public void display() {
        for (Experience experience : experiences) {
            System.out.println(experience);
        }
    }

    @Override
    public void delete() {

    }
}
