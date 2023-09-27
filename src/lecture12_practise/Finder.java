package lecture12_practise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;


/*Используя FileReader и FileWriter сначала записать в файл tms2.txt фразу на латыни
“Cognosce te ipsum”, а затем считать ее и вывести в консоль первую букву*/
public class Finder {
    public static void main(String[] args) {
        String data = "Cognosce te ipsum";
        File file = new File("tms2.txt");

        try
        {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(data.getBytes(StandardCharsets.UTF_8));

            fileOutputStream.close();
        }
        catch (IOException exception)
        {
            System.out.println("Error when operating with stream " + exception.getMessage());
        }

        try
        {
            FileInputStream fileInputStream = new FileInputStream(file);

            String content = new String(fileInputStream.readAllBytes(), StandardCharsets.UTF_8);
            System.out.println(content.charAt(0));

            fileInputStream.close();
        }
        catch (IOException exception)
        {
            System.out.println("Error when operating with stream " + exception.getMessage());
        }
    }
}
