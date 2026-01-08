package pl.edu.vistula.java_projecttask2.product.support;

import org.springframework.stereotype.Component;
import pl.edu.vistula.java_projecttask2.product.api.request.ProductRequest;
import pl.edu.vistula.java_projecttask2.product.api.response.ProductResponse;
import pl.edu.vistula.java_projecttask2.product.domain.Product;

@Component
public class ProductMapper {

    public Product toProduct(ProductRequest productRequest) {
        // 1. Create an empty Product
        Product product = new Product();

        // 2. Set the name from the request
        product.setName(productRequest.getName());

        // 3. We do NOT set the ID here, because the Database does that automatically
        return product;
    }

    public ProductResponse toProductResponse(Product product) {
        // This part is likely fine, assuming ProductResponse has this constructor
        return new ProductResponse(product.getId(), product.getName());
    }
}