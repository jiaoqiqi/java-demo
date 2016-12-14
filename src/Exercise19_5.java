//19-5
import java.io.*;
import java.util.*;
public class Exercise19_5 {
    public static void main(String []args){
        int []numbers = {11,2,3,4,5};
        try{
            ObjectOutputStream output = new ObjectOutputStream
                    (new FileOutputStream("Exercise19_5.dat",true));
            output.writeObject(numbers);
            output.writeObject(new Date());
            output.writeDouble(5.5);
            output.close();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
