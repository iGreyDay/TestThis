package needtest;

public class NumberUtils {

    //Метод getClosest2Ten1(int[] array) должен получать на вход неупорядоченный массив целых чисел и находить среди этих всех чисел одно число,
    //наиболее близкое к числу 10 и возвращать его; В случае, если самых близких чисел два (одно справа, другое слева от 10), то нужно вывести большее;
    //Напрмер в массиве [8, 14, 12, 0, -13] самых близких к числу 10 есть два числа 8 и 12 - значит нужно вывести 12;
    public static final int getClosest2Ten(int[] array) {
        Integer currElement;
        Integer min = 0;
        for (int i = 0; i < array.length; i++) {
            currElement = array[i];
            if (Math.abs(currElement - 10) < Math.abs(min - 10))
                min = currElement;
            else if ((currElement - 10) == Math.abs(10 - min))
                min = min > 10 ? min : currElement;
        }
        return min;
    }

}
