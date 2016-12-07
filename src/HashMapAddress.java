import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//22-14
public class HashMapAddress {
    public  static void main(String []args){
        Map<String,String> hashMap = new HashMap<String,String>();
        hashMap.put("California","Sacramento");
        hashMap.put("Georgia", "Atlanta");
        hashMap.put("Colorado","Denver");
        hashMap.put("Maryland", "Annapolis");
        hashMap.put("Massachusetts", "Boston");
        hashMap.put("Ohio","Columbus");
        Scanner input = new Scanner(System.in);
        String adr = input.next();

        System.out.println("The capital of " +adr + " is " + hashMap.get("California"));

    }
}
