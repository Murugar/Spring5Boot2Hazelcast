package com.iqmsoft;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames = "instruments")
public class ProductService {

    private static Logger log = LoggerFactory.getLogger(ProductService.class);

    @CacheEvict(allEntries = true)
    public void clearCache() {
    }

    @Cacheable(condition = "#instrument.equals('product1')")
    public String sell(String instrument) {
        log.info("Executing: " + this.getClass().getSimpleName() + ".sell(\"" + instrument + "\");");
        return "selling " + instrument + "!";
    }

}
