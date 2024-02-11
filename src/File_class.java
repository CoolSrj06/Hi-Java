import java.io.*;

public class File_class {
    public static void main(String[] args) {

        File file = new File("javaFile123.txt");
        if (file.delete()) {
            System.out.println("New File is deleted!");
        } else {
            System.out.println("No such File already exists.");
        }
    }
}
