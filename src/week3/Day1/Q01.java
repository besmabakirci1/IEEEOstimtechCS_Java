package week3.Day1;
//metodlar ve bu array sorusunun çözümü yapıldı bu hafta ilk günü.
public class Q01 {
    public static void main(String[] args) {
        int keyboards[] = {40,50,60};
        int drives[] = {5,8,12};
        int b = 60;
        int maxPrice = 0;

        for (int i = 0 ; i < keyboards.length; i++ ){
            for (int j = 0 ;j < drives.length; j++ ){
                int price = keyboards[i] + drives[j];

                if (price <= b && price > maxPrice){
                    System.out.println("şuan harcayabileceğim en yüksek para : " + price);
                    maxPrice = price;
                }
            }
        }
        System.out.println("tüm mağaazayı gezdim en ");
    }


}
