package parser;

public class ArrayName {

	String id;
	EList eList;

	public ArrayName(String id, EList eList) {
		this.id = id;
		this.eList = eList;
	}

	public ArrayName(String id) {
		this.id = id;
	}

	void printParseTree(String indent) {
		String indent1 = indent + " ";
		IO.display(indent + indent.length() + " <array name>");
		IO.displayln(indent1 + indent1.length() + " " + id);
		IO.display(indent + indent.length() + "[ ");
		eList.printParseTree(indent1);
		IO.display(indent + indent.length() + " ]");
	}

}
