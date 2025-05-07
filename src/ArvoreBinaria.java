class ArvoreBinaria {
    No raiz;

    public void inserir(int valor) {
        raiz = inserirRecursivo(raiz, valor);
    }

    private No inserirRecursivo(No no, int valor) {
        if (no == null) return new No(valor);

        if (valor < no.valor) {
            no.esquerdo = inserirRecursivo(no.esquerdo, valor);
        } else {
            no.direito = inserirRecursivo(no.direito, valor);
        }
        return no;
    }

    public void preOrdem() {
        System.out.print("Pré-ordem: ");
        preOrdemRecursivo(raiz);
        System.out.println();
    }

    private void preOrdemRecursivo(No no) {
        if (no != null) {
            System.out.print(no.valor + " ");
            preOrdemRecursivo(no.esquerdo);
            preOrdemRecursivo(no.direito);
        }
    }

    public void emOrdem() {
        System.out.print("Em-ordem: ");
        emOrdemRecursivo(raiz);
        System.out.println();
    }

    private void emOrdemRecursivo(No no) {
        if (no != null) {
            emOrdemRecursivo(no.esquerdo);
            System.out.print(no.valor + " ");
            emOrdemRecursivo(no.direito);
        }
    }

    public void posOrdem() {
        System.out.print("Pós-ordem: ");
        posOrdemRecursivo(raiz);
        System.out.println();
    }

    private void posOrdemRecursivo(No no) {
        if (no != null) {
            posOrdemRecursivo(no.esquerdo);
            posOrdemRecursivo(no.direito);
            System.out.print(no.valor + " ");
        }
    }
}
