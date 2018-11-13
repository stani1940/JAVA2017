import java.util.*;
import java.net.*;
import java.io.*;

public class Demo_2Class
{
    public static void main(String[] args) throws MalformedURLException, IOException
    {
        URL url = new URL("http://konkurent.bg/article/129626/ioana-lilovska-ot-mezdra-stana-zvezda-na-muzite");
        HttpURLConnection connect = (HttpURLConnection) url.openConnection();
        //URLConnection connect = url.openConnection();

        long d = connect.getLastModified();
        if(d == 0)
            System.out.println("Сведения за дата на последна модификация отсъстват");
        else
            System.out.println("Дата последна модификация: " + new Date(d));

        System.out.println("=== Съдържание ===");
        InputStream input = connect.getInputStream();
        int c, i=0;
        char[] arr = new char[2000000];
        while(((c = input.read()) != -1)) {
            //System.out.print((char) c);
            i++;
            arr[i] = (char)c;
        }
        System.out.println(i);

        String text = "";
        String s = "";
        for(int b=0;b<i;b++)
        {
            s = String.valueOf(arr[b]);
            text = text+s;
        }

        System.out.println(text.length());

    }
}
