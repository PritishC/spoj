/**
 * Created by pritishc on 26/5/14.
 */
package test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main
{
    public static void main(String... args) throws IOException
    {
        String str = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(!(str = br.readLine()).startsWith("42"))
        {
            System.out.println(str);
        }
        br.close();
    }

}
