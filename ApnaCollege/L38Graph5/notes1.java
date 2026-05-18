// //Cheapest flights within K stops 
// package L38Graph5;
// import java.util.*;
// public class notes1 {
//   static class Edge{
//     int src, dest, wt;

//     public Edge(int s, int d, int w){
//       this.src=s;
//       this.dest =d;
//       this.wt = w;
//     }
//   }
//   public static void createGraph(int[][] flights, ArrayList<Edge> graph[]){
//     //empty arraylist in initial
//     for(int i =0; i< graph.length;i++){
//       graph[i] = new ArrayList<>();
//     }
//     //jaha bhi edge exist krta h vaha edge create kr denge
//     for(int i=0; i< flights.length; i++){
//       int src = flights[i][0];
//       int dest= flights[i][1];
//       int wt = flights[i][2];

//       Edge e = new Edge(src, dest, wt);
//       graph[src].add(e);
//     }

//   }
//   static class Info{
    
//   }
//   public static int CheapestFlights(int n , int[][] flights,int src, int dest, int k){
//     ArrayList<Edge> graph[] = new ArrayList[n];
//     createGraph(flights, graph);

//     int[] dist= new int[n];
//     for(int i=0; i < n ; i++){
//       if(i != src){
//         dist[i]= Integer.MAX_VALUE;
//       }
//     }
//     Queue<Info> q= new LinkedList<>();
    
//   }
//   public static void main(String[] args) {
//     int n=4;
//     int[][] flights= {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
//     int src=0, dest=3, k=1;
    
//   }
// }
