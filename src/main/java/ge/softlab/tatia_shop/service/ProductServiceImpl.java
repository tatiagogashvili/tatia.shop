package ge.softlab.tatia_shop.service;


import ge.softlab.tatia_shop.model.Product;
import ge.softlab.tatia_shop.model.Purchase;
import ge.softlab.tatia_shop.model.Sale;
import ge.softlab.tatia_shop.repository.jpa.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;
    private final SaleService saleService;
    private final PurchaseService purchaseService;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Sale> getProductSales(long id) {
        checkProductId(id);
        return saleService.findByProductId(id);
    }


    @Override
    public List<Purchase> getProductPurchases(long id) {
        checkProductId(id);
        return purchaseService.findByProductId(id);
    }

    private void checkProductId(long id) {
        if(productRepository.findById(id).isEmpty()){
            throw new RuntimeException(String.format("product with this id doesn't exist"));
        }
    }


}
