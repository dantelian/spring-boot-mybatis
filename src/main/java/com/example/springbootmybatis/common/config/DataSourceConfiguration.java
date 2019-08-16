package com.example.springbootmybatis.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.example.springbootmybatis.mapper")
public class DataSourceConfiguration {
}
