package interpeter_final;

import java.util.HashMap;

abstract class FunCall {
    FunName funName;

    void printParseTree(String indent) {
        IO.displayln(indent + indent.length() + " <fun call>");
        funName.printParseTree(indent + " ");
    }

    abstract Val Eval(HashMap<String, Val> state);

    abstract void M(HashMap<String, Val> state);
}