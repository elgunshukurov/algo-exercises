package util;

import java.io.FileInputStream;
import java.io.IOException;

public class FileUtil {
    public static void main(String[] args) {
        read();
    }

    public static void write(){

    }

    public static void read(){
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("C:\\Users\\elgun.shukurov\\Desktop\\demo.txt");
            while (fileInputStream.available() > 0) {
                System.out.print( fileInputStream.read());
                System.out.print((char) fileInputStream.read());
            }
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
