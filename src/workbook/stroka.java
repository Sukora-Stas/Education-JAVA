package workbook;

/**
 * Created by Sukora Stas on 13.10.2016.
 */
public class stroka {
    public static void main(String[] args) {
        String str = "Тестовая, строка, с несколькими,,,   ,  .., запятыми";
        int n=0;
        char symbol;
        for(int i=0;i<str.length();i++){
            symbol=str.charAt(i);
            if(symbol==','){
                n++;
            }
        }
        System.out.println("У нас есть "+n+" запятых");


        //с помощью поиска

        int n1=0;
        int p=0;
        while(p!=-1){
            p=str.indexOf(',',p);
            if(p!=-1){
                p++;
                n1++;
            }
        }
        System.out.println("Способ 2");
        System.out.println("У нас есть "+n1+" запятых");





    }

}
