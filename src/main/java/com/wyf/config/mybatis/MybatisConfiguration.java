package com.wyf.config.mybatis;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.shardingsphere.shardingjdbc.spring.boot.SpringBootConfiguration;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author chensheng
 * @version V1.0
 * @Description 网销数据源配置类
 * @date 2018/09/04
 * @since V1.0
 */
//@Order(1)
@Configuration
@MapperScan(basePackages = {"com.wyf"}, sqlSessionTemplateRef = "sqlSessionTemplate")
public class MybatisConfiguration {

    /**
     * 数据源配置
     */
    private static final String PREFIX = "spring.datasource";

    /**
     * mapper.xml路径配置
     */
    private static final String MAPPER_XML = "classpath*:/com/wyf/entity/*Mapper.xml";

    @Autowired
    private DataSource dataSource;

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory nmiSqlSessionFactory() throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

        List<Resource> resources = new ArrayList<Resource>();
        resources.addAll(Arrays.asList(resolver.getResources(MAPPER_XML)));


        try {
            bean.setMapperLocations(resources.toArray(new Resource[0]));
            bean.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
            return bean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Bean(name = "sqlSessionTemplate")
    public SqlSessionTemplate nmiSqlSessionTemplate(@Qualifier("sqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
