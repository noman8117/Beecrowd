import java.util.Scanner;
public class BEE_1061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String startDate = sc.nextLine();
        String startTime = sc.nextLine();
        String endDate = sc.nextLine();
        String endTime = sc.nextLine();
        int startDay = Integer.parseInt(startDate.split(" ")[1]);
        int endDay = Integer.parseInt(endDate.split(" ")[1]);
        String[] startParts = startTime.trim().split("\\s*:\\s*");
        String[] endParts = endTime.trim().split("\\s*:\\s*");
        int startHour = Integer.parseInt(startParts[0]);
        int startMinute = Integer.parseInt(startParts[1]);
        int startSecond = Integer.parseInt(startParts[2]);
        int endHour = Integer.parseInt(endParts[0]);
        int endMinute = Integer.parseInt(endParts[1]);
        int endSecond = Integer.parseInt(endParts[2]);
        int totalStartSeconds = startDay * 86400
                + startHour * 3600
                + startMinute * 60
                + startSecond;
        int totalEndSeconds = endDay * 86400
                + endHour * 3600
                + endMinute * 60
                + endSecond;
        int duration = totalEndSeconds - totalStartSeconds;
        int days = duration / 86400;
        duration %= 86400;
        int hours = duration / 3600;
        duration %= 3600;
        int minutes = duration / 60;
        int seconds = duration % 60;
        System.out.println(days + " dia(s)");
        System.out.println(hours + " hora(s)");
        System.out.println(minutes + " minuto(s)");
        System.out.println(seconds + " segundo(s)");
        sc.close();
    }
}