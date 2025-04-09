public class Main {
    /**
     * metodo para devolver la puntuacion de tenis
     */
    public static String getScore(int resultadoJ1, int resultadoJ2) {
        String score = "";
        int tempScore=0;

        if (resultadoJ1 == resultadoJ2) {
            score = ifpuntuacionIgual(resultadoJ1);
        }
        else if (resultadoJ1 >=4 || resultadoJ2 >=4)
        {
            int minusResult = resultadoJ1-resultadoJ2;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = resultadoJ1;
                else { score+="-"; tempScore = resultadoJ2;}
                switch(tempScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }

        }
    return score;
    }

    private static String ifpuntuacionIgual(int m_score1) {
        String score;
        switch (m_score1)
        {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }
}