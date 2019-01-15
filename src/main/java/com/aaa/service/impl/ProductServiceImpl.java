package com.aaa.service.impl;

import com.aaa.dao.ProductMapper;
import com.aaa.entity.Product;
import com.aaa.service.IProductService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName: ProductServiceImpl
 * Description:
 * date: 2018/12/17 14:31
 *
 * @author 王晓楠
 * @version 1.0
 * @since JDK 1.8
 */
@Service
public class ProductServiceImpl implements IProductService{
    @Autowired
    private ProductMapper productMapper;
    @Override
    public Map findAll(Map<String, Object> query) {
        int pageNo=Integer.parseInt(query.get("pageNo")+"");
        int pageSize=Integer.parseInt(query.get("pageSize")+"");
        Map amp =(Map)query.get("form");
        PageHelper.startPage(pageNo,pageSize);
        Map map=new HashMap();
        map.put("rowList",productMapper.findAllByPage(amp));
        map.put("getTotal",productMapper.getTotal(amp));
        return map;
    }

    /*@Override
    public Map findSomeProduct(Map<String, Object> query) {
        int pageNo=Integer.parseInt(query.get("pageNo")+"");
        int pageSize=Integer.parseInt(query.get("pageSize")+"");
        Map amp = (Map)query.get("form");
        System.out.println(amp.get("make"));
        PageHelper.startPage(pageNo,pageSize);
        Map map=new HashMap();
        map.put("rowList",productMapper.findSomeByPage(amp));
        map.put("getTotal",productMapper.getTotal(amp));
        return map;
    }*/

    @Override
    public int addProduct(Product product) {
        return productMapper.addProduct(product);
    }

    @Override
    public List<Product> findMake() {
        return productMapper.findMake();
    }

    @Override
    public List<Product> findInteriorColor() {
        return productMapper.findInteriorColor();
    }

    @Override
    public List<Product> findBodyColor() {
        return productMapper.findBodyColor();
    }

    @Override
    public List<Product> findTransmission() {
        return productMapper.findTransmission();
    }

    @Override
    public List<Product> findEngine() {
        return productMapper.findEngine();
    }

    @Override
    public List<Product> findBody() {
        return productMapper.findBody();
    }

    @Override
    public List<Product> findType(Product product) {
        return productMapper.findType(product);
    }

    @Override
    public List<Product> findLine(Product product) {
        return productMapper.findLine(product);
    }

    @Override
    public List<Product> findPsatus() {
        return productMapper.findPstatus();
    }

    @Override
    public int updateProduct(Map map) {
        return productMapper.updateProduct(map);
    }
    @Transactional
    @Override
    public int delProduct(int[] delLists){

        int a=0;
        try {
            for(int i=0;i<delLists.length;i++){
                productMapper.delProduct(delLists[i]);
                a++;
            }
            productMapper.delProduct(1/0);
            productMapper.delProduct(1);
            return a;
        } catch (Exception e){
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return 0;
        }
    }

    @Override
    public Product findCheckBody(Product product) {
        return productMapper.findCheckBody(product);
    }

    @Override
    public List<Product> findPstatusTwo(Product product) {
        return productMapper.findPstatusTwo(product);
    }

    @Override
    public List<Map<String,Object>> productCount(Map map) {
        List<Map<String,Object>> list=productMapper.productCount(map);
//        Map<String,Object> returnMap = returnManager(list);
        return list;
    }
    /**
     * 查询返回数据管理
     */
    /*private Map<String,Object> returnManager(List<Map<String,Object>> list){
        Map<String,Object> returnMap=new HashMap();
        String[] make=new String[list.size()];
        String[] line=new String[list.size()];
        String[] type=new String[list.size()];
        String[] bodyColor=new String[list.size()];
        String[] pproCount=new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            make[i]=String.valueOf( list.get(i).get("make"));
            line[i]=String.valueOf( list.get(i).get("line"));
            type[i]=String.valueOf( list.get(i).get("type"));
            bodyColor[i]=String.valueOf( list.get(i).get("bodyColor"));
            pproCount[i]=String.valueOf( list.get(i).get("pproCount"));
        }
        returnMap.put("make",make);
        returnMap.put("line",line);
        returnMap.put("type",type);
        returnMap.put("bodyColor",bodyColor);
        returnMap.put("pproCount",pproCount);
        return  returnMap;
    }*/
}
