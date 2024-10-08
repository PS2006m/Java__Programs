/*
 * It's IPL 2023 time. In this process of IPL-23 there is a thread called Bowler. 
 * This Bowler is going to create two threads with name – “Yorker” and
“googly”.Write a java program to perform following task with each thread.
 Task 1 : if the thread name is "yorker" then it should print "SIXER"
Task 2 : if the thread name is "googly" then it should print "WICKET" 
Make sure first thread bowl must be yorker. When execution of first thread
is completed then and only then second bowl googly should work. Hint: 
Here Bowler is a Thread Class. and It must have execution of SIXER
AND WICKET. Both yorker and googly must be from Bowler Thread Only Give
 name IPL to the class of Main method
 */
class Bowler extends Thread {
    public void run() {
        if (Thread.currentThread().getName().equals("Yorker")) {
            System.out.println("SIXER");
        } else if (Thread.currentThread().getName().equals("Googly")) {
            System.out.println("WICKET");
        }
    }
}
class Main7 {
    public static void main(String[] args){
        Bowler yorker = new Bowler();
        Bowler googly = new Bowler();
        yorker.setName("Yorker");
        googly.setName("Googly");
        try {
            yorker.start();
            yorker.join(); 
            googly.start();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
