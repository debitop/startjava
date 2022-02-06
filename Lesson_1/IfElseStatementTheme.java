public class IfElseStatementTheme {
    public static void main(String[] args) {
        //Перевод псевдокода на язык Java
        int age = 55;
        System.out.println("Перевод псевдокода на язык Java");
        if (age > 20) {
            System.out.println("Ваш возраст больше 20");
        } else {
            System.out.println("Ваш возраст меньше или равен 20");
        }
        boolean manSex = true;
        if (!manSex) {
            System.out.println("Ваш пол - женский");
        }
        float height = 1.60f;
        if (height < 1.80) {
            System.out.println("Ваш рост меньше 1.80");
        } else {
            System.out.println("Ваш рост больше или равен 1.80");
        }
        char firstLetterName = "Имя".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Ваше имя начинается на букву M");
        } else if (firstLetterName == 'I') {
            System.out.println("Ваше имя начинается на букву I");
        } else {
            System.out.println("Ваше имя не начинается ни на I ни на M");
        }
        System.out.println();

        //Поиск максимального и минимального числа
        int numOne = 15;
        int numTwo = 30;
        System.out.println("Поиск максимального и минимального числа");
        if (numOne > numTwo) {
            System.out.println("Максимум " + numOne + " Минимум " + numTwo);
        } else {
            System.out.println("Максимум " + numTwo + " Минимум " + numOne);
        }
        System.out.println();

        //Работа с числом 23
        int numThree = 23;
        System.out.println("Работа с числом 23");
        if (numThree == 0) {
            System.out.print("ноль ");
        } else if (numThree % 2 == 0) {
            System.out.print("четное ");
        } else {
            System.out.print("не четное ");
        }
        if (numThree > 0) {
            System.out.println("положительное ");
        } else if (numThree < 0) {
            System.out.println("отрицательное");
        }
        System.out.println();

        //Поиск общей цифры в числах 175 и 126
        int var1 = 175;
        int var2 = 126;
        int hundred1 = var1 / 100;
        int hundred2 = var2 / 100;
        int ten1 = (var1 / 10) % 10;
        int ten2 = (var2 / 10) % 10;
        int one1 = var1 % 10;
        int one2 = var2 % 10;

        System.out.println("Поиск общей цифры в числах 175 и 126");
        if (hundred1 == hundred2) {
            System.out.println("Одинаковых сотен " + hundred1);
        } else {
            System.out.println("Нет одинаковых сотен");
        }
        if (ten1 == ten2) {
            System.out.println("Одинаковых десятков " + ten1);
        } else {
            System.out.println("Нет одинаковых десятков");
        }
        if (one1 == one2) {
            System.out.println("Одинаковых единиц " + one1);
        } else {
            System.out.println("Нет одинаковых единиц");
        }
        System.out.println();

        //Определение буквы или символа по их коду
        char aCharacter = '\u005A';
        System.out.println("Определение буквы или символа по их коду \u005A");
        if ((aCharacter > 64 && aCharacter < 91) || (aCharacter > 96 && aCharacter < 123)) {
            System.out.println(aCharacter + " это буква");
        } else if (aCharacter > 47 && aCharacter < 58) {
            System.out.println(aCharacter + " это цифра");
        } else {
            System.out.println(aCharacter + " это не буква и не число");
        }
        System.out.println("");

        // Определение суммы вклада и начисленных банком %
        int sumDeposit = 300000;
        int percent = 0;
        if (sumDeposit < 100000) {
            percent = sumDeposit * 5 / 100;
        } else if (sumDeposit > 300000) {
            percent = sumDeposit * 10 / 100;
        } else {
            percent = sumDeposit * 7 / 100;
        }
        System.out.println("Определение суммы вклада и начисленных банком %");
        System.out.println("Сумма вклада = " + sumDeposit + ", начисленный процент = " + percent + ", итоговая сумма с % = " + (sumDeposit + percent));
        System.out.println();

        // Определение оценки по предметам
        int historyPercent = 59;
        int programPercent = 91;
        int historyScore = 0;
        int programScore = 0;
        System.out.println("Определение оценки по предметам");
        if (historyPercent > 91) {
            historyScore = 5;
        } else if (historyPercent > 73) {
            historyScore = 4;
        } else if (historyPercent > 59) {
            historyScore = 3;
        } else {
            historyScore = 2;
        }
        if (programPercent > 91) {
            programScore = 5;
        } else if (programPercent > 73) {
            programScore = 4;
        } else if (programPercent > 59) {
            programScore = 3;
        } else {
            programScore = 2;
        }
        System.out.println(historyScore + " ваша оценка по истории");
        System.out.println(programScore + " ваша оценка по программированию");
        System.out.println("Средний бал по предметам = " + (historyScore + programScore) / 2);
        System.out.println("Средний % по предметам = " + (historyPercent + programPercent) / 2);
        System.out.println("");

        // Расчет прибыли (убытка)
        int rentInMonth = 5000;
        int salesInMonth = 15000;
        int costPrice = 9000;
        int incomeInYear = (salesInMonth - rentInMonth - costPrice) * 12;
        char income = ' ';
        if (incomeInYear > 0) {
            income = '+';
        }
        System.out.println("Расчет прибыли (убытка)");
        System.out.println("Ваша прибыль (убыток) составил " + income + incomeInYear);
        System.out.println("");

        // Определение существования треугольника со сторонами 5, 5, 9 и одним из углов 90 градусов
        int side1 = 5;
        int side2 = 5;
        int side3 = 9;
        int max = side1;
        int min1 = 0;
        int min2 = 0;
        char slashRight = 92;
        char bar = 95;
        char vertical = 124;

        if (side2 > side1) {
            max = side2;
            min1 = side1;
            if (side3 > side2) {
                min2 = side2;
                max = side3;
            } else {
                min2 = side3;
            }
        } else if (side3 > side1) {
            min1 = side2;
            max = side3;
            min2 = side1;
        } else {
            min1 = side2;
            min2 = side3;
        }
        System.out.println("Определение существования треугольника со сторонами 5, 5, 9 и одним из углов 90 градусов");
        if (min1 * min1 + min2 * min2 == max * max) {
            System.out.println("Треугольник со сторонами 5, 5, 9 и одним из углов 90 градусов существует");
        } else {
            System.out.println("Треугольник со сторонами 5, 5, 9 и одним из углов 90 градусов НЕ существует");
        }
        System.out.println("Площадь треугольника равна " + (min1 + min2) / 2);
        System.out.println("" + vertical + slashRight);
        System.out.println("" + vertical + " " + slashRight);
        System.out.println("" + vertical + "  " + slashRight);
        System.out.println("" + vertical + "   " + slashRight);
        System.out.println("" + vertical + "    " + slashRight);
        System.out.println("" + bar + bar + bar + bar + bar);
        System.out.println("");

        // Подсчет количества банкнот
        int sum = 567;
        int money50 = 576 / 50;
        int money10 = (sum - money50 * 50) / 10;
        int money1 = sum % 10;
        System.out.println("576 получим из " + money50 + " банкнот по 50, " + money10 + " банкноты по 10, и " + money1 + " банкнот по 1");
        System.out.println(money50 + " * 50 + " + money10 + " * 10 + " + money1 + " = " + (money50 * 50 + money10 * 10 + money1));
    }
}

/*
Перевод псевдокода на язык Java (это название задачи)
перепишите псевдокод, приведенный ниже, с помощью Java
используйте переменные, условные операторы, оператор ! (логическое НЕ)
придумайте сообщения и отобразите в консоли
ЕСЛИ(возраст > 20) {
    сообщение
} ИНАЧЕ {
    сообщение
}

ЕСЛИ(!мужскойПол) {
    сообщение
}

ЕСЛИ(рост < 1.80) {
    сообщение
} ИНАЧЕ {
    сообщение
}


перваяБукваИмени = “Имя”.charAt(0);
ЕСЛИ(перваяБукваИмени == 'M') {
    сообщение
} ИНАЧЕ ЕСЛИ(перваяБукваИмени == 'I') {
    сообщение
} ИНАЧЕ {
    сообщение
}

Поиск максимального и минимального числа
создайте две переменные, присвоив им любые разные числа
найдите максимальное и минимальное число
выведите эти значения на консоль

Работа с числом
создайте переменную с любым числом
определите являться ли оно:
четным (нечетным)
отрицательным (положительным)
нулем
отобразите полученную информацию в консоли

Поиск общей цифры в числах
создайте две переменные, присвоив им 175 и 126
найдите в них одинаковую цифру, стоящую в одном и том же разряде
отобразите ее на консоль

Определение буквы или символа по их коду
создайте переменную типа char
присвойте ей значение ‘\u005A’
определите - это код буквы, числа или другого символа
выведите в консоль сам символ и информацию о нем (это буква, это число, это не буква и не число)

Определение суммы вклада и начисленных банком %
сумма вклада равна 300 000
если она:
меньше 100 000, то банк начисляет 5% годовых
от 100 000 до 300 000, то - 7%
больше 300 000, то - 10%
отобразите в консоли сумму вклада, начисленный % и итоговую сумму с %

Определение оценки по предметам
студент получил итоговые % по предметам:
история 59%
программирование 91%
определите оценки по каждому предмету:
> 60% - 3
> 73% - 4
> 91% - 5
выведите в консоль:
оценку и напротив предмет
средний балл по предметам
средний % по предметам

Расчет прибыли (убытка)
продавец снимает помещение, отдавая за него каждый месяц 5 000р
в среднем в месяц он продает товара на 15 000р
при этом его себестоимость равна 9 000р
подсчитайте за год прибыль (или убыток) продавца, выведя эту информацию в консоль
используйте + перед подсчитанной суммой или -, если продавец в убытке

Задания со *

Определение существования треугольника
стороны треугольника имеют значения 5, 5, 9
один из углов 90 градусов
определите, может ли существовать треугольник с такими длинами сторон
найдите его площадь
нарисуйте треугольник в консоли, используя символы | _ \
количество | и _ должно соответствовать длинам его сторон
отобразите все полученные данные в консоль

Подсчет количества банкнот
пусть имеется сумма, равная 567
подсчитайте, с помощью какого количества банкнот ее можно получить
при этом доступны банкноты следующего номинала: 1, 10, 50
также проведите обратный расчет начальной суммы по полученному количеству номиналов банкнот
выведите в консоль номиналы банкнот, требуемое их количество и подсчитанную исходную сумму

*/