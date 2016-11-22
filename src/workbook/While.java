package workbook;

public class While {
    public static void main(String[] args) {
        double sr,sum=0;
        int n=0;
        int x =(int)(Math.round(Math.random()*20));
        while (x!=0){
            System.out.println(x);
            sum+=x;
            n++;
            x =(int)(Math.round(Math.random()*20));
        }
        if(n!=0){
            sr=sum/n;
        }
        else {
            sr=0;
        }
        System.out.println("Сумма чисел: "+sum);
        System.out.println("среднее: "+sr);
    }
}
