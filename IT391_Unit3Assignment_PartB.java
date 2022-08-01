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
        System.out.println(" ");
        System.out.println("The first item in the sorted set is: " + sortedMammals.first()); //first="Bear"
        System.out.println("The last item in the sorted set is: " + sortedMammals.last()); //last="Tiger"

        //-----------| Part B : Section 2 |--------- */
        
        //create a linked list called myFriends
        LinkedList<String> myFriends = new LinkedList<String>();

        //add friends and phone numbers to myFriends list
        myFriends.add("Fred 602-299-3300");
        myFriends.add("Ann 602-555-4949");
        myFriends.add("Grace 520-544-9898");
        myFriends.add("Sam 602-343-8723");
        myFriends.add("Dorothy 520-689-9745");
        myFriends.add("Susan 520-981-8745");
        myFriends.add("Bill 520-456-9823");
        myFriends.add("Mary 520-788-3457");

         //update Mary's phone number to 520-897-4567
         myFriends.set(7, "Mary 520-897-4567");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("------- | Part B : Section 2 | -------");
        System.out.println(" ");
        System.out.println("The contents of my friends list:");

        //print list of each friend on a new line
        Iterator<String> nextline = myFriends.iterator();
        while (nextline.hasNext()) 
        {
            System.out.println(nextline.next());

        }

        //remove Bill from list
        myFriends.remove("Bill 520-456-9823");

        //sort myFriends list then remove the first and last element from list 
        Collections.sort(myFriends);
        myFriends.removeFirst(); //Ann
        myFriends.removeLast(); //Susan

        System.out.println(" ");
        System.out.println("The updated contents of my Friends list:");
        
        //print list of updated friendlist on a new line
        Iterator<String> UpdatedNextline = myFriends.iterator();
        while (UpdatedNextline.hasNext()) 
        {
            System.out.println(UpdatedNextline.next());

        }

        System.out.println(" ");
        System.out.println("The number of friends in my list is: " + myFriends.size());

        //looks for Fred if he's still in myFriends list.
        int index = myFriends.indexOf("Fred 602-299-3300"); 
        
        if (index != -1)
        {
            System.out.print("Fred is still present in the list.");
        }
        else
        {
            System.out.print("Fred is NOT present in the list.");
        }
    }

}

