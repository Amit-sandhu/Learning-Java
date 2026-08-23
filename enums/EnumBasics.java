package enums;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

enum Level {
    LOW(1), MEDIUM(2), HIGH(3);      // enums can carry their own fields and constructors

    final int severity;

    Level(int severity){
        this.severity = severity;
    }
}

public class EnumBasics {
    public static void main(String[] args){
        Day today = Day.WEDNESDAY;

        if(today == Day.SATURDAY || today == Day.SUNDAY){
            System.out.println("It's the weekend!");
        }
        else{
            System.out.println("It's a weekday: "+today);
        }

        // switch works cleanly with enums
        switch(today){
            case MONDAY -> System.out.println("Start of the work week");
            case FRIDAY -> System.out.println("Almost the weekend");
            default -> System.out.println("Just a regular day");
        }

        for(Level l : Level.values()){
            System.out.println(l+" has severity "+l.severity);
        }
    }
}

// Practice: Add a method isWeekend() to the Day enum itself that
// returns true only for SATURDAY and SUNDAY.
