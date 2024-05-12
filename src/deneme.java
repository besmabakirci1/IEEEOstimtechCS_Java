public class deneme {

    public static void main(String[] args) {
        double say = 3;
        double say2= 9;
        double result = say/say2;
        System.out.println(result);

        // değişken tanımlası:
        int no1 = 130, no2 = 366, no3 =91;
        String hos = "Kod sayfamıza Hoşgeldiniz:";
        String takma= " SlimStyle" ;
        // String'lerde ekleme operatörü:
        System.out.println("Merhabalar "+ hos + takma);
        //ekleme çıkarma öperatörü:
        System.out.println("A + B = " + (no1 + no2));
        System.out.println("A - B = " + (no1 - no2));
        //çarpma bölme operatörü
        System.out.println("A * B = " + (no1 * no2));
        System.out.println("A / B = " + (no1 / 2));
        System.out.println("A / 3 = " + (no1 / 3));

        //Mod alma operatörü
        System.out.println("C % B = " + (no3 % no2));
        }
    }

