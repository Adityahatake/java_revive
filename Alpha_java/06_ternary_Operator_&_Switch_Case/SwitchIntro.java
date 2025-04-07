public class SwitchIntro {
    public static void main(String[] args) {
        // Example variable
        int day = 3;

        // Switch Statement Syntax:
        // switch (variable) {
        //     case value1:
        //         // code
        //         break;
        //     case value2:
        //         // code
        //         break;
        //     default:
        //         // default code
        // }

        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }

        System.out.println("Day " + day + " is " + dayName);
    }
}
