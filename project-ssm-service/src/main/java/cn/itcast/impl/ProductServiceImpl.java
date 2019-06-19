package cn.itcast.impl;

import cn.itcast.Product;
import cn.itcast.ProductService;
import cn.itcast.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> findAllProduct() {
        List<Product> products = productDao.findAllProduct();
        return products;
    }
}
