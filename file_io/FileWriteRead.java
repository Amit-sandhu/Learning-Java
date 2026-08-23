package file_io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class FileWriteRead {
    public static void main(String[] args){

        // writing to a file
        try{
            FileWriter writer = new FileWriter("notes.txt");
            writer.write("Java file handling example\n");
            writer.write("Second line of text\n");
            writer.close();
            System.out.println("Wrote to notes.txt successfully");
        }
        catch(IOException e){
            System.out.println("Error writing file: "+e.getMessage());
        }

        // reading from the same file
        try{
            File file = new File("notes.txt");
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                System.out.println(reader.nextLine());
            }
            reader.close();
        }
        catch(IOException e){
            System.out.println("Error reading file: "+e.getMessage());
        }
    }
}

// Practice: Modify the program to append a new line to notes.txt
// instead of overwriting it (hint: FileWriter has an append constructor).
