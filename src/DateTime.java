import java.time.*;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        System.out.println("Сейчас: "+date);

        date = date.withYear(2022);
        System.out.println("Теперь время: "+date);

        String fields = "\nГод : \t\t\t"+date.getYear();
        fields += "\nДень в году: \t\t\t"+date.getDayOfYear();
        System.out.println(fields);
    }
}
