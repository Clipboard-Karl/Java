import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
//import java.util.*;

public class File_Read_01 {
  public static void main(String[] args) {
    try {
      Scanner sc=new Scanner(System.in);  //System.in is a standard input stream
      System.out.print("Enter the file name: ");
      String File_In_Name=sc.nextLine();
      //File myObj = new File("Biology_Terms_1_tab.txt");    //Input File Goes Here
      File myObj = new File(File_In_Name);    //Input File Goes Here
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}