import java.util.*;
import java.io.*;
 
class Main {
  public static void main(String[] args) throws IOException
  // add the ioexpection in case of an input output error
  {
    System.out.println(" ") ; 
    System.out.println(" ") ;

    String token = "";

    File fileName = new File("Hail.txt");

    Scanner inputFile = new Scanner(fileName);

    // use while loop to read tokens from the file hail.txt

    int count = 0;
    while (inputFile.hasNext()) {
      token = inputFile.next();
      System.out.println(token);
      count++; // this is to count the amount of tokens in the file
    }

    // you must close a file after you're done with it! you can't have two scanners
    // running at the same time

    inputFile.close();
    System.out.println("The number of tokens in Hail.txt is " + count + ".\n");

    System.out.println(" ") ; 
    System.out.println(" ") ;

    // scanning tokens in hail.txt, and adding them as elements in a string array

    Scanner inputFile2 = new Scanner(fileName);
    String[] hail = new String[count];
    int index = 0;

    while (inputFile2.hasNext()) {
      hail[index] = inputFile2.next();
      index++;
    }

    inputFile2.close();
    for (String i : hail) {
      System.out.println(i);
    }

    System.out.println(" ") ; 
    System.out.println(" ") ;

    // read intCommas.txt file with comma delimiter

    File fileName3 = new File("intCommas.txt");

    Scanner inputFile3 = new Scanner(fileName3).useDelimiter(",");

    // tell java that the delimiter, the thing breaking up the Strings into tokens,
    // is a comma. can be anything!

    while (inputFile3.hasNext()) {
      token = inputFile3.next();
    }

    inputFile2.close();
    for (String i : hail) {
      System.out.println(i);
    }

    inputFile3.close(); // have to close your scanners when you're done with them!

    System.out.println(" ") ; 
    System.out.println(" ") ;

    // reading the integers.txt file and calculating an average

    File fileName4 = new File("integers.txt");

    Scanner inputFile4 = new Scanner(fileName4);

    double average = 0.0;
    double sum = 0.0;
    int count4 = 0; // counting int

    while (inputFile4.hasNextInt()) {
      sum += inputFile4.nextInt();
      count4++;
    }

    inputFile4.close();
    average = sum / count4;
    System.out.println("Average of the integers in integers.txt: " + average);

    // writing to an otuput file
    
    File fileName5 = new File("hello.txt"); 
    PrintWriter outFile = new PrintWriter(fileName5); // makes one new file

    for (int loop = 1; loop <= 5; loop++) 
    {
      outFile.println(loop + " Hello, World!");
    } // end for loop

    outFile.close(); // close the file when finished

    System.out.println(" ") ; 
    System.out.println(" ") ;

    // the combo platter: reading intCommas.txt, calculating average, and putting it on an output file

    File fileName6 = new File("intCommas.txt");

    Scanner inputFile6 = new Scanner(fileName6).useDelimiter(","); // letting java know that the delimiter is a comma

    File fileName66 = new File("intCommasAvg.txt");

    PrintWriter outFile6 = new PrintWriter(fileName6); // makes one new file
    

    double sum6 = 0.0 ;
    int count6 = 0 ; 

    while(inputFile6.hasNextInt())
    {
      sum6 += inputFile6.nextInt();
      count6 ++ ; 
    }

    inputFile6.close();
    System.out.println("Average of integers in intCommas.txt: " + (sum6/count6));

  }
}