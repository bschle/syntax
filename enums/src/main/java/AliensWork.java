import java.time.DayOfWeek;

public class AliensWork {
    //Aliens don’t work on Fridays
    private static final DayOfWeek freeDay = DayOfWeek.FRIDAY;

    public AliensWork() {
    }

    public void work() {
        switch (DateUtil.getCurrentDayOfWeek()) {
            case MONDAY:
                if (freeDay == DayOfWeek.MONDAY) {
                    System.out.println("This alien is not working on Monday");
                } else {
                    System.out.println("This alien is now working");
                }
                break;
            case TUESDAY:
                if (freeDay == DayOfWeek.TUESDAY) {
                    System.out.println("This alien is not working on Thuesday");
                } else {
                    System.out.println("This alien is now working");
                }
                break;
            case WEDNESDAY:
                if (freeDay == DayOfWeek.WEDNESDAY) {
                    System.out.println("This alien is not working on Wednesday");
                } else {
                    System.out.println("This alien is now working");
                }
                break;
            case THURSDAY:
                if (freeDay == DayOfWeek.THURSDAY) {
                    System.out.println("This alien is not working on Thursday");
                } else {
                    System.out.println("This alien is now working");
                }
                break;
            case FRIDAY:
                if (freeDay == DayOfWeek.FRIDAY) {
                    System.out.println("This alien is not working on Friday");
                } else {
                    System.out.println("This alien is now working");
                }
                break;
            case SATURDAY:
                if (freeDay == DayOfWeek.SATURDAY) {
                    System.out.println("This alien is not working on Saturday");
                } else {
                    System.out.println("This alien is now working");
                }
                break;
            case SUNDAY:
                if (freeDay == DayOfWeek.SUNDAY) {
                    System.out.println("This alien is not working on Sunday");
                } else {
                    System.out.println("This alien is now working");
                }
                break;
            default:
                new IllegalAccessException("ERROR");
        }

    }




    public static java.time.DayOfWeek getFreeDay() {
        return freeDay;
    }

}
