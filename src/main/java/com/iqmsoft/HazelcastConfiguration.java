package com.iqmsoft;

import com.hazelcast.config.Config;
//import com.hazelcast.config.EvictionPolicy;
import com.hazelcast.config.MapConfig;
//import com.hazelcast.config.MaxSizeConfig;
//import com.hazelcast.config.MaxSizePolicy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HazelcastConfiguration {

    @Bean
    public Config hazelCastConfig() {
        return new Config()
                .setInstanceName("hazelcast-instance")
                .addMapConfig(
                        new MapConfig()
                                .setName("instruments")
                               // .setMaxSizeConfig(new MaxSizeConfig(200, MaxSizeConfig.MaxSizePolicy.FREE_HEAP_SIZE))
                                //.setEvictionPolicy(EvictionPolicy.LRU)
                                .setTimeToLiveSeconds(20));
    }

}
