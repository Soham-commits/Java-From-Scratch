class Nest {
    public static void main(String[] args) {
        try {
            try {
                int a = 10 / 0;   // ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: " + e);
            }
            int arr[] = new int[5];
            System.out.println(arr[10]);  // ArrayIndexOutOfBounds
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: " + e);
        }
    }
}