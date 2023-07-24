package sharing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIO {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("src/Resources/FileIO.txt");
            fos = new FileOutputStream("src/Resources/FileIO.txt", true);

            // Write
            String text = "This is text is written by Java";
            byte[] byteArray = text.getBytes(); // convert string to bytes in order to write by to file
            for (byte b: byteArray) {
                fos.write(b);
            }

            // Read
            int c;
            while((c = fis.read()) != -1) {
                System.out.print((char) c);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                fis.close();
            }

            if (fos != null) {
                fos.close();
            }
        }


    }

}
