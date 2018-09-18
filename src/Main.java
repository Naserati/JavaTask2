import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        prepareGift();
    }

    public static void prepareGift() throws IOException {
        ArrayList<Sweets> sweets = new ArrayList<>();
        boolean formed = false;
        int totalPrice = 0;
        int totalWeight = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Нажмите соответствующую цифру, чтобы добавить сладость в подарок:");
        System.out.println("'1' - конфеты \"Красная шапочка\"");
        System.out.println("'2' - конфеты \"Ананас\"");
        System.out.println("'3' - леденец \"Чупа-чупс\"");
        System.out.println("'4' - закончить выбор");
        while (!formed) {

            String choice = reader.readLine();

            switch (choice) {
                case "1":
                    Candy candyRH = new Candy("Конфеты \"Красная Шапочка\"", 200, 1000, "Мягкий вкус");
                    sweets.add(candyRH);
                    totalPrice += candyRH.getPrice();
                    totalWeight += candyRH.getWeight();
                    System.out.println("Конфеты \"Красная Шапочка\" добавлены в подарок");
                    break;
                case "2":
                    Candy candyAnanas = new Candy("Конфеты \"Ананас\"", 119, 150, "Вкус детства");
                    sweets.add(candyAnanas);
                    totalPrice += candyAnanas.getPrice();
                    totalWeight += candyAnanas.getWeight();
                    System.out.println("Конфеты \"Ананас\" добавлены в подарок");
                    break;
                case "3":
                    Lollypop chupachups = new Lollypop("Леденец \"Чупа-чупс\"", 59, 50, "Трудно открыть");
                    sweets.add(chupachups);
                    totalPrice += chupachups.getPrice();
                    totalWeight += chupachups.getWeight();
                    System.out.println("Леденец \"Чупа-чупс\" добавлен в подарок");
                    break;
                case "4":
                    formed = true;
                    break;
            }


        }
        int count = 0;
        System.out.println("\nПодарок состоит из:");
        for (Sweets sweet:sweets) {
            count++;
            System.out.println(count + ". " + sweet.getName() + " - " + sweet.getAdditionalInformation());
        }
        System.out.println(String.format("\nОбщий вес подарка: %s гр.\nОбщая цена подарка: %s руб.", totalWeight, totalPrice));
    }

}
