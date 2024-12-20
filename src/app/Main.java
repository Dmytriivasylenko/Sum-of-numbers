package app;

// Прохід по int масиву.
// Підсумовування та відображення значень.
public class Main {

    public static void main(String[] args) {
        // Масив
        int[] numbers = {2, 8, 6, 1, 7, 9};

        // Традиційний цикл for для обчислення суми
        // значень елементів масиву.
        // numbers.length - довжина масиву

        int sum1 = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum1 += numbers[i];
            System.out.println((i + 1) + ") Num is " + numbers[i]
                    + ", Sum is " + sum1);
        }

        System.out.println("****************\nTotal sum is " + sum1 + "\n");


    }
}