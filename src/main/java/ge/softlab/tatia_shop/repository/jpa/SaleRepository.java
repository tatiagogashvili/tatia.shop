package ge.softlab.tatia_shop.repository.jpa;

import ge.softlab.tatia_shop.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface SaleRepository extends JpaRepository<Sale,Long> {
    List<Sale> findByProductId(Long productId);

    List<Sale> findBySellDate(Date date);
}
