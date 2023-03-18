package com.bytetech.SalesManagementwebapp.ServiceImpl;

import com.bytetech.SalesManagementwebapp.Model.Product;
import com.bytetech.SalesManagementwebapp.repository.ProductRepository;
import com.bytetech.SalesManagementwebapp.service.ProductService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;


    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository=productRepository;
    }
    @Override
    public List<Product> findAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product searchProduct(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(String name, Product product) {
        Product existing = productRepository.findByName(name);
        if(existing != null ){
            existing.setName(product.getName());
            existing.setGrams(product.getGrams());
            existing.setPrice(product.getPrice());
            existing.setQuantity(product.getQuantity());
            return productRepository.save(existing);
        }
        return null;
    }

    @Override
    public String deleteProduct(String name) {
        Product existing = productRepository.findByName(name);
        if(existing != null){
            Long id = existing.getId();
            productRepository.deleteById(id);
            return "Product deleted successfully";
        }
        return "No such product";
    }
}
