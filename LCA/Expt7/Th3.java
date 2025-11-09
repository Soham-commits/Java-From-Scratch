public class Th3 {
    static class First extends Thread
    {
        public void run()
        {
            for(int i=1;i<=10;i++)
            {
                System.out.println("First Thread: "+i);
                try { Thread.sleep(100); } catch (InterruptedException e) {System.out.println(e);}
            }
        }
    }

    static class Second extends Thread
    {
        public void run()
        {
            for(int i=10;i>=1;i--)
            {
                System.out.println("Second Thread: "+i);
                try { Thread.sleep(100); } catch (InterruptedException e) {System.out.println(e);}
            }
        }
    }

    public static void main(String [] Args)
    {
        First t1 = new First();
        Second t2 = new Second();
        t1.start();
        t2.start();
    }
}
