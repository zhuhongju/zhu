package com.itheima.dao;

import com.itheima.domain.Items;
import org.apache.ibatis.annotations.Select;

public interface ItemsDao {
    @Select("select * from items where id = #{id}")
    public Items findById(Integer id);
}
