package ge.softlab.tatia_shop.service;

import ge.softlab.tatia_shop.model.Sale;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface SaleService {
    List<Sale> findByProductId(Long id);

    List<Sale> getSales(Date date);
}
