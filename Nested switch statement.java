import java.util.Scanner;

public class MovieSchedule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter screen number (1-4): ");
        int screen = sc.nextInt();

        System.out.print("Enter time slot (1 for 7-10, 2 for 10-1, 3 for 1-4): ");
        int timeSlot = sc.nextInt();

        String movieName = "";

        switch (screen) {
            case 1:
                switch (timeSlot) {
                    case 1: movieName = "Fast & Furious"; break;
                    case 2: movieName = "Avengers"; break;
                    case 3: movieName = "Inception"; break;
                    default: movieName = "Invalid Time Slot";
                }
                break;

            case 2:
                switch (timeSlot) {
                    case 1: movieName = "Interstellar"; break;
                    case 2: movieName = "The Batman"; break;
                    case 3: movieName = "The Lion King"; break;
                    default: movieName = "Invalid Time Slot";
                }
                break;

            case 3:
                switch (timeSlot) {
                    case 1: movieName = "Spiderman"; break;
                    case 2: movieName = "Iron Man"; break;
                    case 3: movieName = "Captain Marvel"; break;
                    default: movieName = "Invalid Time Slot";
                }
                break;

            case 4:
                switch (timeSlot) {
                    case 1: movieName = "Frozen"; break;
                    case 2: movieName = "Coco"; break;
                    case 3: movieName = "Encanto"; break;
                    default: movieName = "Invalid Time Slot";
                }
                break;

            default:
                movieName = "Invalid Screen Number";
        }

        System.out.println("Assigned Movie: " + movieName);
    }
}
