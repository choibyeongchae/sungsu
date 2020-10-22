package com.test.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TestDaoImpl implements TestDao{
	 
	@Autowired
	SqlSession sqlSession;
	
	private static String namespace = "com.test.mapper.TestMapper";

	@Override
	public List<HashMap> testList() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace+".testSelect");
	}
}
