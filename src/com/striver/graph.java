package com.striver;
import java.util.*;
import com.striver.arrays.*;

public class graph {
    static class Edge{
        int src;
        int dest;
       float weight;

        public Edge(int src, int dest ,float weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }
    static class Pair implements Comparable<Pair>{
        int node;
        int dist;
        public Pair(int node, int dist) {
            this.node =node ;
            this.dist = dist;
        }
        @Override
        public int compareTo(Pair p) {
            return this.dist - p.dist;
        }
    }
    public static void createGraphUD(ArrayList<Edge>[] graph ){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter all values 0 to exit ");
        System.out.println("The src and destination must not be grater then "+(graph.length-1));
        while(true) {
            System.out.println("Enter the source and destination :");
            int src=sc.nextInt();
            int dest=sc.nextInt();
            int weight=sc.nextInt();
            if (src == dest  && src==0) break;
            graph[src].add(new Edge(src, dest, weight));
            graph[dest].add(new Edge(dest, src , weight));

        }
    }
    public static void createGraphD(ArrayList<Edge>[] graph ){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter all values 0 to exit ");
        System.out.println("The src and destination must not be grater then "+(graph.length-1));
        while(true) {
            System.out.println("Enter the source and destination and weight:");
            int src=sc.nextInt();
            int dest=sc.nextInt();
            int weight=sc.nextInt();
            if (src == dest && weight==src && src==0) break;
            graph[src].add(new Edge(src, dest,weight));
        }
    }
    public static void BFS(ArrayList<Edge>[] graph){
        boolean[] visited = new boolean[graph.length];
        Queue<Integer> q= new LinkedList<>();
        for (int i = 0; i < graph.length; i++) {
            if(!visited[i]){
                q.add(i);
            while (!q.isEmpty()) {
                int curr = q.remove();
                if (!visited[curr]) {
                    System.out.print(curr + " ");
                    visited[curr] = true;
                    for (int j = 0; j < graph[curr].size(); j++) {
                        Edge e = graph[curr].get(j);
                        q.add(e.dest);
                    }
                }
            }
        }
        }
    }
    public static void DFS(ArrayList<Edge>[] graph,int curr,boolean[] vis){
        if (!vis[curr]) {
            System.out.print(curr + " ");
            vis[curr] = true;
            for(int i =0;i<graph[curr].size();i++){
                Edge e = graph[curr].get(i);
                DFS(graph,e.dest,vis);
            }
        }
    }
    public static void allPath(ArrayList<Edge>[] graph , int curr,int tar,boolean[] vis, String path){
        if (curr==tar) {
            System.out.println(path);
            return;
        }
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                vis[curr] = true;
               allPath(graph,e.dest,tar,vis,path+e.dest);
                vis[curr] = false;
            }
        }
    }
    public static boolean detectCycleD(ArrayList<Edge>[] graph,int curr, boolean[] vis,boolean[] reqstack){
            vis[curr] = true;
            reqstack[curr] = true;
            for(int i =0;i<graph[curr].size();i++) {
                Edge e = graph[curr].get(i);
                if (reqstack[e.dest])
                    return true;
                else if (!vis[e.dest])
                    return detectCycleD(graph, e.dest, vis, reqstack);
            }
        reqstack[curr] = false;

        return false;
    }
    public static boolean detectCycleUD(ArrayList<Edge>[] graph,int curr, boolean[] vis, int p){
        vis[curr] = true;
        for(int i =0;i<graph[curr].size();i++) {
            Edge e = graph[curr].get(i);
            if(e.dest!=p && vis[e.dest])
                return true;
            else if (!vis[e.dest])
                if( detectCycleUD(graph, e.dest, vis, curr))
                    return true;
        }
        return false;
    }
    public static void topOrder(ArrayList<Edge>[] graph,int curr, boolean[] vis,Stack<Integer> stack){
        vis[curr] = true;
        for(int i =0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if (!vis[e.dest])
                topOrder(graph,e.dest,vis,stack);
        }
        stack.push(curr);
    }
    public static void topsort(ArrayList<Edge>[] graph){
        Stack<Integer> stack = new Stack<>();
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                topOrder(graph,0,vis,stack);
            }
        }
        System.out.println("topological sort");
        while (!stack.isEmpty()) {
            int curr = stack.pop();
            System.out.print(curr+" ,");
        }
    }
    public static void Dijkstra(ArrayList<Edge>[] graph,int sorc){
//        0 1 1 0 3 2 1 2 2 1 3 3 3 4 3 4 2 1 4 6 3 2 5 2 5 7 3 6 7 4 0 0 0
        PriorityQueue<Pair> pq= new PriorityQueue<>();
        pq.add(new Pair(sorc,0));
        boolean[] vis = new boolean[graph.length];
        int dist[] = new int[graph.length];
        for (int i = 0; i < dist.length; i++) {
            if(i!=sorc)
                dist[i]=Integer.MAX_VALUE;
        }

        while (!pq.isEmpty()) {
            Pair curr= pq.remove();
            if (!vis[curr.node]){
                vis[curr.node] = true;
                for (int j = 0; j < graph[curr.node].size(); j++) {
                    Edge e = graph[curr.node].get(j);
                    int u=e.src;
                    int v=e.dest;
                    if(dist[u]+e.weight<dist[v]) {
                        dist[v] = dist[u] + (int)(e.weight);
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }

        for (int i = 0; i < graph.length; i++) {
            System.out.print(dist[i]+" ,");
        }

    }
    public static void BellmanFord(ArrayList<Edge>[] graph,int sorc){
//        0 1 1 0 3 2 1 2 -2 1 3 3 3 4 3 4 2 -1 4 6 -3 2 5 2 5 7 3 6 7 -4 0 0 0
        int dist[] = new int[graph.length];
        for (int i = 0; i < dist.length; i++) {
            if(i!=sorc)
                dist[i]=Integer.MAX_VALUE;
        }
        for (int i = 0; i <graph.length-1; i++) {
            for (int j = 0; j < graph.length; j++) {
                for (int k = 0; k < graph[j].size(); k++) {
                    Edge e = graph[j].get(k);
                    int u=e.src;
                    int v=e.dest;
                    if(dist[u]!=Integer.MAX_VALUE && dist[u]+e.weight<dist[v]) {
                        dist[v] = dist[u] + (int)(e.weight);
                    }
                }
            }
        }
        for (int i = 0; i < graph.length; i++) {
            System.out.print(dist[i]+" ,");
        }

    }
    public static void Prims(ArrayList<Edge>[] graph){
//      0 1 3 0 2 2 0 3 4 0 6 8 1 2 4 1 4 2 1 5 5 1 3 6 4 5 4 5 3 3 6 3 3 0 0 0
        PriorityQueue<Pair> pq= new PriorityQueue<>();
        pq.add(new Pair(0,0));
        int cost=0;
        boolean[] vis = new boolean[graph.length];
        while (!pq.isEmpty()) {
            Pair curr= pq.remove();
            if (!vis[curr.node]){
                vis[curr.node] = true;
                cost+=curr.dist;
                for (int i = 0; i < graph[curr.node].size(); i++) {
                    Edge e = graph[curr.node].get(i);
                    if (!vis[e.dest])
                        pq.add(new Pair(e.dest,(int)(e.weight)));
                }
            }
        }
        System.out.println(cost);
    }



    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of vertices: ");
        int v = in.nextInt();
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraphUD(graph);
//        createGraphD(graph);
        System.out.println("BfS of the above graph is :");
        BFS(graph);
        System.out.println();
        System.out.println("DfS of the above graph is :");
        DFS(graph,0,new boolean[v]);
        System.out.println();
        Prims(graph);
//        Dijkstra(graph,0);
//        BellmanFord(graph,0);
//        System.out.println();
//        System.out.println("All paths is :");
//        allPath(graph,0,5,new boolean[v],"0");
//        boolean vis[] = new boolean[v];
//        for (int i = 0; i < graph.length; i++) {
//           if (!vis[i]) {
//                if(detectCycleD(graph,0,vis,new boolean[v])) {
//                    System.out.println("Cyclic path found");
//                    break;
//                }
//            }
//        }
//        topsort(graph);
//        System.out.println("is cyclic : "+detectCycleUD(graph,0,new boolean[v],-1));

    }
}
