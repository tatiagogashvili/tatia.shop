package ge.softlab.tatia_shop.controller;

import ge.softlab.tatia_shop.model.Product;
import ge.softlab.tatia_shop.model.Purchase;
import ge.softlab.tatia_shop.model.Sale;
import ge.softlab.tatia_shop.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product){
        return productService.save(product);
    }

    @GetMapping("/{id}/sales")
    public List<Sale> getProductSales(@PathVariable long id){
        return productService.getProductSales(id);
    }
    @GetMapping("/{id}/purchases")
    public List<Purchase> getProductPurchases(@PathVariable long id){
        return productService.getProductPurchases(id);
    }
}