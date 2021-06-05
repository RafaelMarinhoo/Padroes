package br.edu.ifpb.padroes.storewebv3.domain;

public interface Visitor {
	
	void visit(LivrosVisitor livrosVisitor);
    void visit(Product product);
	void visit(NotebookVisitor notebookVisitor);

}
