package CodingInLife;
import java.io.*;

class MyException extends Exception{
    public MyException(String msg){
        super(msg);
    }
}


class FileOpen {
    public void print(String text) {
        if (text.length() == 0) {
            throw new IllegalArgumentException("Do not empty string.");
        }
        System.out.println(text);
    }
    void run() throws FileNotFoundException{
        BufferedReader bReader = null;
        String input = null;
        System.out.println(System.getProperty("user.dir"));
        try {
            bReader = new BufferedReader(new FileReader("src/CodingInLife/out001.txt"));
            input = bReader.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(input);
    }
}


public class FileReadDemo {
    public static void main(String[] args) {
        FileOpen f = new FileOpen();
        try {
            f.run();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        f.print("123");
        try {
            throw new MyException("my exception");
        } catch (MyException e) {
            e.printStackTrace();
        }

    }
}
