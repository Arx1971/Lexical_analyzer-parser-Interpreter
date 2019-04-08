package java_parser_implementation;

public class VarPrimary extends Primary {

	Var var;

	public VarPrimary(Var var) {
		this.var = var;
	}

	public void printParseTree(String indent) {

		super.printParseTree(indent);
		var.printParseTree(indent);
	}

}