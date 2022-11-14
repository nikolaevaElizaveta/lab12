import javax.naming.NoPermissionException;
import java.io.*;
import java.lang.reflect.Array;
import java.nio.channels.NonWritableChannelException;
import java.nio.file.NoSuchFileException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try(FileInputStream in = new FileInputStream("input.txt");
            FileOutputStream out = new FileOutputStream("output.txt"))
        {
            byte[] buffer = new byte[in.available()];
            in.read(buffer, 0, buffer.length);
            String inp= Arrays.toString(buffer);
            String[] numbers=inp.split(" ");
            int first=Integer.parseInt(numbers[0]);
            int second=Integer.parseInt(numbers[1]);
            if (second==0){
                System.out.println("div y zero");
                System.exit(0);
            }
            out.write(first/second);

        } catch (FileNotFoundException exOne){
            System.out.println("No such file");
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }catch (NumberFormatException e) {
            System.out.println("mistake" );
        }
    }
}
