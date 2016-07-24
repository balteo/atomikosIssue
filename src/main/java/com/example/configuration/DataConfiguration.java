package com.example.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;


@Configuration
public class DataConfiguration {

    @Bean(name = "applicationDatasource")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.application")
    public DataSource applicationDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "batchDatasource")
    @ConfigurationProperties(prefix = "spring.datasource.batch")
    public DataSource batchDataSource() {
        return DataSourceBuilder.create().build();
    }
}
