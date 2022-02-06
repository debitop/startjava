public class Cycle {
    public static void main(String[] args) {
        //Выведите на консоль с помощью цикла for все числа от [0, 20]
        System.out.println("Выведите на консоль с помощью цикла for все числа от [0, 20]");
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }
        System.out.println("");

        //Выведите на консоль с помощью цикла while все числа от [6, -6] (с шагом итерации 2)
        System.out.println("Выведите на консоль с помощью цикла while все числа от [6, -6] (с шагом итерации 2)");
        int num = 6;
        while(num >= -6){
            System.out.println(num);
            num -= 2;
        }
        System.out.println("");

        //Подсчитайте с помощью цикла do-while сумму нечетных чисел от [10, 20]. Выведите ее на консоль
        System.out.println("Подсчитайте с помощью цикла do-while сумму нечетных чисел от [10, 20]. Выведите ее на консоль");
        int sum = 0;
        int num1 = 11;
        do {
        sum += num1;
        num1 += 2;
        } while(num1 <= 20);
        System.out.println(sum);
    }
}
