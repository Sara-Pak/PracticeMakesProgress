import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import javax.naming.BinaryRefAddr;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Queue;

//----------| Sara Pak | Unit 3 Assignment  |---------
//-----------| Part B : Section 1 |--------- */
public class IT391_Unit3Assignment_PartB 
{
    public static void main(String[] args)
    {
        // implement a hashset for setMammals
        HashSet<String> setMammals = new HashSet<String>();

        //create + declare an array of mammals
        String mammals[] = 
        {
            "Bear", 
            "Gorilla", 
            "Tiger", 
            "Polar Bear", 
            "Lion", 
            "Monkey"
        };

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("------- | Part B : Section 1 | -------");
        System.out.println(" ");
        System.out.println("Contents of the set are:");
        System.out.println(Arrays.toString(mammals));

        TreeSet<String> sortedMammals = new TreeSet<String>();
        sortedMammals.add("Bear");
        sortedMammals.add("Gorilla");
        sortedMammals.add("Tiger");
        sortedMammals.add("Polar Bear");
        sortedMammals.add("Lion");
        sortedMammals.add("Monkey");

        System.out.println(" ");
        System.out.println("Contents of the sorted set are:");

        for (String item : sortedMammals)
        {
            System.out.print(item + " ");
        }

        System.out.println(" ");
        System.out.println("The first item in the sorted set is: " + sortedMammals.first()); //first="Bear"

        System.out.println(" ");
        System.out.println("The last item in the sorted set is: " + sortedMammals.last()); //last="Tiger"

    }

}

