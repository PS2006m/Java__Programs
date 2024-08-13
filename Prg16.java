/*
 * Sports tournament organizer: Write a program that simulates a sports tournament using a PriorityQueue. The program should allow the user to
input team names and their win-loss records. The program should then prioritize teams based on their win-loss records and add them to the
PriorityQueue. When it's time for the next match, the program should remove the two highest priority teams from the PriorityQueue and display
their names
 */
import java.util.*;
class Team 
{
    String name;int win,loss;
    Team(String name,int win,int loss)
    {
        this.name=name;
        this.win=win;
        this.loss=loss;
    }
    public int getWinLossRatio() {
        return win-loss;
    }
    public String toString()
    {
        return "Team is "+name+" and win loss ratio is "+(win-loss);
    }
}
class Main16
{
    public static void main(String[] args)
    {   
        Scanner sc=new Scanner(System.in);
        PriorityQueue<Team> pq=new PriorityQueue<>(Comparator.comparing(Team::getWinLossRatio).reversed());
        pq.add(new Team("People",23,12));
        pq.add(new Team("PS",21,3));
        pq.add(new Team("DF",11,3));
        pq.add(new Team("LO",51,34));
        pq.add(new Team("MM",5,2));
        pq.add(new Team("PFS",26,19));
        System.out.println(pq);
        Team t1=pq.poll();
        Team t2=pq.poll();
        System.out.println("Team 1 is "+t1+" and team 2 is "+t2);
    }
}