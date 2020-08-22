//Representation of Graph in a Adjacency List using Array of ArrayList and finding its DFS
import java.util.*; 
public class DFS { 
    ArrayList<Integer> graph[];
    public static void main(String[] args) 
    { 
        Scanner sc= new Scanner(System.in);
        //n nodes and m edges 
        int n=sc.nextInt();
        int m=sc.nextInt();
  
        graph=new ArrayList[n];
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
        
        DFS ob =ew DFS();
        boolean visited[] = new boolean[n];
        int head=sc.nextInt();
        ob.dfs(head,visited);
        
         
    } 
    void dfs(int head,boolean visited[])
    {
    //visited array can be made global but thats not a good practice.
      visited[head]=true;
      System.out.println(head + "----->");
      for(int i=0; i<graph[head].size(); i++)
      {
        int child= (int)graph[head].get(i);
        if(visited[child]==false)
        {
          dfs(child,visited);
        }
      }
    }
}
//Complexity ------O(M+N)
