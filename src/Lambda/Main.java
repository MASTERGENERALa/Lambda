package Lambda;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Створення списку та заповнення рандомними числами
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }

        // Виведення списку з рандомними числами
        System.out.println("Список з рандомними числами: " + numbers);

        // Знаходження суми квадратів елементів списку
        int sumOfSquares = numbers.stream()
                .map(number -> number * number) // Зведення квадрату кожного елемента
                .reduce(0, Integer::sum); // Згортка всіх елементів в одне число

        // Виведення суми квадратів
        System.out.println("Сума квадратів усіх елементів списку: " + sumOfSquares);
    }
}

