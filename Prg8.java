/*
 * Write a program to create two threads, 
 * one thread will check whether given number is prime or not and second thread will print prime numbers
between 0 to 100
 */
class CheckPrimeThread extends Thread {
    private int number;

    public CheckPrimeThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}

class PrintPrimesThread extends Thread {
    @Override
    public void run() {
        System.out.println("Prime numbers between 0 and 100:");
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}

 class Main8 {
    public static void main(String[] args) {
        int numberToCheck = 29; 

        CheckPrimeThread checkPrimeThread = new CheckPrimeThread(numberToCheck);
        PrintPrimesThread printPrimesThread = new PrintPrimesThread();

        checkPrimeThread.start();
        printPrimesThread.start();
    }
}
