package LatihanDefensiveProgramming.MultipleCatchBlock;

import java.io.*;

public class ExcepTest {

    public static void main(String args[]) {
        String fileName = "example.txt";

        readFile(fileName);
    }

    public static int readFile(String fileName) {
        FileInputStream file = null;
        int x = -1;

        try {
            file = new FileInputStream(fileName);
            x = (byte) file.read();
        } catch (FileNotFoundException f) {
            System.out.println("File not found: " + f.getMessage());
            f.printStackTrace();
            return -1;
        } catch (IOException i) {
            System.out.println("An IO error occurred: " + i.getMessage());
            i.printStackTrace();
            return -1;
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return x;
    }
}

