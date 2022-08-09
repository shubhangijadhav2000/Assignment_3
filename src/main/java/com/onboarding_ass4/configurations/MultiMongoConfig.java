package com.onboarding_ass4.configurations;

import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;

@Configuration
public class MultiMongoConfig {
//    @Primary
//    @Bean(name = "Customer Properties")
//    @ConfigurationProperties(prefix = "spring.data.mongodb.Assignment3.customer")
//    public MongoProperties getCustomerProps() throws Exception {
//        return new MongoProperties();
//    }
//
//    @Bean(name = "Vehicle Properties")
//    @ConfigurationProperties(prefix = "spring.data.mongodb.Assignment3.vehicle")
//    public MongoProperties getVehicleProps() throws Exception {
//        return new MongoProperties();
//    }
//
//    @Primary
//    @Bean(name = "CustomerMongoTemplate")
//    public MongoTemplate CustomerMongoTemplate() throws Exception {
//        return new MongoTemplate(CustomerMongoDatabaseFactory(getCustomerProps()));
//    }
//
//    @Bean(name ="VehicleMongoTemplate")
//    public MongoTemplate VehicleMongoTemplate() throws Exception {
//        return new MongoTemplate(VehicleMongoDatabaseFactory(getVehicleProps()));
//    }
//
//    @Primary
//    @Bean
//    public MongoDatabaseFactory CustomerMongoDatabaseFactory(MongoProperties mongo) throws Exception {
//        return new SimpleMongoClientDatabaseFactory(
//                mongo.getUri()
//        );
//    }
//
//    @Bean
//    public MongoDatabaseFactory VehicleMongoDatabaseFactory(MongoProperties mongo) throws Exception {
//        return new SimpleMongoClientDatabaseFactory(
//                mongo.getUri()
//        );
//    }
}
