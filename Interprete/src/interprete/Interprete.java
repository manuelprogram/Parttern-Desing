package interprete;

import java.util.*;

interface Expression {

    public void interprete(Stack<Integer> s);

}

class ExpresionTerminal_Numero implements Expression {

    private final int numero;

    public ExpresionTerminal_Numero(int numero) {
        this.numero = numero;
    }

    @Override
    public void interprete(Stack<Integer> s) {
        s.push(numero);
    }

}

class ExpresionTerminal_Mas implements Expression {

    @Override
    public void interprete(Stack<Integer> s) {
        s.push(s.pop() + s.pop());
    }

}

class ExpresionTerminal_Menos implements Expression {

    @Override
    public void interprete(Stack<Integer> s) {
        int tmp = s.pop();
        s.push(s.pop() - tmp);
    }
   
}

class Parser {

    private final ArrayList<Expression> parseTree = new ArrayList<>();// Solo una ExpresiónNoTerminal 

    Parser(String s) {
        for (String token : s.split(" ")) {
            switch (token) {
                case "+":
                    parseTree.add(new ExpresionTerminal_Mas());
                    break;
                case "-":
                    parseTree.add(new ExpresionTerminal_Menos()); // ... 
                    break;
                default:
                    parseTree.add(new ExpresionTerminal_Numero(Integer.valueOf(token)));
                    break;
            }
        }
    }

    public int evalua() {
        Stack<Integer> contexto = new Stack<>();
        for (Expression e : parseTree) {
            e.interprete(contexto);
        }
        return contexto.pop();
    }

}

class Interprete {

    public static void main(String[] args) {
        System.out.println("'42 2 1 - +' equals " + new Parser("5 3 1 2 1 - + - +").evalua());
    }

}
