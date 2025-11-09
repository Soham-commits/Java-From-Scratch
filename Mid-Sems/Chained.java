class Chained {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("Top Exception"); // Create top-level exception
            e.initCause(new ArithmeticException("Cause Exception")); // Set cause
            throw e; // Throw the top-level exception
        } catch (Exception ex) { 
            System.out.println("Caught: " + ex);// Catch and print the top-level exception
            System.out.println("Cause: " + ex.getCause());// Print the cause of the exception
        }
    }
}