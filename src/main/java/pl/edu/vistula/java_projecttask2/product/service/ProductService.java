package pl.edu.vistula.java_projecttask2.product.service;

import org.springframework.stereotype.Service;
import pl.edu.vistula.java_projecttask2.product.api.request.ProductRequest;
import pl.edu.vistula.java_projecttask2.product.api.response.ProductResponse;
import pl.edu.vistula.java_projecttask2.product.domain.Product;
import pl.edu.vistula.java_projecttask2.product.repository.ProductRepository;
import pl.edu.vistula.java_projecttask2.product.support.exception.ProductExceptionSupplier;
import pl.edu.vistula.java_projecttask2.product.support.ProductMapper;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    public ProductResponse create(ProductRequest productRequest) {
        Product product = productMapper.toProduct(productRequest);

        productRepository.save(product);

        return productMapper.toProductResponse(product);
    }

    public ProductResponse find(Long id) {
        Product product = productRepository.findById(id).orElseThrow(ProductExceptionSupplier.productNotFound(id));
        return productMapper.toProductResponse(product);
    }
    public ProductResponse update(Long id, ProductRequest productRequest) {
        Product product = productRepository.findById(id)
                .orElseThrow(ProductExceptionSupplier.productNotFound(id));

        product.setName(productRequest.getName());

        productRepository.save(product);

        return productMapper.toProductResponse(product);
    }
    public void delete(Long id) {
        pl.edu.vistula.java_projecttask2.product.domain.Product product = productRepository.findById(id)
                .orElseThrow(ProductExceptionSupplier.productNotFound(id));

        productRepository.delete(product);
    }
}
