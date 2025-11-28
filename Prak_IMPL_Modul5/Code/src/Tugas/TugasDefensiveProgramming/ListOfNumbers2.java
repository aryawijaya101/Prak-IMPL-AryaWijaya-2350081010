package Tugas.TugasDefensiveProgramming;

import java.io.*;
import java.util.Vector;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ListOfNumbers2 {
    private Vector<Integer> numbers;
    private static final int SIZE = 10;

    public ListOfNumbers2() {
        numbers = new Vector<>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            numbers.add(i);
        }

        try {
            if (!Files.exists(Paths.get("infile.txt"))) {
                Files.write(Paths.get("infile.txt"), "0\n1\n2\nabc\n4".getBytes());
            }
        } catch (IOException e) {
            System.err.println("Gagal membuat file dummy input: " + e.getMessage());
        }

        try {
            this.readFromFile("infile.txt");
        } catch (IOException e) {
            System.err.println("Gagal membaca file: " + e.getMessage());
        }

        this.writeToFile();
    }

    public void readFromFile(String fileName) throws IOException {
        String line;
        RandomAccessFile file = null;
        try {
            file = new RandomAccessFile(fileName, "r");
            while ((line = file.readLine()) != null) {
                try {
                    Integer value = Integer.parseInt(line);
                    numbers.add(value);
                    System.out.println("Dibaca: " + value);
                } catch (NumberFormatException e) {
                    System.err.println("Peringatan: Format angka tidak valid pada baris '" + line + "'. Melewatkan baris.");
                }
            }
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    System.err.println("Gagal menutup RandomAccessFile: " + e.getMessage());
                }
            }
        }
    }

    public void writeToFile() {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new FileWriter("outfile.txt"));
            for (int i = 0; i < numbers.size(); i++) {
                if (i >= numbers.size()) {
                    throw new ArrayIndexOutOfBoundsException("Indeks melampaui batas Vector.");
                }
                writer.println("Nilai pada indeks: " + i + " = " + numbers.elementAt(i));
            }
        } catch (IOException e) {
            System.err.println("Kesalahan IO saat menulis file: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Kesalahan batas array: " + e.getMessage());
        } finally {
            if (writer != null) {
                writer.close();
                System.out.println("Menutup Print Writer.");
            } else {
                System.out.println("PrintWriter belum dibuka.");
            }
        }
    }

    public static void main(String[] args) {
        new ListOfNumbers2();
    }
}
