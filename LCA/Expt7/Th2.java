public class Th2 {
    static class OddThread extends Thread {
        public void run() {
            for(int i = 1; i <= 20; i += 2) {
                System.out.println("Odd: " + i);
            }
        }
    }
    
    static class EvenThread extends Thread {
        public void run() {
            for(int i = 2; i <= 20; i += 2) {
                System.out.println("Even: " + i);
            }
        }
    }
    
    public static void main(String [] Args) {
        OddThread odd = new OddThread();
        EvenThread even = new EvenThread();
        odd.start();
        even.start();
    }   
}
