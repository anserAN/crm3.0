package com.aaa.service;

import com.aaa.entity.Product;

import java.util.List;
import java.util.Map;

/**
 * ClassName: IProductService
 * Description:
 * date: 2018/12/17 14:31
 *
 * @author 王晓楠
 * @version 1.0
 * @since JDK 1.8
 */
public interface IProductService {

    Map findAll(Map<String, Object> query);

    /*Map findSomeProduct(Map<String, Object> query);*/

    int addProduct(Product product);

    List<Product> findMake();

    List<Product> findInteriorColor();

    List<Product> findBodyColor();

    List<Product> findTransmission();

    List<Product> findEngine();

    List<Product> findBody();

    List<Product> findType(Product product);

    List<Product> findLine(Product product);

    List<Product> findPsatus();

    int updateProduct(Map map);

    int delProduct(int[] delLists);

    Product findCheckBody(Product product);

    List<Product> findPstatusTwo(Product product);

    List<Map<String,Object>> productCount(Map map);
}
