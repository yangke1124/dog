package com.example.demo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.bean.Goods;
import com.example.demo.mapper.GoodsMapperDao;

@Service
public class GoodsServiceDaoImpl implements GoodsServiceDao {
	@Resource
	private GoodsMapperDao mapperDao;
	// 列表
	@Override
	public List<Goods> getGoodsList() {
		// TODO Auto-generated method stub
		return mapperDao.getGoodsList();
	}
}
