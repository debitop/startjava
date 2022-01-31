public class VariablesTheme {
   public static void main(String[] args){
         //Создание переменных и вывод их значений на консоль
         boolean havePK = true;
         byte numOfMonitor = 1;
         short versionOfWindows = 11;
         int frequencyOfMemoryInHz = 598500;
         long volumeOfHddInByte = 107374182400L;
         char nameDiskWithSystem = 'C';
         float coreCpuSpeed = 99.76f;
         double cpuVolt = 0.683;
         System.out.println("Создание переменных и вывод их значений на консоль timeeee");
         System.out.println("boolean = " + havePK);
         System.out.println("byte = " + numOfMonitor);
         System.out.println("short = " + versionOfWindows);
         System.out.println("int = " + frequencyOfMemoryInHz);
         System.out.println("long = " + volumeOfHddInByte);
         System.out.println("char = " + nameDiskWithSystem);
         System.out.println("float = " + coreCpuSpeed);
         System.out.println("double = " + cpuVolt);
         System.out.println();

         //Расчет стоимости товара со скидкой
         int x = 100;
         int y = 200;
         System.out.println("Расчет стоимости товара со скидкой");
         System.out.println( (x + y) * 9 / 10 + " итоговая сумма товаров со скидкой");
         System.out.println((x + y) / 10 + " сумма скидки");
         System.out.println();
      
         //Вывод на консоль слова JAVA
         System.out.println("Вывод на консоль слова JAVA");
         System.out.println("   J    a  v     v  a");
         System.out.println("   J   a a  v   v  a a");
         System.out.println("J  J  aaaaa  V V  aaaaa");
         System.out.println(" JJ  a     a  V  a     a");
         System.out.println();

         //Отображение min и max значений числовых типов данных
         byte a = 127;
         short b = 32767;
         int c = 2147483647;
         long d = 9223372036854775807L;
         float e = 3.402823466e+38f;
         double f = 1.7976931348623158e+308;
         System.out.println("Отображение min и max значений числовых типов данных");
         System.out.println(a);
         System.out.println(b);
         System.out.println(c);
         System.out.println(d);
         System.out.println(e);
         System.out.println(f);
         System.out.println("прибавляем 1");
         System.out.println(a + 1);
         System.out.println(b + 1);
         System.out.println(c + 1);
         System.out.println(d + 1);
         System.out.println(e + 1);
         System.out.println(f + 1);
         System.out.println("убавляем 1");
         System.out.println(a - 1);
         System.out.println(b - 1);
         System.out.println(c - 1);
         System.out.println(d - 1);
         System.out.println(e - 1);
         System.out.println(f - 1);
         System.out.println();

         //Перестановка значений переменных
         int peremOne = 111;
         int peremTwo = 999;
         System.out.println("Перестановка значений переменных");
         System.out.println("peremOne = " + peremOne);
         System.out.println("peremTwo = " + peremTwo);
         int peremTree = peremOne;
         peremOne = peremTwo;
         peremTwo = peremTree;
         System.out.println("peremOne = " + peremOne);
         System.out.println("peremTwo = " + peremTwo);
         System.out.println();

         //Вывод ASCII-символов и их кодов
         int chisloOne = 35;
         int chisloTwo = 38;
         int chisloThree = 64;
         int chisloFour = 94;
         int chisloFive = 95;
         System.out.println("Вывод ASCII-символов и их кодов");
         System.out.println("35 = " + (char) chisloOne);
         System.out.println("38 = " + (char) chisloTwo);
         System.out.println("64 = " + (char) chisloThree);
         System.out.println("94 = " + (char) chisloFour);
         System.out.println("95 = " + (char) chisloFive);
         System.out.println();

         //Произведение и сумма цифр числа 345
         int num = 345;
         System.out.println("Произведение и сумма цифр числа 345");
         System.out.println("произведение цифр = " + 3 * 4 * 5);
         System.out.println("сумма цифр = " + (3 + 4 + 5));
         System.out.println();

         //Вывод на консоль ascii-арт Дюка
         char slashLevo = 92;
         char slashPravo = 47;
         char skobkaLevo = 41;
         char skobkaPravo = 40;
         char nijnPodcherk = 95;
         System.out.println("Вывод на консоль ascii-арт Дюка");
         System.out.println("       " + slashPravo + " " + slashLevo);
         System.out.println("      " + slashPravo + "   " + slashLevo);
         System.out.println("     " + slashPravo + nijnPodcherk + skobkaPravo + " " + skobkaLevo + nijnPodcherk + slashLevo);
         System.out.println("    " + slashPravo + "       " + slashLevo);
         System.out.println("   " + slashPravo + nijnPodcherk + nijnPodcherk + nijnPodcherk + slashPravo + 
            slashLevo + nijnPodcherk + nijnPodcherk + nijnPodcherk + nijnPodcherk + slashLevo);
         System.out.println();

         //Отображение сотен, десятков, единиц числа 123
         int nashNumber = 123;
         int soten = 123 / 100;
         int desiatkov = (nashNumber - soten * 100) / 10;
         System.out.println("Отображение сотен, десятков, единиц числа 123");
         System.out.println("сотен " + soten);
         System.out.println("десятков " + desiatkov);
         System.out.println("единиц " + (nashNumber - soten * 100 - desiatkov * 10));
         System.out.println();

         //Преобразование секунд 86399
         int time = 86399;
         int sekInHour = 60 * 60;
         int hours = time / sekInHour;
         time = time - hours * sekInHour;
         int minutes = time / 60;
         time = time - minutes * 60;
         System.out.println("Преобразование секунд 86399");
         System.out.println("часов " + hours);
         System.out.println("минут " + minutes);
         System.out.println("секунд " + time);
         System.out.println();
   }
} 



/*
Создайте класс VariablesTheme с методом main. Все задания реализуйте в этом методе, отделяя их 
друг от друга пустой строкой. Также в начале решения каждого задания необходимо указать комментарий, 
описывающий кратко то, что делает код. Эту информацию берите из названия задач. Этот комментарий 
также нужно выводить в консоль перед выводом решения каждого задания. Не используйте ввод с клавиатуры. 
Давайте переменным осмысленные имена (где это возможно), глядя на которые сразу было бы понятно, что 
они хранят. Все переменные должны быть локальными.

Создание переменных и вывод их значений на консоль (это название задачи)
объявите переменные всех существующих в Java примитивных типов данных, присвоив им значения
в качестве значений используйте информацию о своем компьютере: количество ядер, частота процессора 
и тд.выведите эти данные на консоль

Расчет стоимости товара со скидкой
товар X стоит 100 руб, а товар Y - 200 руб.
вместе на них действует скидка 10%
отобразите в консоли:
итоговую сумму товаров со скидкой
сумму скидки

Вывод на консоль слова JAVA
Отобразите в консоли слово JAVA в точности, как в этом примере:
   J    a  v     v  a                                                  
   J   a a  v   v  a a                                                 
J  J  aaaaa  V V  aaaaa                                                
 JJ  a     a  V  a     a


Отображение min и max значений числовых типов данных
создайте переменные всех числовых типов данных
присвойте им самые большие числа, которые они могут хранить
отобразите их в консоли
увеличьте все значения на единицу
отобразите результат в консоли
уменьшите все значения на единицу
отобразите результат в консоли

Перестановка значений переменных
создайте две переменных вещественного типа
поместите в них два значения
отобразите их в консоли
поменяйте значения переменных местами, используя третью переменную
отобразите новые значения переменных в консоли

Вывод ASCII-символов и их кодов
создайте 5 целочисленных переменных
присвоите им десятичные значения: 35, 38, 64, 94, 95
отобразите в консоли напротив каждого значения соответствующий ему символ (делайте это программно, 
   а не     написав его самим) из ASCII-таблицы

Произведение и сумма цифр числа
имеется число 345
найдите произведение, а затем сумму его цифр
выведите оба ответа на консоль

Задания со *
Вывод на консоль ascii-арт Дюка
отобразите в консоли Java-талисман, используя символы из примера ниже:
       / \
      /   \   
     /_( )_\
    /       \
   /___/\____\


каждый уникальный символ храните в отдельной переменной
отобразите результат в консоли, используя значения переменных

Отображение сотен, десятков, единиц числа
создайте переменную с числом 123
отделите программно у этого числа сотни, десятки, единицы
отобразите каждое значение на новой строке

Преобразование секунд
создайте переменную, поместив в нее значение 86399 (секунды)
переведите это значение в часы, минуты, секунды
отобразите полученные значения в консоли
*/