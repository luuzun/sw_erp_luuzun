package kr.or.dgit.sw_erp_luuzun.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisSqlSessionFactory {
	private static SqlSessionFactory sqlSessionFactory;
	
	public static SqlSessionFactory getSqlSessionFactory() {
		if (sqlSessionFactory==null){
			InputStream inputStream;
			try {
				inputStream = Resources.getResourceAsStream("mybatis_config.xml");
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			} catch (IOException e) {
				System.out.println("error");
				e.printStackTrace();
			}
		}
		return sqlSessionFactory;
	}
}
