/*
 * Write a program that counts number of characters, words, and lines in a text file
 */
import java.io.*;
class Main20
{
    public static void main(String[] args) {
        File file = new File("Main10.txt");

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = reader.readLine()) != null) {
                lineCount++;

                charCount += line.length();
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            System.out.println("Number of characters: " + charCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of lines: " + lineCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}