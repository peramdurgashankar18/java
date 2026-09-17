// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int V=sc.nextInt();
        int E=sc.nextInt();
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<E;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        System.out.println(adj);
    }
}
