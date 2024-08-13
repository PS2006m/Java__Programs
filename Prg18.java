/*
 * Write a program that counts the no. of words in a text file. The file name is passed 
 * as a command line argument. The program should check
whether the file exists or not. The words in the file are separated by white space characters
 */
import java.io.*;
class Main18
{
    public static void main(String[] args) throws Exception{
        String words[]=args;
        String filename="";
        for(int i=0;i<words.length;i++)
        {
            filename=filename+words[i];
        }
        int count=0;
        System.out.println(filename);
        File f=new File(filename);
        FileReader fr=new FileReader(f);
        BufferedReader br=new BufferedReader(fr);
        String line=br.readLine();
        while(line!=null)
        {
            String length[]=line.split("\\s");
            count=count+length.length;
            line=br.readLine();
        }
        System.out.println("Count of words is "+count);
        br.close();
        fr.close();
    }
}