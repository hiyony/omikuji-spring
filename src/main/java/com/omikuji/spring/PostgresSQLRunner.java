//package com.omikuji.spring;
//
//import java.sql.Connection;
//import java.sql.Statement;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Component;
//
//@Component
//public class PostgresSQLRunner implements ApplicationRunner{
//	
//	@Autowired
//	DataSource dataSource;
//	
//	@Autowired
//	JdbcTemplate jdbcTemplate;
//	
//	@Override
//	public void run(ApplicationArguments args) throws Exception {
//		try(Connection conn = dataSource.getConnection()){
//			System.out.println(dataSource.getClass());
//			System.out.println(conn.getMetaData().getURL());
//			System.out.println(conn.getMetaData().getUserName());
//			
//			Statement statement = conn.createStatement();
//			String sql = "CREATE TABLE practice(pr1 INTEGER NOT NULL, pr2 VARCHAR(255))";
//			statement.executeUpdate(sql);
//		}
//		jdbcTemplate.execute("INSERT INTO practice VALUES(1, 'NANA')");
//	}
//	
//	
//}
