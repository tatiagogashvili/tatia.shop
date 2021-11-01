package ge.softlab.tatia_shop.service;

import ge.softlab.tatia_shop.model.Purchase;
import ge.softlab.tatia_shop.repository.jpa.PurchaseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class PurchaseServiceImpl implements PurchaseService{
    public final PurchaseRepository purchaseRepository;

    @Override
    public List<Purchase> findByProductId(Long productId) {
        return purchaseRepository.findByProductId(productId);
    }
}
