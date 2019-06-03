package stackdemo;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> st = new Stack<String>();
        st.push("Legalja");
        st.push("K�zepe");
        st.add("Teteje"); //"add"-al is hozz� lehet adni elemet
        
        printStack(st);
        st.pop();
        printStack(st);
        st.pop();
        printStack(st);
        st.pop();
        printStack(st);
    }
    public static void printStack(Stack <String> sta){
        System.out.println(sta.isEmpty() ? "A verem �res" : sta.toString());
    };
}
