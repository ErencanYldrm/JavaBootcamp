public class bootcamp {
    public static void main(String[] args) {

        // hello world
        System.out.println("Hello world");

        // variables
        int teachers = 12;
        String teacherText = "Number of teacher: ";
        System.out.println(teacherText + teachers);

        // data types
        int sayi = 3;
        double ondalikSayi = 3.10;
        String text = "hello";
        boolean check = true;

        // conditions
        if (sayi > 4) {
            System.out.println("Sayı 4den büyük");
        } else {
            System.out.println("Sayı 4 veya 4den küçük");
        }

        // recapDemo1
        int num1 = 20;
        int num2 = 25;
        int num3 = 3;

        int biggest = num1;

        if (biggest < num2) {
            biggest = num2;
        }

        if (biggest < num3) {
            biggest = num3;
        }

        System.out.println("En büyük sayı = " + biggest);

        // loop and array
        int[][] array = { { 2, 3, 4 }, { 1, 5, 6 } };
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                count += array[i][j];
            }

        }
        System.out.println(count);

        // asal sayı bulma kodu
        int number = 20;
        int counter = 0;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println(number + " Asal bir sayidir.");
        } else {
            System.out.println(number + " Asal bir sayi degildir.");
        }

    }
}