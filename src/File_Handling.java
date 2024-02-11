import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.util.Set;

public class File_Handling{
    public static void main(String[] args) throws URISyntaxException, IOException {
        Path path= Path.of("C:\\Users\\Cools\\Desktop\\Desktop\\File Handling in Java\\File Handling for java.txt");
        System.out.println(path);

//        path =Path.of("C:/Users/Cools/Desktop/Desktop/File Handling for java.txt");
//        System.out.println(path);
//
//        path =Path.of("C:","Users/Cools/Desktop/Desktop/File Handling for java.txt");
//        System.out.println(path);
//
//        path =Path.of("C:","Users/Cools/Desktop/Desktop").resolve("File Handling for java.txt");
//        System.out.println(path);
//
//        path = Paths.get("C:/Users/Cools/Desktop/Desktop/File Handling for java.txt");
//        System.out.println(path);

        boolean exist= Files.exists(path);
        System.out.println("Exist = "+exist);

        FileTime lastModifiedTime=Files.getLastModifiedTime(path);
        System.out.println("Last Modified Time = "+lastModifiedTime);

        long mismatchIndex=Files.mismatch(path,Path.of("C:\\Users\\Cools\\Desktop\\Desktop\\File Handling in Java\\File Handling for java2.txt"));
        System.out.println(mismatchIndex);

        System.out.println(Files.getOwner(path));

//        Path tempFile1=Files.createTempFile(path.getParent(),"File",".txt");
//        System.out.println("Temporary Directory: "+tempFile1);

//        Path newDirectory=Files.createDirectory(path.getParent().resolve("newDir"));
//        Path newFile=Files.createFile(newDirectory.resolve("EmptyFile.txt"));
//
//        System.out.println("File Location: "+newFile);
        Path newFile=Path.of("C:\\Users\\Cools\\Desktop\\Desktop\\File Handling in Java\\newDir\\EmptyFile.txt");
        System.out.println(Files.exists(newFile));

        //  How to get the Posix permissions of a file
//        try {
//            Set<PosixFilePermission> permissions = Files.getPosixFilePermissions(newFile);
//            System.out.println("Permission: " + permissions);
//        }catch (UnsupportedOperationException e){
//            System.err.println("Looks like you're not running on a posix file system");
//        }

        //Writing in a file
        Files.writeString(newFile,"hello this is my first input\n");
        System.out.println("newfile: "+newFile);


        Files.writeString(newFile,"hello this is my second input", StandardOpenOption.APPEND);

        //Files.writeString(newFile,"hello this the third input!",StandardOpenOption.TRUNCATE_EXISTING);

        //Reading form a file

        //System.out.println("Content in file: \n"+Files.readString(newFile));

        String s = Files.readString(newFile);
        System.out.println("s = " + s);

        //how to list files in same directory
        var files=Files.list(path.getParent());
        files.forEach(System.out::println);


        System.out.println();

        try (var files1 = Files.newDirectoryStream(path.getParent(), "*.txt")) {
            files1.forEach(System.out::println);
        }

        System.out.println();
        try (var files1 = Files.walk(path.getParent())) {
            files1.forEach(System.out::println);
        }
    }

}
