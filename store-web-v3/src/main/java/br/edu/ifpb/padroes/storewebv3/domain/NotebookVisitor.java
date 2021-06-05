package br.edu.ifpb.padroes.storewebv3.domain;

public class NotebookVisitor extends Product {
	public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
