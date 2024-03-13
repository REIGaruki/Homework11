public class Main {
    public static void main(String[] args) {
        int year = 2024;
        isThisYearLeap(year);
        int clientOS = 0; // 0 - iOS, 1 - Android
        int clientDeviceYear = 2015;
        printSetupInvitation(clientOS, clientDeviceYear);
    }
    public static void isThisYearLeap(int year) {
        if (year >= 1584 && year % 4 == 0 && year % 100 != 0  || year % 400 == 0) {
            System.out.println("Год " + year + " является високосным");
        } else {
            System.out.println("Год " + year + " не является високосным");
        }
    }
    public static void printSetupInvitation(int clientOS, int clientDeviceYear){
        String system = "Вашего телефона";
        String version = "версию";
        if (clientOS == 0) {
            system = "iOS";
        } else if (clientOS == 1){
            system = "Android";
        }
        if (clientDeviceYear < 2015) {
            version = "облегченную версию";
        }
        System.out.println("Установите " + version + " приложения для " + system + " по ссылке:");
    }
}