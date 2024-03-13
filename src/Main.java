public class Main {
    public static void main(String[] args) {
        int year = 2024;
        isThisYearLeap(year);
    }
    public static void isThisYearLeap(int year) {
        if (year >= 1584 && year % 4 == 0 && year % 100 != 0  || year % 400 == 0) {
            System.out.println("Год " + year + " является високосным");
        } else {
            System.out.println("Год " + year + " не является високосным");
        }
    }
}