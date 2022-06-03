package gfg;

public class JavaDateAndDay{
    public static String findDay(int Day, int Month, int Year){
        //Code Here
        // java.time.LocalDate dt = java.time.LocalDate.of(Year, Month, Day);
        // java.time.DayOfWeek day = dt.getDayOfWeek();
        // return day.getDisplayName(java.time.format.TextStyle.FULL, Locale.ENGLISH).toUpperCase();
        java.time.LocalDate dt = java.time.LocalDate.of(Year, Month, Day);
        return dt.getDayOfWeek().name();
    }
}
