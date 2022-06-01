import java.io.*;
import java.util.*;

public class Main {
   

   public static class Edge{
         int src;
         int nbr;
         

         Edge(int src , int nbr )
         {
            this.src=src;
            this.nbr=nbr;
      
         }
   }
   // public static void addEdge(ArrayList<Edge>[] graph , int u , int v)
   // {
   //    graph[u].add(new Edge(u ,v));
   //    graph[v].add(new Edge(v ,u));
   // }

   public static void getSingleComp(ArrayList<Edge>[] graph ,ArrayList<Integer> single , int src , boolean[] vis)
   {
      single.add(src);
      vis[src]=true;
      for(Edge e: graph[src])
      {
         int nbr=e.nbr;
         if(!vis[nbr])
            getSingleComp(graph , single , nbr, vis);
      }
   }
   public static void getComponents(ArrayList<Edge>[] graph)
   {
      ArrayList<ArrayList<Integer>> comp= new ArrayList<>();

      boolean[] vis= new boolean[graph.length];

      for(int i=0;i<graph.length;i++)
      {
         if(!vis[i])
         {
            ArrayList<Integer> single= new ArrayList<>();
            getSingleComp(graph , single , i ,vis);
            comp.add(single);
      }
      }

      solve(graph , comp);
   }

   public static void solve(ArrayList<Edge>[] graph , ArrayList<ArrayList<Integer>> comp )
   {
      int s1=0;
      int s2=0;
      int ans=0;
      for(int i=0;i<comp.size();i++)
      {
         for(int j=i+1;j<comp.size();j++)
         {
            s1= comp.get(i).size();
            s2= comp.get(j).size();

            ans+= s1*s2;
         }
      }
      System.out.println(ans);
   }
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Scanner sc= new Scanner(System.in);

      int n = Integer.parseInt(br.readLine());
      int k = Integer.parseInt(br.readLine());
      
      ArrayList<Edge>[] graph=new ArrayList[n];
      for(int i=0;i<n;i++)
       graph[i]= new ArrayList<>();

      for(int i=0;i<k;i++)
      { 
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         graph[v1].add(new Edge(v1, v2));
         graph[v2].add(new Edge(v2, v1));
      }

      
      getComponents(graph);
   }

}
