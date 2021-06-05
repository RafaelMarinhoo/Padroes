package br.edu.ifpb.padroes.storewebv3.facade;

import java.util.List;

import br.edu.ifpb.padroes.storewebv3.domain.Product;
import br.edu.ifpb.padroes.storewebv3.repository.ProductRepository;

public class ProductFacade {

    private final ProductRepository productRepository;

    public ProductFacade(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> listAllProducts() {
        return productRepository.getProductList();
    }

}
