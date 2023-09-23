package Toys;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SaveT0File {


    public void save(String str) {
        {
            FileWriter writer;
            BufferedWriter bufferedWriter = null;
            try {
                writer = new FileWriter("src/main/java/Toys/Toy.txt");
                bufferedWriter = new BufferedWriter(writer);
                bufferedWriter.write(String.format("%s\n", str));
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
