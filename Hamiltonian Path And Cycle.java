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
   public static void hamiltonian(ArrayList<Edge>[] graph ,int csrc , int src , boolean[] vis , String path)
   {
      if(path.length() == graph.length)
      {
         // System.out.println("run");
         System.out.print(path);

         for(Edge e: graph[src])
            {
               if(csrc==e.nbr)
                {
                   System.out.println("*");
                   return;
                }
            }
         System.out.println(".");
          return;
         }

      vis[csrc]=true;
      for(Edge e: graph[csrc])
      {
         int nbr= e.nbr;
         if(!vis[nbr])
          {
            //  System.out.println("running");
             hamiltonian(graph , nbr , src, vis , path+nbr );
          }
      }

      vis[csrc]=false;
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

      int src = Integer.parseInt(br.readLine());
      boolean[] vis= new boolean[vtces];
      //  ArrayList<String> ans= new ArrayList<>();
       hamiltonian(graph , src ,src, vis ,""+src);
      
    }


}




//using hashset
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
   public static void hamiltonian(ArrayList<Edge>[] graph ,int csrc , int src , HashSet<Integer> hs , String path)
   {
      if(hs.size() == graph.length-1)
      {
         // System.out.println("run");
         System.out.print(path);

         for(Edge e: graph[src])
            {
               if(csrc==e.nbr)
                {
                   System.out.println("*");
                   return;
                }
            }
         System.out.println(".");
          return;
         }

      hs.add(csrc);
      for(Edge e: graph[csrc])
      {
         int nbr= e.nbr;
         if(!hs.contains(nbr))
          {
            //  System.out.println("running");
             hamiltonian(graph , nbr , src, hs , path+nbr );
          }
      }

      hs.remove(csrc);
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

      int src = Integer.parseInt(br.readLine());
      // boolean[] vis= new boolean[vtces];
      //  ArrayList<String> ans= new ArrayList<>();
      HashSet<Integer> hs= new HashSet<>();
       hamiltonian(graph , src ,src, hs ,""+src);
      
    }


}
