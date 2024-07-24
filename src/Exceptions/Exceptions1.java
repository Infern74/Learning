package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Обработка исключения");
        }
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("Learning/test");
        Scanner scanner = new Scanner(file);
    }
}
