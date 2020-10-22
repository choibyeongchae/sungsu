package com.test.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.TestDao;

@Service
public class TestServiceImpl implements TestService{
	
	@Autowired
	TestDao dao;

	@Override
	public List<HashMap> testList() throws Exception {
		// TODO Auto-generated method stub
		return dao.testList();
	}
	
	
}
