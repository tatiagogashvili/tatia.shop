package ge.softlab.tatia_shop.controller;

import ge.softlab.tatia_shop.model.Sale;
import ge.softlab.tatia_shop.service.SaleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("sales")
@RequiredArgsConstructor
public class SaleController {
    private final SaleService saleService;

    @GetMapping
    public List<Sale> getSales(@RequestParam Date date){
        return saleService.getSales(date);
    }

}
