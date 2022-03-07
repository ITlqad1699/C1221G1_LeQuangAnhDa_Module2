package collection_review.views;

import collection_review.controllers.CandidateControllers;

public class View {
    public static void main(String[] args) {
        CandidateControllers candidateControllers = new CandidateControllers();
        candidateControllers.displayMenu();
    }
}
