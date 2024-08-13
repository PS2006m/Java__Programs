/*
 * Write a program to create a new file and write the number into it and
 *  sort that file content into different file
 */
import java.io.*;
import java.util.*;
class Main19
{
    public static void main(String[] args) throws Exception
    {
        File f=new File("unsortedNo.txt");
        FileWriter fw=new FileWriter(f);
        BufferedWriter bw=new BufferedWriter(fw);
        Random r=new Random();
        for(int i=0;i<30;i++)
        {
            int n=r.nextInt(100);
            bw.write(Integer.toString(n));
            bw.newLine();
        }
        bw.close();
        fw.close();
        File f2=new File("sortedNo.txt");
        FileWriter fw1=new FileWriter(f2);
        BufferedWriter bw1=new BufferedWriter(fw1);
        FileReader fr=new FileReader(f);
        BufferedReader br=new BufferedReader(fr);
        String line=br.readLine();
        ArrayList<Integer> a=new ArrayList<>();
        while(line!=null)
        {
            int number=Integer.parseInt(line);
            a.add(number);
            line=br.readLine();
        }
        Collections.sort(a);
        br.close();
        fr.close();
        for(int i=0;i<a.size();i++)
        {
            bw1.write(Integer.toString(a.get(i)));
            bw1.newLine();
        }
        bw1.close();
        fw1.close();
    }
}