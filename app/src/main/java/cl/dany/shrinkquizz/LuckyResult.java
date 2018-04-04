package cl.dany.shrinkquizz;

public class LuckyResult extends LuckyAnswer {


    public LuckyResult(boolean feelingUser) {
        super(feelingUser);
    }

    private String feelingStatus ()
    {
        Boolean status = isFeelingUser();
        if(status)
        {
            return "Esa es la actitud!";
        }else
        {
            return "Animate!";
        }
    }

    private String dayOfLucky()
    {
        Boolean needLucky = isLuckyDay();
        if(needLucky)
        {
            return ", es tu día de suerte";
        }else
        {
            return ", vendrán mejores tiempos :)";
        }

    }

    public String totalResult()
    {
        return feelingStatus()+" "+dayOfLucky();
    }


}
