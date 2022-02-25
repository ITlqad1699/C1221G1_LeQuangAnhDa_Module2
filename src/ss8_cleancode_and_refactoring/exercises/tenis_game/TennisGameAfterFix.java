package ss8_cleancode_and_refactoring.exercises.tenis_game;

public class TennisGameAfterFix {

    public static final int Zero = 0;
    public static final int One = 1;
    public static final int Two = 2;
    public static final int Three = 3;

    public static String getScore(String player1Name, String player2Name, int scoreOfPlayer1, int scoreOfPlayer2) {
        String callingScore;
        int coparatingScore = scoreOfPlayer1;
        boolean isEqual = scoreOfPlayer1 == scoreOfPlayer2;
        boolean isGreaterOrEqualFour = (scoreOfPlayer1 >= 4) || (scoreOfPlayer2 >= 4);
        if (isEqual) {
            callingScore = checkDraws(coparatingScore);
        } else if (isGreaterOrEqualFour) {
            callingScore = checkWinner(scoreOfPlayer1, scoreOfPlayer2);
        } else {
            callingScore = callScore(scoreOfPlayer1, scoreOfPlayer2);
        }
        return callingScore;
    }

    public static String checkDraws(int comparating) {
        String drawsScore;
        switch (comparating) {
            case Zero:
                drawsScore = "Love-All";
                break;
            case One:
                drawsScore = "Fifteen-All";
                break;
            case Two:
                drawsScore = "Thirty-All";
                break;
            case Three:
                drawsScore = "Forty-All";
                break;
            default:
                drawsScore = "Deuce";
                break;
        }
        return drawsScore;
    }


    public static String checkWinner(int tennisScore1, int tennisScore2) {
        String displayingWinner;
        int minusResult = tennisScore1 - tennisScore2;
        boolean advantagePlayer1 = (minusResult == 1);
        boolean advantagePlayer2 = (minusResult == -1);
        boolean winForPlayer1 = (minusResult >= 2);
        if (advantagePlayer1) {
            displayingWinner = "Advantage player1";
        } else if (advantagePlayer2) {
            displayingWinner = "Advantage player2";
        } else if (winForPlayer1) {
            displayingWinner = "Win for player1";
        } else {
            displayingWinner = "Win for player2";
        }
        return displayingWinner;
    }
    //made object score from StringBuilder class and calling .append method for += "string"
    public static String callScore(int tennisScore1, int tennisScore2) {
        StringBuilder score = new StringBuilder();
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                tempScore = tennisScore1;
            }
            else {
                score.append("-");
                tempScore = tennisScore2;
            }
            switch (tempScore) {
                case Zero:
                    score.append("Love");
                    break;
                case One:
                    score.append("Fifteen");
                    break;
                case Two:
                    score.append("Thirty");
                    break;
                case Three:
                    score.append("Forty");
                    break;
            }
        }
        return score.toString();
    }
}
