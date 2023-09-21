package Toys;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveT0File {
    FileWriter writer;

    public void save(String str) {
        {
            try {
                writer = new FileWriter("src/main/java/Toys/Toy.txt");
                BufferedWriter bufferedWriter = new BufferedWriter(writer);
                bufferedWriter.write(String.format("%s\n",str));
                bufferedWriter.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
