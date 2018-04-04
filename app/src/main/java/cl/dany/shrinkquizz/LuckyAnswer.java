package cl.dany.shrinkquizz;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LuckyAnswer {

    private boolean luckyDay;
    private boolean feelingUser;



    public LuckyAnswer(boolean feelingUser) {
        this.feelingUser = feelingUser;
        luckyDay = new LuckyDate().haveLucky();
    }

    public boolean isLuckyDay() {
        return luckyDay;
    }

    public boolean isFeelingUser() {
        return feelingUser;
    }

    private class LuckyDate
    {
        public boolean haveLucky()
        {
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd");
            int day = Integer.parseInt(simpleDateFormat.format(date));
            if(day == 3)
            {
                return true;
            }else
            {
                return false;
            }
        }
    }
}
