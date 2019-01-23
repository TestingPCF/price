package com.price.repository;

import com.price.impl.PriceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PriceRepository extends JpaRepository<PriceImpl,Long> {

    @Query(value= "select * from price p where p.sku =:sku",nativeQuery = true)
    public PriceImpl findProductPrice(@Param("sku") String sku);
}
