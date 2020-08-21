//Representation of Graph in a Adjacency List using Array of ArrayList
import java.util.*; 
public class AdjacencyList { 
    public static void main(String[] args) 
    { 
        Scanner sc= new Scanner(System.in);
        //n nodes and m edges 
        int n=sc.nextInt();
        int m=sc.nextInt();
  
        ArrayList<Integer> graph[]=new ArrayList[n];
        //Initialization
        for(int i=0;i<n;i++)
        {
          graph[i] = new ArrayList<Integer>();
        }
        // each line contains two integer representing a connection between two nodes. and Lets consider it directed
        // c--------------->d
        for(int i=0;i<m;i++)
        {
          int c=sc.nextInt();
          int d=sc.nextInt();
          graph[c].add(d);
        }
        
        //printing
        for (int i = 0; i < n; i++) { 
            System.out.print("Adjacency List of " +i+ "----------> ");
            for (int j = 0; j < graph[i].size(); j++) { 
                System.out.print(graph[i].get(j) + " "); 
            } 
            System.out.println(); 
        }
        
        
        
         
    } 
}
