public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        int[] valores = {5, -3, 2, -8, 0, 6, 7};

        for (int v : valores) {
            arvore.inserir(v);
        }

        arvore.preOrdem();
        arvore.emOrdem();
        arvore.posOrdem();
    }
}