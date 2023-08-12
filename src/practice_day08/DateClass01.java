package practice_day08;
// Soru: Java'da tarih ve saat bilgisini temsil etmek için hangi sınıflar kullanılır? Verilen
// bir örnekle tarih ve saat bilgisini nasıl elde edebileceğinizi gösteriniz.

import java.time.LocalDateTime;
import java.util.Locale;

public class DateClass01 {
    public static void main(String[] args) {
        LocalDateTime currentTime=LocalDateTime.now();
        System.out.println("Su anki saat : "+currentTime);
    }
}
