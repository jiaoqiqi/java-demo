import java.io.*;
//19-3
public class StreamNumberSum {
    public static void main(String[] args) {
        double sum = 0;
        try {
            DataOutputStream output = new DataOutputStream
                    (new FileOutputStream("test.dat"));
            output.writeDouble(4.5);
            output.writeDouble(43.25);
            output.writeDouble(3.2);
            output.close();
            DataInputStream input = new DataInputStream
                    (new FileInputStream("test.dat"));

            while (true) {
                sum += input.readDouble();
            }
        } catch (EOFException ex) {
            System.out.println("All data read" );
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.print("The sum is " + sum);


    }

}
