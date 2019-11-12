import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.*;
public class Main {
    public static String sortString(String inputString) {
        char tempArray[]=inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Please type a word.");
        String inputString=scan.next();
        String outputString=sortString(inputString);
        System.out.println("Original String: "+inputString);
        System.out.println("Changed String: "+outputString);
        System.out.println("Original String: "+inputString);
        //String input=scan.next();

       }
    }
