package lecture12_practise.hw;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
//В задании приложен файл Ромео и Джульетта на английском, вычитать его в приложении.
//Проанализировать и записать в другой файл самое длинное слово.
public class LongestWordInStory extends Exception {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
//I tried to do it by applying arrayList ( String data)
// and it was fine when I had only 4-5 words, but then I
// decided to add part of scene from the story, and it would
// take too much time to add them one by one... And I decided
// I will keep it as String.
        String data = """
                Two households, both alike in dignity,
                In fair Verona, where we lay our scene,
                From ancient grudge break to new mutiny,
                Where civil blood makes civil hands unclean.
                From forth the fatal loins of these two foes\t5
                A pair of star-cross'd lovers take their life;
                Whose misadventured piteous overthrows
                Do with their death bury their parents' strife.
                The fearful passage of their death-mark'd love,
                And the continuance of their parents' rage,\t10
                Which, but their children's end, nought could remove,
                Is now the two hours' traffic of our stage;
                The which if you with patient ears attend,
                What here shall miss, our toil shall strive to mend.""";

        File file = new File("tms4.txt");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(data.getBytes(StandardCharsets.UTF_8));
            fileOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream(file);
            String content = new String(fileInputStream.readAllBytes(), StandardCharsets.UTF_8);
            fileInputStream.close();

            BufferedReader reader = new BufferedReader(new FileReader("tms2.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] lineWords = line.split("\\s+");
                for (String word : lineWords) {

                    words.add(word);
                }
            }
            reader.close();

            String longestWord = "";
            for (String word : words) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }

            String longestFileName = "longestWord.txt";
            BufferedWriter writer = new BufferedWriter(new FileWriter(longestFileName));
            writer.write(longestWord);
            writer.close();

            System.out.println("the longest word in this file '" + longestFileName + "': " + longestWord);
        } catch (IOException exception) {
            System.out.println("Error : " + exception.getMessage());
        }
    }
}