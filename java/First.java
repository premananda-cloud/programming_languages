public class First {
    public static void main(String[] args) {
        System.out.println("Hello from Java!");
        
        // Print arguments like argv in C
        for (int i = 0; i < args.length; i++) {
            System.out.println("arg[" + i + "] = " + args[i]);
        }
    }
}
