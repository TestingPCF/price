package com.price.endpoint;

import com.price.dto.PriceDto;
import com.price.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/price")
public class PriceController {

    @Autowired
    private PriceService priceService;

    @RequestMapping(value = "/getPrice", method = RequestMethod.GET)
    public List<PriceDto> getPrice() {
        try {
            return priceService.getPrice();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @PostMapping(path = "/savePrice")
    public void savePrice(@RequestBody PriceDto priceDto) {
        try {
            priceService.savePrice(priceDto);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(path = "/getPrice/{sku}", method = RequestMethod.GET)
    public PriceDto getProductPrice(@PathVariable String sku) {
        try {
            return priceService.getProductPrice(sku);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}