package com.kh.mybatis.common.template;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Template {
	//마이바티스

	public static SqlSession getSqlSession() {
		//mybatis-config.xml => 읽어들이기
		//해당 db와 접속된 SqlSession 객체 생성해서 반환하기
		
		SqlSession sqlsession = null;
		
		//SqlSession 생성에는 SqlSessionFactory 객체 필요
		//SqlSessionFactory 생성에는 SqlSessionFactoryBuilder 필요
		
		String resource = "/mybatis-config.xml";
				
		try {
			InputStream InputStream = Resources.getResourceAsStream(resource);
//			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(InputStream);
//			sqlsession = sqlSessionFactory.openSession(false); // boolean autoCommit => 자동 커밋 여부(true가 자동, false가 수동)

			sqlsession = new SqlSessionFactoryBuilder().build(InputStream).openSession(false); // 위의 축약판
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return sqlsession;
	}
}
