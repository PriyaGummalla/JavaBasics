package Test1.DateLab;

import java.time.LocalDate;

public class LocalDateTest1 {

    public static void main(String args[]) {
        LocalDate localDate = LocalDate.of(2012, 5, 12);
        localDate.plusMonths(2);
        localDate.plusDays(3);
        System.out.println(localDate);
    }
}
