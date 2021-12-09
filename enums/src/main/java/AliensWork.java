import java.time.DayOfWeek;

public class AliensWork {
    //Aliens don’t work on Fridays
    private static DayOfWeek freeDay = DayOfWeek.FRIDAY;

    public AliensWork() {
    }

    public void work() {
        switch (DateUtil.getCurrentDayOfWeek()) {
            case MONDAY:
                switch (freeDay) {
                    case MONDAY:
                        if (freeDay == DayOfWeek.MONDAY) {
                            System.out.println("This alien is not working on Monday");
                        } else {
                            System.out.println("This alien is now working");
                        }
                }
                break;
            case TUESDAY:
                if (freeDay == DayOfWeek.TUESDAY) {
                    System.out.println("This alien is not working on Thuesday");
                } else {
                    System.out.println("This alien is now working");
                }
            case WEDNESDAY:
                if (freeDay == DayOfWeek.WEDNESDAY) {
                    System.out.println("This alien is not working on Wednesday");
                } else {
                    System.out.println("This alien is now working");
                }
            case THURSDAY:
                if (freeDay == DayOfWeek.THURSDAY) {
                    System.out.println("This alien is not working on Thursday");
                } else {
                    System.out.println("This alien is now working");
                }
            case FRIDAY:
                if (freeDay == DayOfWeek.FRIDAY) {
                    System.out.println("This alien is not working on Friday");
                } else {
                    System.out.println("This alien is now working");
                }
            case SATURDAY:
                if (freeDay == DayOfWeek.SATURDAY) {
                    System.out.println("This alien is not working on Saturday");
                } else {
                    System.out.println("This alien is now working");
                }
            case SUNDAY:
                if (freeDay == DayOfWeek.SUNDAY) {
                    System.out.println("This alien is not working on Sunday");
                } else {
                    System.out.println("This alien is now working");
                }
                ;
            default:
                new IllegalAccessException("ERROR");

        }
    }


    public static java.time.DayOfWeek getFreeDay() {
        return freeDay;
    }



    public void setFreeDay(DayOfWeek freeDay) {
        this.freeDay = freeDay;
    }
}
