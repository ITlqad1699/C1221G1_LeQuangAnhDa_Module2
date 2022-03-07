package collection_review.controllers;

import collection_review.services.ExperienceServiceImpl;
import collection_review.services.FresherServiceImpl;
import collection_review.services.IServices;
import collection_review.services.InternServiceImpl;

import java.util.Scanner;

public class CandidateControllers {
    static IServices experienceCandidate = new ExperienceServiceImpl();
    static IServices fresherCandidate = new FresherServiceImpl();
    static IServices interCadidate = new InternServiceImpl();
    public void displayMenu(){
        int choice;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("CANDIDATE MANAGEMENT SYSTEM\n" +
                    "1. Experience\n" +
                    "2. Fresher\n" +
                    "3. Internship\n" +
                    "4. Searching\n" +
                    "5. Exit\n" +
                    "(Please choose 1 to Create Experience Candidate, 2 to Create Fresher Candidate, 3 to Internship Candidate,\n" +
                    "4 to Searching and 5 to Exit program).");
            System.out.print("Select Function: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    int choice1;
                    System.out.println("The Experience Candidates List:\n"+
                            "1. Add New\n"+
                            "2. Edit\n" +
                            "3. Delete\n"+
                            "4. Display\n"+
                            "5. Back");
                    choice1 = Integer.parseInt(scanner.nextLine());
                    switch (choice1){
                        case 1:
                            experienceCandidate.addNew();
                            break;
                        case 2:
                            experienceCandidate.edit();
                            break;
                        case 3:
                            experienceCandidate.delete();
                            break;
                        case 4:
                            experienceCandidate.display();
                        case 5:
                            break;
                    }
                    break;
                case 2:
                    int choice2;
                    System.out.println("The Experience Candidates List:\n"+
                            "1. Add New\n"+
                            "2. Edit\n" +
                            "3. Delete\n"+
                            "4. Display\n"+
                            "5. Back");
                    choice2 = Integer.parseInt(scanner.nextLine());
                    switch (choice2){
                        case 1:
                            fresherCandidate.addNew();
                            break;
                        case  2:
                            fresherCandidate.edit();
                            break;
                        case 3:
                            fresherCandidate.delete();
                            break;
                        case 4:
                            fresherCandidate.display();
                            break;
                        case 5:
                            break;
                    }
                    break;
                case 3:
                    int choice3;
                    System.out.println("The Experience Candidates List:\n"+
                            "1. Add New\n"+
                            "2. Edit\n" +
                            "3. Delete\n"+
                            "4. Display\n"+
                            "5. Back");
                    choice3 = Integer.parseInt(scanner.nextLine());
                    switch (choice3){
                        case 1:
                            interCadidate.addNew();
                            break;
                        case  2:
                            interCadidate.edit();
                            break;
                        case 3:
                            interCadidate.delete();
                            break;
                        case 4:
                            interCadidate.display();
                            break;
                        case 5:
                            break;
                    }
                    break;
                case 4:
                    int choice4;
                    System.out.println("The Experience Candidates List:\n"+
                            "1. Experiencs Candidates\n"+
                            "2. Fresher Candidates\n" +
                            "3. Intern Candidates\n"+
                            "4. Back");
                    choice4 = Integer.parseInt(scanner.nextLine());
                    switch (choice4){
                        case 1:
                            experienceCandidate.search();
                            break;
                        case 2:
                            fresherCandidate.search();
                            break;
                        case 3:
                            interCadidate.search();
                            break;
                        case 4:
                            break;
                    }
                    break;
                case 5:
                    System.exit(5);
                    break;
            }
        }
    }
}
