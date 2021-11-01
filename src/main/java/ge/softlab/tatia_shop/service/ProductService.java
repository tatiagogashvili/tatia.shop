package ge.softlab.tatia_shop.service;

import ge.softlab.tatia_shop.model.Product;
import ge.softlab.tatia_shop.model.Purchase;
import ge.softlab.tatia_shop.model.Sale;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    List<Product> getAllProducts();

    Product save(Product product);

    List<Sale> getProductSales(long id);


    List<Purchase> getProductPurchases(long id);
}
