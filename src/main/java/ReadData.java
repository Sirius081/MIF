import java.io.*;

/**
 * Created by sirius on 16-8-2.
 */
public class ReadData {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("/home/sirius/桌面/医保/数据/mode_ac43.txt"),"gbk"));
        String line=null;
        for(int i=0;i<50;i++){
            System.out.println(br.readLine());
        }
    }
}
