import java.util.Scanner;

class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}

class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}

class SecException extends Exception {
    public SecException(String message) {
        super(message);
    }
}

class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public void setTime() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter hours: ");
            this.hours = Integer.parseInt(scanner.nextLine());
            if (this.hours < 0 || this.hours >= 24) {
                throw new HrsException("Hours should be between 0 and 23.");
            }
            System.out.print("Enter minutes: ");
            this.minutes = Integer.parseInt(scanner.nextLine());
            if (this.minutes < 0 || this.minutes >= 60) {
                throw new MinException("Minutes should be between 0 and 59.");
            }
            System.out.print("Enter seconds: ");
            this.seconds = Integer.parseInt(scanner.nextLine());
            if (this.seconds < 0 || this.seconds >= 60) {
                throw new SecException("Seconds should be between 0 and 59.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input format. Please enter integers for hours, minutes, and seconds.");
            setTime(); // Recursive call to retry input
        } catch (HrsException | MinException | SecException e) {
            System.out.println(e.getMessage());
            setTime(); // Recursive call to retry input
        }
    }

    public void displayTime() {
        System.out.println("Time: " + this.hours + " hours, " + this.minutes + " minutes, " + this.seconds + " seconds");
    }
}

public class Main {
    public static void main(String[] args) {
        Time t = new Time();
        t.setTime();
        t.displayTime();
    }
}
