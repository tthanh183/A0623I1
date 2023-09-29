package com.codegym;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        if (player1Score == player2Score) {
            return getEqualScore(player1Score);
        } else if (player1Score >= 4 || player2Score >= 4) {
            return getAdvantageOrWinScore(player1Name, player2Name, player1Score, player2Score);
        } else {
            return getRegularScore(player1Score, player2Score);
        }
    }

    private static String getEqualScore(int score) {
        switch (score) {
            case 0:
                return "Love-All";
            case 1:
                return "Fifteen-All";
            case 2:
                return "Thirty-All";
            case 3:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

    private static String getAdvantageOrWinScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        int scoreDifference = player1Score - player2Score;
        if (scoreDifference == 1) {
            return "Advantage " + player1Name;
        } else if (scoreDifference == -1) {
            return "Advantage " + player2Name;
        } else if (scoreDifference >= 2) {
            return "Win for " + player1Name;
        } else {
            return "Win for " + player2Name;
        }
    }

    private static String getRegularScore(int player1Score, int player2Score) {
        String[] scoreNames = {"Love", "Fifteen", "Thirty", "Forty"};
        return scoreNames[player1Score] + "-" + scoreNames[player2Score];
    }
}
