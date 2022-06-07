import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt) {
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }
   static class pp{
      int src;
      int parent;
      int wt;
      pp(){}
      pp(int src , int parent , int wt)
      {
         this.src=src;
         this.parent=parent;
         this.wt=wt;
      }
   }

   public static int primAlgo( ArrayList<Edge>[] graph)
   {
      PriorityQueue<pp> pq= new PriorityQueue<>((a,b)->{
         return a.wt-b.wt;
      });

      int n=graph.length;
      boolean[] vis= new boolean[n];

      pq.add(new pp(0,-1,0));
      int minCost=0;

      while(pq.size()!=0)
      {
         pp rem= pq.remove();

         if(!vis[rem.src])
            minCost+= rem.wt;

         vis[rem.src]=true;
       

         for(Edge e: graph[rem.src])
         {
            int nbr= e.nbr;
            
            if(!vis[nbr])
             pq.add(new pp(nbr , rem.src, e.wt));
         }
         
         // if(rem.parent!-1)
         // {

         // }
      
      }
      return minCost;
   }
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }

    int ans= primAlgo(graph);
    System.err.println(ans);
   }

}
