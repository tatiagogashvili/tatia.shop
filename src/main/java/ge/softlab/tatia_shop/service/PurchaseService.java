package ge.softlab.tatia_shop.service;

import ge.softlab.tatia_shop.model.Purchase;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PurchaseService {
    List<Purchase> findByProductId(Long id);
}
