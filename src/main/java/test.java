import java.math.BigInteger;
import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by sirius on 16-8-8.
 */
public class test {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double k=sc.nextDouble();//输入数字
        Calendar c=Calendar.getInstance();
        System.out.println(c.get(Calendar.SECOND)+":"+c.get(Calendar.MILLISECOND));
        int n=(int)(Math.log(k+1)/Math.log(2));
        double num=k-(int)Math.pow(2,n)+1;
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<n;i++){
            if(num==0){
                sb.insert(0,'4');
            }else{
                double yushu=num%2;
                sb.insert(0,yushu==1?'7':'4');
                num=Math.floor(num/2);
            }
        }

        System.out.println(sb);
        c=Calendar.getInstance();
        System.out.println(c.get(Calendar.SECOND)+":"+c.get(Calendar.MILLISECOND));
    }

}
