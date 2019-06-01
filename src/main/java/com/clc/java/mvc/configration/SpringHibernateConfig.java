package com.clc.java.mvc.configration;

import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.clc.java.mvc.entity.StudentEntity;

   @EnableWebMvc
	@Configuration
	@ComponentScan(basePackages = {"com.clc.java.mvc.*"})
//	@PropertySource(value="${classpath:database.properties}") // spring-hibernate
	@PropertySource("classpath:database.properties")//spring mvc

public class SpringHibernateConfig {

	static {
		System.out.println("Spring configuration loaded");
	}

		@Value("${spring.hibernate.hsqldb.username}")
		String SQL_USERNAME;
		
		@Value("${spring.hibernate.hsqldb.password}")
		String SQL_PASSWORD;
		
		@Value("${spring.hibernate.hsqldb.driver}")
		String SQL_DRIVER;
		
		@Value("${spring.hibernate.hsqldb.url}")
		String SQL_URL;
		
		@Value("${spring.hibernate.hsqldb.dialect}")
		String SQL_DIALECT;
		
		@Value("${spring.hiernate.create.tables}")
		String SQL_CREATE_TABLE;
		
		@Value("${spring.hiernate.show.sql}")
		String SQL_SHOW;
		
		@Value("${spring.hiernate.format.sql}")
		String SQL_FORMAT;
		
		@Value("${spring.hiernate.scan.pckg}")
		String SQL_SCAN_PACKAGE;
		
		
		static {
			System.out.println("Spring configuration loaded");
		}
		
		
		@Bean
		public BasicDataSource createDbConfiguration() {
			BasicDataSource basicDb = new BasicDataSource();
			basicDb.setUrl(SQL_URL);
			basicDb.setUsername(SQL_USERNAME);
			basicDb.setPassword(SQL_PASSWORD);
			basicDb.setDriverClassName(SQL_DRIVER);
			return basicDb;
		}

		@Bean("sessionFactory")
		public LocalSessionFactoryBean createSessionfactory() {
			System.out.println("Localsessionfactory instance created...!");
			LocalSessionFactoryBean localBean = new LocalSessionFactoryBean();
			localBean.setDataSource(createDbConfiguration());
			//localBean.setPackagesToScan(SQL_SCAN_PACKAGE);
			//localBean.setAnnotatedClasses(StudentEntity.class);
			localBean.setAnnotatedPackages("com.clc.java.mvc.entity");
			localBean.setHibernateProperties(getHibernateProperties());
			return localBean;
		}
		
		public Properties getHibernateProperties() {
			Properties prop = new Properties();
			prop.put(Environment.DIALECT,SQL_DIALECT);
			prop.put(Environment.SHOW_SQL,true);
			//prop.put("hbm2ddl.auto",SQL_CREATE_TABLE);
			prop.put(Environment.HBM2DDL_AUTO,"update");
			prop.put("hibernate.temp.use_jdbc_metadata_defaults",false);
			return prop;
		}
		
		@Bean
		public InternalResourceViewResolver prepareViewResoulver() {
			InternalResourceViewResolver view = new InternalResourceViewResolver();
			view.setViewClass(JstlView.class);
			view.setPrefix("/WEB-INF/");
			view.setSuffix(".jsp");
			return view;
		}
		
	
	}	
	

