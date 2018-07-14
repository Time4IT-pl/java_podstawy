package pl.time4it.dzien_3.daty;

import pl.time4it.dzien_3.kolekcje.Person;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        Person person = new PersonWraper("Jozef", "jozek@wp.pl", 50);

        System.out.println(dateParser(person)); //metoda parsujaca date wedlug wzorca.

        currentTimeFromCalendarClass();

        setCalendar(2012,"08",12,12,23,21);

        System.out.println(getWeeekAgo(-4));




    }

  public static void currentTimeFromCalendarClass() {
      Calendar calendar = Calendar.getInstance();
      System.out.println(calendar);
      System.out.println(calendar.getTime());

      SimpleDateFormat simpleDateFormat = new SimpleDateFormat("h:mm a");
      System.out.println(simpleDateFormat.format(calendar.getTime()));

      System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
      System.out.println(Calendar.AUGUST);

      System.out.println("wstecz: ");



  }


  public static void setCalendar(int y, String mOfY, int d, int h, int m, int s) {
        Calendar calendar = new GregorianCalendar(y,Integer.parseInt(mOfY),d,h,m,s);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        String cal =simpleDateFormat.format(calendar.getTime());
        System.out.println(cal);

  }

public static void CalendarToDateViceVersa() {
        Date date  = new Date();
        Calendar calendar = Calendar.getInstance();

        calendar.setTime(date);
        date = calendar.getTime();
}

    public static String getWeeekAgo(int weeks) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.WEEK_OF_MONTH, weeks);
        return dateFormat.format(calendar.getTime());
    }




    public static String dateParser(Person person) {
        System.out.println(person);
        System.out.println(((PersonWraper) person).getDate());
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String newDate = dateFormat.format(((PersonWraper) person).getDate());
        System.out.println(newDate);
        return newDate;
    }

}
