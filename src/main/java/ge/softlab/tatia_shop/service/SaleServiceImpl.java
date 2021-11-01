package ge.softlab.tatia_shop.service;

import ge.softlab.tatia_shop.model.Sale;
import ge.softlab.tatia_shop.repository.jpa.SaleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class SaleServiceImpl implements SaleService{
    public final SaleRepository saleRepository;

    @Override
    public List<Sale> findByProductId(Long productId) {
        return saleRepository.findByProductId(productId);
    }

    @Override
    public List<Sale> getSales(Date date) {
        return saleRepository.findBySellDate(date);
    }
}
