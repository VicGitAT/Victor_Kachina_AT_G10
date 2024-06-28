package hometask.stringtask;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrintDateTime {

    public static void main(String[] args) {
        new PrintDateTime().printerDateAndTime();
    }

    public void printerDateAndTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM, uuuu'г.', HH 'часа(ов)' mm 'минут(а)'");
        String timeNow = now.format(formatter);
        System.out.println("Сейчас на дворе: " + timeNow);
    }
}
