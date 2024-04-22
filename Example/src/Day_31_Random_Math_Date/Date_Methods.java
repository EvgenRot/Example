package Day_31_Random_Math_Date;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Date_Methods {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date.getTime()); // кол-во миллисекунд с 01-01-1970
        System.out.println(date); // currently time and date

        Date date1 = new Date(2023, 10, 02); // выводит ерунду, лучше использовать LocalDate
        System.out.println(date1);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(LocalDate.of(2020, 10, 3));

        System.out.println(ChronoUnit.DAYS.between(LocalDate.of(2020, 10, 3),
                LocalDate.of(2020, 12, 3))); // количество дней между датами

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        System.out.println(localTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"))); // время по маске

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))); // вывод даты по маске
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"))); // вывод даты и времени
    }
}
