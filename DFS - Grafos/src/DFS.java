import java.util.LinkedList;

public class DFS {
    private LinkedList<LinkedList<Integer>> graph;
    private final byte white = 0, gray = 1, black = 2;
    private int[] color, ant, f, i;

    public DFS(Graph graph) {
        this.graph = graph.getListAdj();
    }

    public void DFS_Start(int s) {
        
    }

}
