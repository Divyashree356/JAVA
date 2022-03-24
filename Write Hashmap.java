import java.io.*;
import java.util.*;

public class Main {

  public static class HashMap<K, V> {
    private class HMNode {
      K key;
      V value;

      HMNode(K key, V value) {
        this.key = key;
        this.value = value;
      }
    }

    private int size; // n
    private LinkedList<HMNode>[] buckets; // N = buckets.length

    public HashMap() {
      initbuckets(4);
      size = 0;
    }

    private void initbuckets(int N) {
      buckets = new LinkedList[N];
      for (int bi = 0; bi < buckets.length; bi++) {
        buckets[bi] = new LinkedList<>();
      }
    }
    private int findBucketIndex(K key)
    {
      int hc= key.hashCode();
      int bi= Math.abs(hc)%buckets.length;

      return bi;

    }
    private int findLLIdx(K key , int bi)
    {
      LinkedList<HMNode> temp = buckets[bi];
      for(int i=0;i<temp.size();i++)
      {
        HMNode node = temp.get(i);
         if(key.equals(node.key))
           return i;
      }
      return -1;
    }
    private void rehashing() throws Exception
    {
      LinkedList<HMNode> [] oldBuckets= buckets;
      initbuckets(2*oldBuckets.length);
      size=0;

      for(int bi=0;bi<oldBuckets.length;bi++)
      {
        for(int di=0;di<oldBuckets[bi].size();di++)
        {
          HMNode node = oldBuckets[bi].get(di);
          put(node.key , node.value);
        }
      }
    }
    public void put(K key, V value) throws Exception {
      
      int buckIdx= findBucketIndex(key);
      int llIdx  = findLLIdx(key , buckIdx);

      if(llIdx==-1)
      {
        LinkedList<HMNode> temp = buckets[buckIdx];
        HMNode node= new HMNode(key , value);
        temp.add(node);
        size++;
     }
     else
     {
      LinkedList<HMNode> temp= buckets[buckIdx];
      HMNode node = temp.get(llIdx);
      node.value= value;
     }

     double lambda= (size*1.0)/buckets.length;
     if(lambda>2)
     {
       rehashing();
     }
    }

    public V get(K key) throws Exception {
      
      int buckIdx= findBucketIndex(key);
      int llIdx  = findLLIdx(key , buckIdx);

      if(llIdx==-1)
       return null;
      else
      { LinkedList<HMNode> temp = buckets[buckIdx];
       HMNode node = temp.get(llIdx);
       return node.value;
    }
    }

    public boolean containsKey(K key) {
    
      int buckIdx= findBucketIndex(key);
      int llIdx  = findLLIdx(key , buckIdx);

      if(llIdx==-1)
       return false;
      else
       return true;
    }

    public V remove(K key) throws Exception {
        
      int buckIdx= findBucketIndex(key);
      int llIdx  = findLLIdx(key , buckIdx);

      if(llIdx==-1)
       return null;

      else
      { 
       LinkedList<HMNode> temp = buckets[buckIdx];
       HMNode node = temp.get(llIdx);
       V cvalue= node.value;
       temp.remove(llIdx);
       size--;
       return cvalue;
    }
    }

    public ArrayList<K> keyset() throws Exception {
      
      ArrayList<K> keySet = new ArrayList<K>();
      for(int bi=0;bi<buckets.length;bi++)
      {
       for(int di=0;di<buckets[bi].size();di++)
        {
          HMNode node= buckets[bi].get(di);
          keySet.add(node.key);
      }
      }
      return keySet;
      }

    public int size() {
      return this.size;
    }

   public void display() {
      System.out.println("Display Begins");
      for (int bi = 0; bi < buckets.length; bi++) {
        System.out.print("Bucket" + bi + " ");
        for (HMNode node : buckets[bi]) {
          System.out.print( node.key + "@" + node.value + " ");
        }
        System.out.println(".");
      }
      System.out.println("Display Ends");
  }
}

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashMap<String, Integer> map = new HashMap();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("put")) {
        String[] parts = str.split(" ");
        String key = parts[1];
        Integer val = Integer.parseInt(parts[2]);
        map.put(key, val);
      } else if (str.startsWith("get")) {
        String[] parts = str.split(" ");
        String key = parts[1];
        System.out.println(map.get(key));
      } else if (str.startsWith("containsKey")) {
        String[] parts = str.split(" ");
        String key = parts[1];
        System.out.println(map.containsKey(key));
      } else if (str.startsWith("remove")) {
        String[] parts = str.split(" ");
        String key = parts[1];
        System.out.println(map.remove(key));
      } else if (str.startsWith("size")) {
        System.out.println(map.size());
      } else if (str.startsWith("keyset")) {
        System.out.println(map.keyset());
      } else if (str.startsWith("display")) {
        map.display();
      }
      str = br.readLine();
    }
  }
}
