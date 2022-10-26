package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public static void isLeapYear(int year) {
        if (year % 4 == 0){
            System.out.println("leap");
        } else {
            System.out.println("not leap");
        }
    }
    public static void main(String[] args){
        isLeapYear(2001);
    }
}
