package StringBase;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo4 {
    public static void main(String[] args)throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd,HH:mm:ss");
        Date date = new Date();
        String str = simpleDateFormat.format(date);
        Date date1 = simpleDateFormat.parse(str);
        System.out.println(str);
        System.out.println(date1);
    }
}
