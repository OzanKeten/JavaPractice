package practice_day08;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

// Soru: Verilen bir tarihten belirli gün sayısını ekleyerek gelecekteki bir tarihi hesaplayan bir kod dizgisi yazınız

//LocalDateTime:tarih,saat,dakika,saniye içerir.
//LocalDate:yıl,ay,gün içerir.
public class DateClass02 {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2023, 8, 12);
        //Baslangıc tarihi belirlendi
        LocalDate futureDate = calculateFuturDate(startDate, 120);
        //120 gün sonrasını hesaplayacak
        System.out.println("120 gün sonrası : " + futureDate);
    }

    static LocalDate calculateFuturDate(LocalDate startDate, long addDays) {
        return startDate.plus(addDays, ChronoUnit.DAYS);
    }

}


