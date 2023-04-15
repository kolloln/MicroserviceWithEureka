package StockServiceEureka2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {
    @Autowired
    StockService stockService;

    @GetMapping("/stock/{productNumber}")
    public ResponseEntity<?> getStock(@PathVariable("productNumber") String productNumber){
        int stock = stockService.getStockByProductNumber(productNumber);
        return new ResponseEntity<Integer>(stock, HttpStatus.OK);
    }
}
