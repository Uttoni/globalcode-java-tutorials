public class StringBufferBuilderGC {
    public void metodoStringBufferBuilder(){
        int qtd = Integer.parseInt("100");

        long inicio = System.currentTimeMillis();
        concatenaString(qtd);
        long fim = System.currentTimeMillis();

        System.out.println("String: ");
        System.out.println("Tempo total: " + (fim - inicio));

        inicio = System.currentTimeMillis();
        concatenaStringBuffer(qtd);
        fim = System.currentTimeMillis();

        System.out.println("StringBuffer: ");
        System.out.println("Tempo total: " + (fim - inicio));

        inicio = System.currentTimeMillis();
        concatenaStringBuilder(qtd);
        fim = System.currentTimeMillis();

        System.out.println("StringBuilder: ");
        System.out.println("Tempo total: " + (fim - inicio));
    }

    private static void concatenaString(int numConcatenacoes) {
        String s = "";
        for (int i = 0; i <= numConcatenacoes; i++) {
            s = s + i;
        }
    }

    private static void concatenaStringBuffer(int numConcatenacoes) {
        StringBuffer s = new StringBuffer("");
        for (int i = 0; i <= numConcatenacoes; i++) {
            s.append(i);
        }
    }

    private static void concatenaStringBuilder(int numConcatenacoes) {
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i <= numConcatenacoes; i++) {
            s.append(i);
        }
    }
}
