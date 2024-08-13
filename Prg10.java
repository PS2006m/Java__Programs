/*
 * Write a program to replace all “word1” by “word2” to 
 * a file without using temporary file and display the no. of replacement
 */
import java.io.*;
 class Main10 {
    public static void main(String[] args) throws Exception {
        File file = new File("Main10.txt");

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            StringBuilder content = new StringBuilder();
            String line;
            int count = 0;

            while ((line = br.readLine()) != null) {

                int replacementsInLine = 0;
                String replacedLine = line;
                while (replacedLine.contains("word1")) {
                    replacedLine = replacedLine.replaceFirst("word1", "word2");
                    replacementsInLine++;
                }
                
               
                count += replacementsInLine;

                content.append(replacedLine).append(System.lineSeparator());
            }

            br.close();
            fr.close();


            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content.toString());

            bw.close();
            fw.close();


            System.out.println("Number of replacements: " + count);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
