import java.time.LocalTime;
import java.util.Scanner;

// Classe TimeFactory:
class TimeFactory {
    // TODO: Crie o método estático para criar um objeto LocalTime a partir de uma string:

    //TODO: Implemente o LocalTime.parse() para converter a string em LocalTime:

}

public class MeetingScheduler {

    private static final LocalTime MIN_TIME = LocalTime.of(9, 0);
    private static final LocalTime MAX_TIME = LocalTime.of(18, 0);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String desiredTimeInput = scanner.nextLine();
        //TODO: Implemente o TimeFactory.createTime() para converter desiredTimeInput em LocalTime:



        String currentTimeInput = scanner.nextLine();
        //TODO: Implemente o TimeFactory.createTime() para converter currentTimeInput em LocalTime:


        if (isMeetingSchedulable(desiredTime)) {
            System.out.println("Reuniao pode ser agendada.");
        } else {
            System.out.println("Reuniao nao pode ser agendada. Horario fora do intervalo permitido.");
        }
    }

    private static boolean isMeetingSchedulable(LocalTime desiredTime) {
        return !desiredTime.isBefore(MIN_TIME) && !desiredTime.isAfter(MAX_TIME);
    }
}