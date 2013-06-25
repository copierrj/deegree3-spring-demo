package org.deegree.spring.demo;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.deegree.sqldialect.SQLDialect;
import org.deegree.sqldialect.postgis.PostGISDialect;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public DataSource dataSource() {
        final BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName( "org.postgresql.Driver" );
        basicDataSource.setUrl( "jdbc:postgresql://localhost:5432/cds_inspire" );
        basicDataSource.setUsername( "postgres" );
        basicDataSource.setPassword( "postgres" );

        return basicDataSource;
    }

    @Bean
    public SQLDialect sqlDialect() {
        return new PostGISDialect( false );
    }
}
