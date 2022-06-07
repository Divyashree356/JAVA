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
      String asf;
      int wsf;
      pp(){}
      pp(int src , String asf , int wsf)
      {
         this.src=src;
         this.asf=asf;
         this.wsf=wsf;
      }
   }

   public static void djkstraAlgo( ArrayList<Edge>[] graph, int src)
   {
      PriorityQueue<pp> pq= new PriorityQueue<>((a,b)->{
         return a.wsf-b.wsf;
      });

      int n=graph.length;
      int[] vis= new int[n];
      Arrays.fill(vis, Integer.MAX_VALUE);      
      pq.add(new pp(src,""+src,0));


      while(pq.size()!=0)
      {
         pp rem= pq.remove();

         if(vis[rem.src]!=Integer.MAX_VALUE)
          continue;

         if(vis[rem.src]== Integer.MAX_VALUE)
             vis[rem.src]=rem.wsf;
       
         if(vis[rem.src]!= Integer.MAX_VALUE )
         {
            System.out.println(rem.src+" via "+rem.asf+" @ "+rem.wsf);
         }
         

         for(Edge e: graph[rem.src])
         {
            int nbr= e.nbr;
            
            if(vis[nbr]== Integer.MAX_VALUE)
             pq.add(new pp(nbr ,rem.asf+nbr, e.wt+rem.wsf));
         }
      }

      // for(int e:vis)
      //  System.out.print(e+" ");
      
   }
   public static void main(String[] args) throws Exception {
      Scanner sc= new Scanner(System.in);
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
      int src = Integer.parseInt(br.readLine());
  
    djkstraAlgo(graph , src);
  
   }

}
