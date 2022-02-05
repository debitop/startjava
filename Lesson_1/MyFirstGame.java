public class MyFirstGame {
    public static void main(String[] args) {
        int computerNumber = 33;
        int playerNumber = 55;
        int num1 = 1;
        int num2 = 100;
        while (computerNumber != playerNumber) {
            System.out.println("Введите число от " + num1 + " до " + num2);
            System.out.println("Вы ввели " + playerNumber);
            if (playerNumber > num2 || playerNumber < num1) {
                System.out.println("Вы ввели число не в заданном диапазоне, введите еще раз ");
            } else {
                if (playerNumber > computerNumber) {
                    num2 = playerNumber;
                    System.out.println("Данное число больше того, что загадал компьютер");
                    playerNumber = (num2 + num1) / 2;
                } else {
                    num1 = playerNumber;
                    System.out.println("Данное число меньше того, что загадал компьютер");
                    playerNumber = (playerNumber + num2) / 2;
                }
            }
            if (computerNumber == playerNumber) {
                System.out.println("Вы ввели 33 - Поздравляю, вы угадали");
            }
        }
    }
}

// Напишите игру Угадай число:
// компьютер "загадывает" целое число от (0 до 100], которое необходимо угадать
// после каждой неудачной попытки выводите подсказку:
// "Данное число больше того, что загадал компьютер" или
// "Данное число меньше того, что загадал компьютер"
// если число угадано — "Поздравляю, число угадано!"
// меняйте значение переменной, хранящей числа игрока, автоматически по какому-то простому алгоритму (без применения ввода с клавиатуры или генерации рандомных чисел)
// игра продолжается до тех пор, пока число не будет угадано