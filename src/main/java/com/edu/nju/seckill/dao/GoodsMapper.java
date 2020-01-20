package com.edu.nju.seckill.dao;

import com.edu.nju.seckill.domain.dto.CarouselItems;
import com.edu.nju.seckill.domain.Goods;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsMapper {
    int deleteByPrimaryKey(Long gid);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Long gid);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    List<CarouselItems> selectHotProductCarousel();
}