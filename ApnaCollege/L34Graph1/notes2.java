//BFS graph traversal
package ApnaCollege.L34Graph1;
import java.util.*;
public class notes2 {
  //class with the name Edge
  static class Edge{
    int src; 
    int dest;
    int wt;
    //constructor
    public Edge(int s, int d, int w){
      this.src= s;
      this.dest= d;
      this.wt= w;

    }
  }
  //method createGraph
  static void createGraph(ArrayList<Edge> graph[]){
    for(int i =0; i< graph.length;i++){
      graph[i]= new ArrayList<>();
    }
    //we assume that the weight of each node will be 1
    //0->vertex
    graph[0].add(new Edge(0, 1, 1));
    graph[0].add(new Edge(0, 2,1));

    //1->vertex
    graph[1].add(new Edge(1, 0, 1));
    graph[1].add(new Edge(1, 3, 1));
    
    //2-vertex
    graph[2].add(new Edge(2, 0, 1));
    graph[2].add(new Edge(2, 4, 1));

    //3->vertex;
    graph[3].add(new Edge(3, 1, 1));
    graph[3].add(new Edge(3, 4, 1));
    graph[3].add(new Edge(3, 5, 1));

    //4-> vertex
    graph[4].add(new Edge(4, 2, 1));
    graph[4].add(new Edge(4, 3, 1));
    graph[4].add(new Edge(4, 5, 1));

    //5-> vertex
    graph[5].add(new Edge(5, 3, 1));
    graph[5].add(new Edge(5, 4, 1));
    graph[5].add(new Edge(5, 6, 1));

    //6-> vertex
    graph[6].add(new Edge(6, 5, 1));

  }
  //creating a method for the BFS & T.C=O(V+E) with Adjancy list & O(V^2) with Adjancy metrix
  public static void bfs(ArrayList<Edge> graph[]){
    Queue<Integer> q= new LinkedList<>();
    boolean visited[] = new boolean[graph.length];
    q.add(4); //source from where we are start  traversal 0->1->2->... so on

    while (!q.isEmpty()) {
      int curr = q.remove();

      if(!visited[curr]){
        //step1-> print kara to curr element ko
        System.out.print(curr+ " ");
        //step2-> visited curr element to true kra do
        visited[curr] = true;
        //step3-> add the neighbour in queue 
        for(int i=0; i< graph[curr].size();i++){
          Edge e= graph[curr].get(i);
          q.add(e.dest);
        }
      }
      
    }
  }
  public static void main(String[] args) {
    int V=7;
    ArrayList<Edge> graph[] =new ArrayList[V];
    createGraph(graph);
    bfs(graph);
  }
}
