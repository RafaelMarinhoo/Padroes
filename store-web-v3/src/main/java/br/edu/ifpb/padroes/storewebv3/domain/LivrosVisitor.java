package br.edu.ifpb.padroes.storewebv3.domain;

public class LivrosVisitor extends Product{
	public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
