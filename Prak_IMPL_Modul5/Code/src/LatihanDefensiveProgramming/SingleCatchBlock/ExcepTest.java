package LatihanDefensiveProgramming.SingleCatchBlock;

public class ExcepTest {

    public static void main(String args[]) {
        SingleCatchBlock();
    }

    public static void SingleCatchBlock() {
        try {
            int a[] = new int[2];
            System.out.println("Access element three: " + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown: " + e);
        }
        System.out.println("Out of the block");
    }
}
