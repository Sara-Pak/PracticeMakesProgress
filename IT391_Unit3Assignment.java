/*----------| Sara Pak | Unit 3 Assignment  |---------
------------|       Part A : Section 1      |--------- */

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.LinkedList;

public class IT391_Unit3Assignment 
{
    public static void main(String[] args) 
    {
        System.out.println(" ");
        System.out.println("------- | Part A : Section 1 | -------");
        System.out.println(" ");

        // [] : array of professions
        String[] professions = new String[] 
        { 
            "Software Engineer",
            "Programmer",
            "Database Administrator",
            "Network Administrator",
            "Web Developer",
            "Program Manager"
        };
        
        HashSet<String> setProfessions = new HashSet<String>();
        try {
                //taking the string (professions)
                for (int i = 0; i < professions.length; i++) 
                {
                    setProfessions.add(professions[i]);
                }
                
                System.out.println("Original List: ");
                System.out.print("[");
                
                for (int i = 0; i < professions.length; i++)
                {
                    System.out.print(professions[i]);

                    if(i == professions.length -1)
                    {
                        System.out.print("] ");
                    }
                    else
                    {
                        System.out.print(", ");
                    }
                } 

                System.out.println(" ");
                System.out.println(" ");
                System.out.println("Sorted List: ");

                SortedSet<String> sortedProfessions = new TreeSet<String>(setProfessions);
                System.out.print("[");
                
                Iterator<String> jobs = sortedProfessions.iterator();
                
                while (jobs.hasNext()) 
                    {
                        System.out.print(jobs.next());

                        if (jobs.hasNext())
                           
                            System.out.print(",");
                    }

                    System.out.print("]");
            }
                catch (Exception ex)
                {
                    System.out.println("Error: " + ex);
                }


        /*----------| Part A : Section 2 |--------- */
       
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("------- | Part A : Section 2 | -------");
        System.out.println(" ");

        //create a list of books
        LinkedList<String> books = new LinkedList<String>();

        //adding books to list
        books.add("To Kill a Mockingbird");
        books.add("Huckleberry Finn");
        books.add("Pride and Prejudice");
        books.add("Brave New World");
        books.add("Lord of the Flies");
        books.add("Alice in Wonderland");
        books.add("The Old Man and the Sea");
        books.add("Atlas Shrugged");

        //print out the original list
        System.out.println("Original Book List: ");
        System.out.print("[");
       
        for (int i = 0; i < books.size(); i++) 
        {
            System.out.print(books.get(i));
            if(i == books.size() -1)
                    {
                        System.out.print("] ");
                    }
                    else
                    {
                        System.out.print(", ");
                    }
        }
    
        //sorts books alphabetically
        Collections.sort(books); 
        System.out.println("\n");
        System.out.println("Sorted Book List: ");
        System.out.print(books);
        System.out.println("\n");
        
        //removes items from list (0: the first item, 1: second item, -1 last item from list)
        books.remove(1);
        books.remove(0); 
        books.remove(books.size() - 1);

        System.out.println("Book List After Deletions: ");
        //remaining books after deletions
        System.out.println(books);
        System.out.printf("\n");

        //remaining number of books
        System.out.println("The number of items in my book list is: " + books.size() + "\n");
       
        //looks for title: brave new world
        int index = books.indexOf("Brave New World"); 
        
        if (index != -1)
        {
            System.out.print("Brave New World is in the list.");
        }
        else
        {
            System.out.print("Brave New World is not in the list.");
        }


         /*----------| Part A : Section 3 |--------- */
       
         System.out.println(" ");
         System.out.println(" ");
         System.out.println("------- | Part A : Section 3 | -------");
         System.out.println(" ");

    //      LinkedList<String> tree = new LinkedList<String>();
      
    //      //create a class called Node 
    //      class Node 
    //       {
    //          Node left;
    //          Node right;
    //          int value;
             
    //         public Node(int value)
    //         {
    //          this.value = value;
    //         }
 
    //       } 
          
    //       //create a class called BinaryTree
    //       class BinaryTree 
    //       {
    //          //create nodes of the tree
    //          public void Create()
    //          {
    //              BinaryTree tree = new BinaryTree();
    //              Node rootnode = new Node(50);
    //              tree.insert(rootnode, 30);
    //              tree.insert(rootnode, 45);
    //              tree.insert(rootnode, 12);
    //              tree.insert(rootnode, 29);
    //              System.out.println("The contents of the binary tree are: \n");
    //              traverse(rootnode);
    //          }
 
    //          public void traverse(Node rootnode)
    //          {
    //              printlnOrder(rootnode); //use recursion to traverse the tree
    //          }
 
    //           //create an insert Method for BinaryTree
    //          public void insert(Node node, int value)
    //          {
    //              if (value < node.value)
    //              {
    //                  if (node.left != null)
    //                  {
    //                      insert(node.left, value);
    //                  }
    //                  else
    //                  {
    //                      //insert + value + to left of node + node.value
    //                      node.left = new Node(value);
    //                  }
    //              }
    //              else if (value > node.value)
    //              {
    //                  if (node.right!= null)
    //                  {
    //                      insert(node.right, value);
    //                  }
    //                  else
    //                  {
    //                      //insert + value + to right of node + node.value
    //                      node.right = new Node(value);
    //                  }
    //              }
     
    //          }
    //          public void printlnOrder(Node node)
    //          {
    //              if(node != null)
    //              {
    //                  printlnOrder(node.left);
    //                  System.out.println("Traversed" + node.value + "\n");
    //                  printlnOrder(node.right);
    //              }
    //          }
 
    //  } 
    
    }
}
        
         

