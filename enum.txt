// Defining Enum
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumExample {
    public static void main(String[] args) {
        // Using enum
        Day today = Day.FRIDAY;

        System.out.println("Today is: " + today);

        // Enum in switch-case
        switch (today) {
            case MONDAY:
                System.out.println("Start of the work week!");
                break;
            case FRIDAY:
                System.out.println("Weekend is near!");
                break;
            case SUNDAY:
                System.out.println("Relax, it's Sunday!");
                break;
            default:
                System.out.println("Just another weekday...");
        }

        // Looping through all enum values
        System.out.println("\nAll Days:");
        for (Day d : Day.values()) {
            System.out.println(d);
        }
    }
}