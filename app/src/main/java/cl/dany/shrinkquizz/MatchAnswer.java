package cl.dany.shrinkquizz;

public class MatchAnswer {

    private int loverAge;
    private int userAge;

    public MatchAnswer(int loverAge, int userAge) {
        this.loverAge = loverAge;
        this.userAge = userAge;
    }

    public int getLoverAge() {
        return loverAge;
    }

    public int getUserAge() {
        return userAge;
    }
}
