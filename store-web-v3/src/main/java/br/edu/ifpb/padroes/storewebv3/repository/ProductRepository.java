package br.edu.ifpb.padroes.storewebv3.repository;

import br.edu.ifpb.padroes.storewebv3.domain.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {

    private List<Product> productList = new ArrayList<>();

    public List<Product> getProductList() {
        return productList;
    }

    public boolean add(Product element) {
        return productList.add(element);
    }

    public boolean remove(Product product) {
        return productList.remove(product);
    }

}
