public class IfElseStatementTheme {
   public static void main(String[] args){
      //Перевод псевдокода на язык Java
         int age = 55;
         boolean manSex = true;
         char firstLetterName = "Имя".charAt(0);
         System.out.println("Перевод псевдокода на язык Java");
         if (age > 20) {
            System.out.println("Ваш возраст больше 20");
         } else {
            System.out.println("Ваш возраст меньше или равен " + age);
         }
         if (!manSex) {
            System.out.println("Ваш пол - женский");
         }
         if (firstLetterName == 'M') {
            System.out.println("Ваше имя начинается на букву M");
         } else if (firstLetterName == 'I'){
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
         if (numThree == 0){
            System.out.print("ноль ");
         } else if (numThree%2 == 0){
            System.out.print("четное ");
         } else {
            System.out.print("не четное ");
         }
         if (numThree > 0){
            System.out.println("положительное ");
         } else if (numThree < 0){
            System.out.println("отрицательное");
         }
         System.out.println();

      //Поиск общей цифры в числах 175 и 126
         int peremOne = 175;
         int peremTwo = 126;
         int sotenOne = peremOne / 100;
         int sotenTwo = peremTwo / 100;
         int decOne = peremOne / 10;
         int decTwo = peremTwo / 10;
         int edOne = peremOne - sotenOne * 100 - decOne * 10;
         int edTwo = peremTwo - sotenTwo * 100 - decTwo * 10;
         System.out.println("Поиск общей цифры в числах 175 и 126");
         if (sotenOne == sotenTwo) {
            System.out.println("Одинаковых сотен " + sotenOne);
         } else{
            System.out.println("Нет одинаковых сотен");
         }
         if (decOne == decTwo) {
            System.out.println("Одинаковых десятков " + decOne);
         } else{
            System.out.println("Нет одинаковых десятков");
         }
         if (edOne == edTwo) {
            System.out.println("Одинаковых единиц " + edOne);
         } else{
            System.out.println("Нет одинаковых единиц");
         }
         System.out.println();

      //Определение буквы или символа по их коду
  //       char letter = ‘/u005A’;
  //       System.out.println("Определение буквы или символа по их коду " + letter);

         System.out.println();


/*Определение буквы или символа по их коду
создайте переменную типа char
присвойте ей значение ‘\u005A’
определите - это код буквы, числа или другого символа
выведите в консоль сам символ и информацию о нем (это буква, это число, это не буква и не число) */


      // Определение суммы вклада и начисленных банком %
         int summVklada = 300000;
         int procent = 0;
         if (summVklada < 100000){
            procent = summVklada * 5 / 100;
         } else if (summVklada > 300000){
            procent = summVklada * 10 / 100;
         } else {
            procent = summVklada * 7 / 100;
         }
         System.out.println("Определение суммы вклада и начисленных банком %");
         System.out.println("Сумма вклада = " + summVklada + ", начисленный процент = " + procent + ", итоговая сумма с % = " + (summVklada + procent));
         System.out.println();

      // Определение оценки по предметам
         int historyPercent = 59;
         int programPercent = 91;
         int historyBal = 0;
         int programBal = 0;
         System.out.println("Определение оценки по предметам");
         if (historyPercent > 91) {
            historyBal = 5;
         } else if(historyPercent > 73){
            historyBal = 4;
         } else if (historyPercent > 59){
            historyBal = 3;
         } else {
            historyBal = 2;
         }
         if (programPercent > 91) {
            programBal = 5;
         } else if(programPercent > 73){
            programBal = 4;
         } else if (programPercent > 59){
            programBal = 3;
         } else {
            programBal = 2;
         }
         System.out.println(historyBal + " ваша оценка по истории");
         System.out.println(programBal + " ваша оценка по программированию");
         System.out.println("Средний бал по предметам = " + (historyBal + programBal) / 2);
         System.out.println("Средний % по предметам = " + (historyPercent + programPercent) / 2);
         System.out.println("");

      // Расчет прибыли (убытка)
         int arendaInMonth = 5000;
         int salesInMonth = 15000;
         int costPrice = 9000;
         int dohodInYear = (salesInMonth - arendaInMonth - costPrice) * 12;
         char dohod = ' ';
         if (dohodInYear > 0){
            dohod = '+';
         }
         System.out.println("Расчет прибыли (убытка)");
         System.out.println("Ваша прибыль (убыток) составил " + dohod + dohodInYear);
         System.out.println("");

      // Определение существования треугольника со сторонами 5, 5, 9 и одним из углов 90 градусов
         int storonaOne = 5;
         int storonaTwo = 5;
         int storonaThree = 9;
         int max = storonaOne;
         int min1 = 0;
         int min2 = 0;
         char slashPravo = 47;
         char nijnPodcherk = 95;
         char vertikal = 40;

         if (storonaTwo > storonaOne){
            max = storonaTwo;
            min1 = storonaOne;
            if (storonaThree > storonaTwo){
               min2 = storonaTwo;
               max = storonaThree;
            } else {
               min2 = storonaThree;
            }
         } else if (storonaThree > storonaOne){
            min1 = storonaTwo;
            max = storonaThree;
            min2 = storonaOne;
         } else {
            min1 = storonaTwo;
            min2 = storonaThree;
         }
         System.out.println("Определение существования треугольника со сторонами 5, 5, 9 и одним из углов 90 градусов");
         if (min1 * min1 + min2 * min2 == max * max){
            System.out.println("Треугольник со сторонами 5, 5, 9 и одним из углов 90 градусов существует");
         } else {
            System.out.println("Треугольник со сторонами 5, 5, 9 и одним из углов 90 градусов НЕ существует");
         }
         System.out.println("Площадь треугольника равна " + (min1 * min1 + min2 * min2) / 2);
         
         System.out.println("");
// определите, может ли существовать треугольник с такими длинами сторон
// найдите его площадь
// нарисуйте треугольник в консоли, используя символы | _ \
// количество | и _ должно соответствовать длинам его сторон
// отобразите все полученные данные в консоль
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