package Helper;

import java.text.SimpleDateFormat;

public class Date {

    public static int verifyDisabledDates(){
        java.util.Date currDate = new java.util.Date();
        SimpleDateFormat myOnlyformat = new SimpleDateFormat("d");
        return Integer.valueOf(myOnlyformat.format(currDate));
    }







}
