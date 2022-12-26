 /* Java Dizi Listesi
Bazen dinamik boyut dizilerini kullanmak daha iyidir. Java'nın Arraylist'i size bu özelliği sağlayabilir.
Arraylist kullanarak bu sorunu çözmeye çalışın.
Size n satır verilir. Her satırda sıfır veya daha fazla tamsayı vardır. Birkaç soruyu cevaplamanız gerekiyor
x satırının y konumunda bulunan sayıyı söylemeniz gereken yer.
Girdilerinizi System.in'den alın.
Giriş Biçimi
İlk satırın bir tam sayısı n vardır. Sonraki n satırın her birinde, sayıyı gösteren bir tamsayı d olacaktır.
o satırdaki tam sayıların sayısı ve sonra d boşlukla ayrılmış tam sayılar olacaktır. Bir sonraki satırda olacak
sorgu sayısını gösteren bir tamsayı q olsun. Her sorgu iki tamsayı x ve y'den oluşacaktır.
 kısıtlamalar
  1<=n<=20000
  0<=d<=50000
  1<=q<=1000
  1<=x,y<=n
Her sayı işaretli tamsayıya sığacaktır.
n satırdaki toplam tamsayı sayısı 100000'i geçmez.
  Çıkış formatı
 Her satırda, x'inci satırın y'inci konumunda bulunan sayıyı çıktılayın. Böyle bir konum yoksa, "ERROR!" Yazmanız yeterlidir.
  Örnek Giriş
  5
  5 41 77 74 22 44
  1 12
  4 37 34 36 52
  0
  3 20 22 33
  5
  1 3
  3 4
  3 1
  4 3
  5 5
  Örnek Çıktı
  74
  52
  37
  HATA!
  HATA!
 */

 import java.util.*;


 public class Solution  {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numLines = Integer.parseInt(input.nextLine());
        ArrayList<ArrayList> listArray = new ArrayList<>();
        for(int i = 0;i<numLines;i++){
            int numOfIntegers = input.nextInt();
           ArrayList<Integer> intArrayList =  new ArrayList<>();
            for(int j=0;j<numOfIntegers;j++){
                intArrayList.add(new Integer(input.nextInt()));
            }
            listArray.add(intArrayList);
            input.nextLine();
        }
        int numQueries = Integer.parseInt(input.nextLine());
        for(int i=0;i<numQueries;i++){
            int x = input.nextInt()-1;
            int y = input.nextInt()-1;
            input.nextLine();
            if(x<listArray.size() && y<listArray.get(x).size()){
                System.out.println(listArray.get(x).get(y));
            }else{
                System.out.println("ERROR!");
            }
        }
    }

 }
