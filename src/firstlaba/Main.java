package firstlaba;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {


        food[] breakfast = new food[20];

        int itemsSoFar = 0;
        int AmountCheese = 0;
        int AmountApple = 0;
        int AmountCoffee = 0;


        for (String i : args) {
            String[] parts = i.split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new cheese();
                AmountCheese++;
            }

            if (parts[0].equals("Apple")) {
                breakfast[itemsSoFar] = new apple(parts[1]);
                AmountApple++;
            }

            /*if (parts[0].equals("Coffee ")) {
                breakfast[itemsSoFar] = new Coffee(parts[3]);
                AmountCoffee++;

            }*/
            if (parts[0].equals("Coffee")) {
                breakfast[itemsSoFar] = new Coffee(parts[1]);
                AmountCoffee++;

            }
            // ... Продолжается анализ других продуктов для завтрака
            itemsSoFar++;

            // Перебор всех элементов массива
            for (food item : breakfast)
                if (item != null)
                    // Если элемент не null – употребить продукт
                    item.consume();
                else
                    // Если дошли до элемента null – значит достигли конца
                    // списка продуктов, ведь 20 элементов в массиве было
                    // выделено с запасом, и они могут быть не
                    // использованы все
                    break;

            System.out.print("Cheese: ");
            System.out.println(AmountCheese);
            System.out.print("Apple: ");
            System.out.println(AmountApple);
            System.out.print("Coffee: ");
            System.out.println(AmountCoffee);
            System.out.print("Total: ");
            System.out.print(itemsSoFar);
        }

    }
}
