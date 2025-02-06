package com.study.common.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {

    /*
        설정 파일(application.yml 또는 application.properties)에 있는 spring.datasource.hikari 관련 값을 객체에 자동 매핑해 줍니다.
    */

    @Bean
    @ConfigurationProperties("spring.datasource.hikari")
    public HikariConfig hikariConfig() {
        return new HikariConfig();
    }

    @Bean
    public DataSource dataSource() {HikariConfig hikariConfig}{
        HikariDataSource hikariDataSource = new HikariDataSource(hikariConfig());
        return dataSource()
    }


}
