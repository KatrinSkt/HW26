import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int number : nums) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }

        System.out.println("Задание 2");
        Collections.sort(nums);
        int pervNum = Integer.MIN_VALUE;
        for (int number : nums) {
            if (number % 2 == 0 && number!=pervNum) {
                System.out.println(number);
                pervNum = number;
            }
        }


        System.out.println("Задание 3");

        List<String> words = new ArrayList<>(List.of("Гусененок", "Утка", "Собака", "Ящерица", "Дикобраз", "Хомяк", "Гусененок", "Утка", "Собака", "Ящерица", "Дикобраз", "Хомяк"));
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);

        System.out.println("Задание 4");
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Map<String, Integer> duplicate = new HashMap<>();
        for (String string : strings) {
            if (!duplicate.containsKey(string)){
                duplicate.put(string, 1);
            } else {
                duplicate.put(string, duplicate.get(string)+1);
            }
        }
        System.out.println(duplicate.values());
    }
}
// Напишите код, который выводит в консоль количество дублей для каждого уникального слова.
// Код должен работать с любой последовательностью и объемом списка слов.

//- Критерии проверки
//    - В консоль выводится число повторений одного слова
//    - Если в одном тексте разные слова повторяются, то в консоль нужно вывести несколько чисел
//    - Порядок числовых значений в консоли значения не имеет
//    - Код работает с любой последовательностью и объемом списка слов.
//
//Если вы используете предложенный нами пример, то в консоли должно в произвольном порядке распечататься:
//1
//2
//3
