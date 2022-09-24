import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Graph grafo = new Graph("DFS - Grafos/src/pequenoG.txt");
        int s = 12;
        DFS busca_em_Profundidade = new DFS(grafo, s);
        busca_em_Profundidade.start();

    }

}