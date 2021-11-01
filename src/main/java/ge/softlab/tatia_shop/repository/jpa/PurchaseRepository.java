package ge.softlab.tatia_shop.repository.jpa;

import ge.softlab.tatia_shop.model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase,Long> {

    List<Purchase> findByProductId(Long productId);
}
