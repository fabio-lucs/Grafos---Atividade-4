import java.util.LinkedList;

public class DFS {
    private LinkedList<LinkedList<Integer>> graph;
    private int color[];
    private final byte white = 0, gray = 1, black = 2;
    private int[] i, ant, f;
    private int time = 0;
    private int inicial_vertice;

    public DFS(Graph g, int inicial_vertice) {
        this.inicial_vertice = inicial_vertice;
        this.graph = g.getListAdj();
        int order = g.getNumber_of_vertex();
        this.color = new int[order];
        this.ant = new int[order];
        this.i = new int[order];
        this.f = new int[order];

    }

    void start() {
        System.out.println("Iniciando a busca em profundidade a partir do vértice [" + this.inicial_vertice + "]");
        for (int index = 0; index < graph.size(); index++) {
            color[index] = white;
            i[index] = f[index] = ant[index] = -1;
        }
        time = 1;
        DFS_Visit(inicial_vertice);
    }

    private void DFS_Visit(int u) {
        color[u] = gray;
        i[u] = time++;
        for (Integer v : this.graph.get(u)) {
            if ((color[v] == white)) {
                ant[v] = u;
                // detalhesVertices(); //exibe situação dos vértices a cada iteração
                printPath(v);
                DFS_Visit(v);
            }
        }
        color[u] = black;
        f[u] = time++;
    }

    private void printPath(Integer v) {
        if (v == this.inicial_vertice) {
            System.out.println(v);
        } else {
            if (ant[v] == -1) {
                System.out.println("Não há caminho!");
            } else {
                printPath(ant[v]);
                System.out.println(v);
            }
        }
    }

}
