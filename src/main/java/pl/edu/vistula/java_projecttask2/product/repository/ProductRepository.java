package pl.edu.vistula.java_projecttask2.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.vistula.java_projecttask2.product.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // This looks empty, but JpaRepository provides all the SQL magic automatically.
}



