package com.github.wz2cool.dynamic.mybatis.mapper;

import com.github.wz2cool.dynamic.DynamicQuery;
import com.github.wz2cool.dynamic.mybatis.mapper.constant.MapperConstants;
import com.github.wz2cool.dynamic.mybatis.mapper.provider.DynamicQueryProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface SelectByDynamicQueryRowBoundsMapper<T> {

    @SelectProvider(type = DynamicQueryProvider.class, method = "dynamicSQL")
    List<T> selectByDynamicQueryRowBounds(@Param(MapperConstants.DYNAMIC_QUERY) DynamicQuery<T> dynamicQuery);
}