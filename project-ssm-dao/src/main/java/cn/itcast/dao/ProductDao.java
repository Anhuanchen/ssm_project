package cn.itcast.dao;

import cn.itcast.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductDao {

    @Select("select * from product")
    public List<Product> findAllProduct();
}
