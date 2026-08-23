package file_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args){

        // try-with-resources automatically closes the resource,
        // even if an exception is thrown - no need for a finally block
        try(FileWriter writer = new FileWriter("data.txt")){
            writer.write("line one\n");
            writer.write("line two\n");
        }
        catch(IOException e){
            System.out.println("Write failed: "+e.getMessage());
        }

        try(BufferedReader reader = new BufferedReader(new FileReader("data.txt"))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println("Read failed: "+e.getMessage());
        }
    }
}

// Practice: Use BufferedReader with try-with-resources to count the
// total number of lines in data.txt.
