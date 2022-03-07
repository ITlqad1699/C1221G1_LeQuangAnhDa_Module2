package collection_review.services;

import collection_review.models.Fresher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FresherServiceImpl implements IServices {
    Scanner scanner = new Scanner(System.in);
    private static List<Fresher> freshers = new ArrayList<>();

    static {
        freshers.add(new Fresher(1, "Le", "Da", 1999, "Cam Le", "0962654467", "lqad1649engineer@gmail.com", 1, "22/12/2022", "good", "DHBK"));
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
        int candidateType = 1;
        System.out.println("Enter graduation date: ");
        String graduationDate = scanner.nextLine();
        System.out.println("Enter graduation rank1: ");
        String graduationRank = scanner.nextLine();
        System.out.println("Enter university: ");
        String education = scanner.nextLine();
        Fresher newFresher = new Fresher(cadidateID, firstName, lastName, birthDate, address, numberPhone, email, candidateType, graduationDate, graduationRank, education);
        freshers.add(newFresher);
    }

    @Override
    public void edit() {

    }

    @Override
    public void search() {
        System.out.println("enter first name or last name to search: ");
        String name = scanner.nextLine().toLowerCase();
        boolean flag = false;
        for (int i = 0; i < freshers.size(); i++) {
            if (freshers.get(i).getFirstName().toLowerCase().contains(name) || freshers.get(i).getLastName().toLowerCase().contains(name)) {
                System.out.println(
                        freshers.get(i).getFirstName() + " " + freshers.get(i).getLastName() + " | "
                                + freshers.get(i).getBirthDate() + " | "
                                + freshers.get(i).getAddress() + " | "
                                + freshers.get(i).getPhone() + " | "
                                + freshers.get(i).getEmail() + " | "
                                + freshers.get(i).getCandidateType());
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("not exist in list");
        }
    }

    @Override
    public void display() {
        for (Fresher fresher : freshers) {
            System.out.println(fresher);
        }
    }

    @Override
    public void delete() {

    }
}
