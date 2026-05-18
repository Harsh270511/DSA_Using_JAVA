//topological sort using bfs
package ApnaCollege.L36Graph3;

import java.util.*;

public class notes1 {
  static class Edge {
    int src;
    int dest;

    public Edge(int s, int d) {
      this.src = s;
      this.dest = d;
    }
  }
//this is the method to create a graph
  public static void createGraph(ArrayList<Edge> graph[]) {
    for (int i = 0; i < graph.length; i++) {
      graph[i] = new ArrayList<>();
    }
    graph[2].add(new Edge(2, 3));

    graph[3].add(new Edge(3, 1));

    graph[4].add(new Edge(4, 0));
    graph[4].add(new Edge(4, 1));

    graph[5].add(new Edge(5, 0));
    graph[5].add(new Edge(5, 2));
  }

  // helper fxn to calculate the indegree
  public static void calInDegree(ArrayList<Edge> graph[], int[] idgre) {
    for (int i = 0; i < graph.length; i++) {
      int vertx = i;
      for (int j = 0; j < graph[vertx].size(); j++) {
        Edge e = graph[vertx].get(j);
        idgre[e.dest]++;
      }
    }
  }

  //method for the actual kaam
  public static void topoSort(ArrayList<Edge> graph[]) {
    int[] idgre = new int[graph.length];
    calInDegree(graph, idgre);
    Queue<Integer> q = new LinkedList<>();

    for (int i = 0; i < idgre.length; i++) {
      if (idgre[i] == 0) {
        q.add(i);
      }
    }
    // bfs
    while (!q.isEmpty()) {
      int curr = q.remove();
      System.out.print(curr + " ");

      for (int i = 0; i < graph[curr].size(); i++) {
        Edge e = graph[curr].get(i);
        idgre[e.dest]--;
        if (idgre[e.dest] == 0) {
          q.add(e.dest);
        }
      }

    }
    System.out.println();
  }

  public static void main(String[] args) {
    int V = 6;
    ArrayList<Edge> graph[] = new ArrayList[V];
    createGraph(graph);
    topoSort(graph);

  }
}
