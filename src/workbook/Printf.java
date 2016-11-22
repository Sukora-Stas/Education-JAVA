package workbook;

/**
 * Created by Sukora Stas on 12.10.2016.
 */
public class Printf {
    public static void main(String[] args) {
        System.out.printf("%-5s%-11s%-25s%-11s%n", "Код", "Заединиц", "Валюты", "РублейРФ");
        System.out.println("-----------------------------------------------------");
        System.out.printf("%-5s%-11d%-25s%-11.4f%n", "AUD", 1, "Австралийскийдоллар", 44.9883);
        System.out.printf("%-5s%-11d%-25s%-11.4f%n", "GBP", 1, "Фунтстерлингов", 86.8429);
        System.out.printf("%-5s%-11d%-25s%-11.4f%n", "BYR", 10000, "Белорусскийрубль", 39.7716);
        System.out.printf("%-5s%-11d%-25s%-11.4f%n", "DKK", 10, "Датскаякрона", 84.9192);
        System.out.printf("%-5s%-11d%-25s%-11.4f%n", "USD", 1, "ДолларСША", 58.4643);
        System.out.printf("%-5s%-11d%-25s%-11.4f%n", "EUR", 1, "Евро", 63.3695);
        System.out.printf("%-5s%-11d%-25s%-11.4f%n", "KZT", 100, "Казахскийтенге", 31.4654);
    }
}
