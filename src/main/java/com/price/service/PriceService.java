package com.price.service;

import com.price.dto.PriceDto;
import com.price.impl.PriceImpl;
import com.price.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class PriceService {


        @Autowired
        private PriceRepository priceRepository;

        public List<PriceDto> getPrice() {
            List<PriceImpl> productList = priceRepository.findAll();
            return productList.stream().map((p) -> new PriceDto(p.getId(),p.getSku(), p.getListPrice(), p.getSalePrice())).collect(Collectors.toList());
        }

        public void savePrice(PriceDto priceDto) {
            PriceImpl price = new PriceImpl();
            price.setId(priceDto.getId());
            price.setSku(priceDto.getSku());
            price.setListPrice(priceDto.getListPrice());
            price.setSalePrice(priceDto.getSalePrice());
            priceRepository.save(price);
        }

    public PriceDto getProductPrice(String sku) {
        PriceImpl productPrice = priceRepository.findProductPrice(sku);
        PriceDto priceDto = new PriceDto();
        priceDto.setId(productPrice.getId());
        priceDto.setSku(productPrice.getSku());
        priceDto.setListPrice(productPrice.getListPrice());
        priceDto.setSalePrice(productPrice.getSalePrice());
        return priceDto;
    }


}
