public class Th1 {
    static class FirstThread extends Thread{
        public void run()
        {
            for(int i=0; i<10; i++)
            {
                System.out.println(i);
            }
        }
    }

    static class SecondThread extends Thread{
        public void run()
        {
            for(int i=10;i>=1;i--)
            {
                System.out.println(i);
            }
        }
    }

    public static void main(String [] Args)
    {
        FirstThread t1 = new FirstThread();
        SecondThread t2 = new SecondThread();
        t1.start();
        t2.start();
    }
}