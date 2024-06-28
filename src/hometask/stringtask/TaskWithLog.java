package hometask.stringtask;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class TaskWithLog {


    public void splitString(String text) {
        String[] arrayTest = text.split("\n");

        checkingForUniquenessIp:
        for (int i = 0; i < arrayTest.length; i++) {
            int ok = 0;
            int fail = 0;

            for (int k = i - 1; k >= 0; k--) {
                if (arrayTest[i].substring(34, 36).equalsIgnoreCase(arrayTest[k].substring(34, 36))) {
                    continue checkingForUniquenessIp;
                }
            }

            if (arrayTest[i].contains("true")) {
                ok++;
            } else if (arrayTest[i].contains("false")) {
                fail++;
            }

            for (int j = i; j < arrayTest.length - 1; j++) {
                if (arrayTest[i].substring(34, 36).equalsIgnoreCase(arrayTest[j + 1].substring(34, 36))) {
                    if (arrayTest[j + 1].contains("true")) {
                        ok++;
                    } else if (arrayTest[j + 1].contains("false")) {
                        fail++;
                    }
                }
            }
            String[] array = arrayTest[i].split(" ");
            System.out.println(array[1] + " ok: " + ok + "; fail: " + fail + ";");
        }
    }

    public String returnRandomLog() {
        Random random = new Random();
        int randomIp = 30;
        int randomQuantityLog = random.nextInt(20);
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.MM.uuuu");
        String timeNow = now.format(formatter);

        StringBuilder log = new StringBuilder(String.format("access_log.%s 212.168.101.%d %s\n", timeNow, random.nextInt(randomIp), random.nextBoolean()));
        for (int i = 0; i < randomQuantityLog; i++) {
            log.append(String.format("access_log.%s 212.168.101.%d %s\n", timeNow, random.nextInt(randomIp), random.nextBoolean()));
        }
        System.out.println(log);
        return log.toString();
    }
}
