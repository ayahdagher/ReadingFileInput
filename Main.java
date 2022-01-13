import java.util.* ; 
import java.io.* ;

class Main {
  public static void main(String[] args) throws IOException
// add the ioexpection in case of an input output error
{

String token = "" ;

File fileName = new File("Hail.txt");

Scanner inputFile = new Scanner(fileName); 

// use while loop to read tokens from the file hail.txt

int count = 0 ; 
while(inputFile.hasNext())
{
  token = inputFile.next(); 
  System.out.println(token);
  count ++ ; // this is to count the amount of tokens in the file 
}

// you must close a file after you're done with it! you can't have two scanners running at the same time

inputFile.close();
System.out.println("The number of tokens in Hail.txt is " + count + ".\n"); 

// scanning tokens in hail.txt, and adding them as elements in a string array

Scanner inputFile2 = new Scanner(fileName) ;
String [] hail = new String[count]; 
int index = 0 ; 

while(inputFile2.hasNext())
{
  hail[index] = inputFile2.next(); 
  index ++ ; 
}

inputFile2.close();
for(String i : hail)
{
  System.out.println(i);
}

//read HailCommas.txt file with comma delimiter 

File fileName3 = new File("HailCommas.txt");

Scanner inputFile3 = new Scanner(fileName3).useDelimiter(","); 

// tell java that the delimiter, the thing breaking up the Strings into tokens, is a comma. can be anything!

while(inputFile3.hasNext())
{
  token = inputFile3.next(); 
}

inputFile2.close();
for(String i : hail)
{
  System.out.println(i);
}

}
}