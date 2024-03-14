public class Main {
    public static void main(String[] args) {
        // задача 1
        int year = 2024;
        isThisYearLeap(year);
        // задача 2
        int clientOS = 1; // 0 - iOS, 1 - Android
        int clientDeviceYear = 2015;
        printSetupInvitation(clientOS, clientDeviceYear);
        // задача 3
        int deliveryDistance = 0;// входные данные: расстояние до заказчика в километрах
        int oneDayDistance = 20;// входные данные: расстояние для доставки в течение суток
        int nextDayDistance = 60;// входные данные: расстояние для доставки в течение двух суток
        int maxDistance = 100;// входные данные: радиус зоны покрытия
        calculateDeliveryTime(deliveryDistance, oneDayDistance, nextDayDistance, maxDistance);
    }
    public static void isThisYearLeap(int year) {
        if (year >= 1584 && (year % 4 == 0 && year % 100 != 0  || year % 400 == 0)) {
            System.out.println("Год " + year + " является високосным");
        } else {
            System.out.println("Год " + year + " не является високосным");
        }
    }
    public static void printSetupInvitation(int clientOS, int clientDeviceYear){
        String system;
        if (clientOS == 0) {
            system = "iOS";
        } else if (clientOS == 1){
            system = "Android";
        } else {
            System.out.println("Операционная система Вашего телефона не поддерживает приложение");
            return;
        }
        String version = "версию";
        if (clientDeviceYear < 2015) {
            version = "облегченную версию";
        }
        System.out.println("Установите " + version + " приложения для " + system + " по ссылке:");
    }
    public static void calculateDeliveryTime(int deliveryDistance, int oneDayDistance, int nextDayDistance, int maxDistance) {
        int perDayDistance = nextDayDistance - oneDayDistance;
        if (deliveryDistance > maxDistance) {
            System.out.println("Вы находитесь слишком далеко от банка, доставка невозможна");
        } else if (deliveryDistance >= 0) {
            int deliveryTime = 1;
            for (int distance = oneDayDistance; distance <= deliveryDistance; distance+= perDayDistance) {
                deliveryTime++;
            }
            String dayCount = switch (deliveryTime % 10) {
                case 1 -> " день";
                case 2, 3, 4 -> " дня";
                default -> " дней";
            };
            if (deliveryTime / 10 % 10 == 1) {
                dayCount = " дней";
            }
            System.out.println("Вы находитесь за " + deliveryDistance + " км от банка, доставка потребует " + deliveryTime + dayCount);
        } else {
            System.out.println("Ошибка, отрицательное расстояние!");
        }
    }
}