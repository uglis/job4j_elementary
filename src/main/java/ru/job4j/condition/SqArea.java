package ru.job4j.condition;

/**
 *  8. Стороны прямоугольника.[#257446]
 */
public class SqArea {
    /**
     * Площадь прямоугольника.
     *
     * @param p периметр.
     * @param k длина.
     * @return
     */
    public static double square(int p, int k) {
        int h = p / (2 * (k + 1));
        int l = h * k;
        return l * h;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);

        result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}
