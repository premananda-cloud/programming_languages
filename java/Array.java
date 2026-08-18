public abstract class Array {
    public static void main(String[] args) {
        int arr[][] = {{123, 32,66}, {325,476, 4}, {32, 43}};
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println(); // New line after each row
        }
    }
}