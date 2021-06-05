package br.edu.ifpb.padroes.storewebv3.domain;



public class DescontoVisitor implements Visitor {
	private final Double descontoLivros = 0.2;
  
 
	@Override
	public void visit(LivrosVisitor livrosVisitor) {
		Long newPrice = applyDesconto(livrosVisitor.getPrice(), descontoLivros);
        livrosVisitor.setPrice(newPrice);
		
	}
  

    @Override
    public void visit(Product product) {
        
    }

    private Long applyDesconto(Long price, Double porcentagem) {
        Double desconto = price * porcentagem;
        Long newPrice =  price - desconto.longValue();
        return newPrice;
    }

  
	@Override
	public void visit(NotebookVisitor notebookVisit) {
		
		
	}

	

	

	






	


}
