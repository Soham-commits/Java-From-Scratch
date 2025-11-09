class X implements Runnable {
    public void run() {
       for(int i=1; i<=5; i++) {
          System.out.println("Thread: " + i);
       }
    }
}


public class runnable {
    public static void main(String[] args) {
       X runnable = new X();
      Thread thread = new Thread(runnable);
       thread.start();
    }
}