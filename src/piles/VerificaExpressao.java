package piles;

public class VerificaExpressao {
    public static boolean delimitadoresCorretos(String expressao) {
        PilhaVetor<Character> pilha = new PilhaVetor<>(expressao.length());

        for (char c : expressao.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                pilha.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (pilha.estaVazia()) return false;
                char topo = pilha.pop();
                if ((c == ')' && topo != '(') ||
                    (c == ']' && topo != '[') ||
                    (c == '}' && topo != '{')) {
                    return false;
                }
            }
        }
        return pilha.estaVazia();
    }
}
