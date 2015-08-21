public class CalendarPrinter
{
    public static void main (String[] args) {
        int x = 1;
        while (x <= 30) {
            if (x % 7 == 5 || x % 7 == 6)
            System.out.println("September" + x + "-WEEKEND");
            else if (x == 7)
            System.out.println("September" + x + "-NO SCHOOL (LABOR DAY)");
            else if (x == 25)
            System.out.println("September" + x + "-END OF THE MARKING PERIOD");
            else
            System.out.println("September" + x);
        x++;
        }
    }
}