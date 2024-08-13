/*
 * Write a java program which read numbers from number.txt file and store
 * even number to even.txt and odd number into odd.txt file.
 */
import java.io.*;
class Main17
{
    public static void main(String[] args) throws Exception
    {
        File f=new File("numbers.txt");
        FileWriter fw=new FileWriter(f);
        BufferedWriter b2=new BufferedWriter(fw);
        for(int i=1;i<=20;i++)
        {
            b2.write(Integer.toString(i));
            b2.newLine();
        }
        b2.close();
        fw.close();
        File f1=new File("even.txt");
        File f2=new File("odd.txt");
        FileWriter fw1=new FileWriter(f1);
        BufferedWriter bw1=new BufferedWriter(fw1);
        FileWriter fw2=new FileWriter(f2);
        BufferedWriter bw2=new BufferedWriter(fw2);
        FileReader fr=new FileReader(f);
        BufferedReader br=new BufferedReader(fr);
        String line=br.readLine();
        while(line!=null)
        {
            int i=Integer.parseInt(line);
            if(i%2==0)
            {
                bw1.write(Integer.toString(i));
                bw1.newLine();
            }
            else 
            {
                bw2.write(Integer.toString(i));
                bw2.newLine();
            }
            line=br.readLine();
        }
        bw1.close();
        bw2.close();
        fw1.close();
        fw2.close();
        fr.close();
    }
}