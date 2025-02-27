package ru.fmd;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int a=0, b=0, c=0;
        Map<String, Integer> answers = new LinkedHashMap<>();

        System.out.println("Введите 3 числа");

        try {
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
        }
        catch (InputMismatchException ex){
            System.out.println("Введённое значние не является целым числом. Программа будет завершена");
            return;
        }

        if(a % 5 == 0)
            answers.put("a", a);
        if(b % 5 == 0)
            answers.put("b", b);
        if(c % 5 == 0)
            answers.put("c", c);

        if(answers.isEmpty())
            System.out.println("нет значений, кратных 5");
        else {
            System.out.println(answers.entrySet().stream()
                    .map(e -> e.getKey() + "=" + e.getValue())
                    .collect(Collectors.joining(", "))
            );
        }

        System.out.printf("Результат целочисленного деления a на b: %d\n", a/b);
        System.out.printf("Результат деления a на b: %f\n", (float)a/(float)b);
        System.out.printf("Результат деления a на b с округлением в большую сторону: %d\n",
                (int)Math.ceil((float)a/(float)b));
        System.out.printf("Результат деления a на b с округлением в меньшую сторону: %d\n",
                (int)Math.floor((float)a/(float)b));
        System.out.printf("Результат деления a на b с математическим округлением: %d\n",
                Math.round((float)a/(float)b));
        System.out.printf("Остаток от деления b на c: %d\n", b%c);
        System.out.printf("Наименьшее значение из a и b: %d\n", Math.min(a, b));
        System.out.printf("Наибольшее значение из b и c: %d\n", Math.max(b, c));
    }
}