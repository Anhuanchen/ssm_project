package cn.itcast.controller;


import cn.itcast.Product;
import cn.itcast.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class controller {

    @Autowired
    private ProductService productService;

    @RequestMapping("findAll.do")
    public ModelAndView findAll(ModelAndView modelAndView){

        List<Product> allProduct = productService.findAllProduct();

        modelAndView.setViewName("product");

        modelAndView.addObject("",allProduct);

        return modelAndView;
    }
}
