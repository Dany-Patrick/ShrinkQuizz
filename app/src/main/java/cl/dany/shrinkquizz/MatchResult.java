package cl.dany.shrinkquizz;

public class MatchResult extends MatchAnswer {

    public MatchResult(int loverAge, int userAge) {
        super(loverAge, userAge);
    }

    private int operation() {
        int lover = getLoverAge();
        int user = getUserAge();
        int total = (user + lover) * 2 / 100 ;
        return total;

    }

    public String resultOperation() {
        int valueOfMatch = operation();
        if (valueOfMatch >= 2) {
            return "Totalmente compatibles!!! <3";
        }
        else
        {
            return "De ninguna manera estarán juntos";
        }

    }
}
