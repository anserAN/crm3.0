package com.aaa.controller;

import com.aaa.entity.Product;
import com.aaa.entity.ResultModel;
import com.aaa.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName: ProductController
 * Description:
 * date: 2018/12/17 14:30
 *
 * @author 王晓楠
 * @version 1.0
 * @since JDK 1.8
 */
@Controller
@RequestMapping("/pro")
public class ProductController extends BaseController {

    @Autowired
    private IProductService productServiceImpl;
    @Value("${fileupload.path}")
    private String filePath;
    /**
     *跳转到产品页面
     */
    @RequestMapping("/jump")
    public String product() {
        return "product";
    }

    /**
     * 跳转到产品信息统计
     * @return
     */
    @RequestMapping("/infoStatistics")
    public String productRe() {
        return "productResource";
    }
    /**
     * 查询所有产品信息
     * @param query 分页查询条件
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public Map listProduct(@RequestBody Map<String,Object> query){
        System.out.println(query);
        Map map=productServiceImpl.findAll(query);
        return map;
    }
/*    @RequestMapping("/someList")
    @ResponseBody
    public Map someListProduct(@RequestBody Map<String,Object> query){
        System.out.println(query);
        Map map=productServiceImpl.findSomeProduct(query);
        return map;
    }*/

    /**
     * 添加产品
     * @param product 对应实体类信息
     * @return
     */
    @RequestMapping("/addProduct")
    @ResponseBody
    public ResultModel addProduct(@RequestBody Product product) {
        int ret=productServiceImpl.addProduct(product);
        if (ret>0){
            return returnSuccess("添加成功");
        }else {
            return returnError("添加失败");
        }
    }

    /**
     * 修改产品
     * @param map 产品信息
     * @return
     */
    @RequestMapping("/updateProduct")
    @ResponseBody
    public ResultModel updateProduct(@RequestBody Map map) {
        int ret=productServiceImpl.updateProduct(map);
        if (ret>0){
            return returnSuccess("修改成功");
        }else {
            return returnError("修改失败");
        }
    }

    /**
     * 删除产品
     * @param delLists
     * @return
     */
    @RequestMapping("/delProduct")
    @ResponseBody
    public ResultModel delProduct(int[] delLists) {
        int ret=productServiceImpl.delProduct(delLists);
        if (ret>0){
            return returnSuccess("删除成功");
        }else {
            return returnError("删除失败");
        }
    }
    /**
     * 文件上传
     * @param file
     * @return
     */
    @RequestMapping("/upload")
    @ResponseBody
    public Map upload(@RequestParam MultipartFile file){

        return upload(file,filePath);
    }

    /**
     * 查询品牌
     * @return
     */
    @RequestMapping("/findMake")
    @ResponseBody
    public List<Product> findMake(){
        List<Product> list=productServiceImpl.findMake();
        return list;
    }
    /**
     *查询车系
     * @return
     */
    @RequestMapping("/findLine")
    @ResponseBody
    public List<Product> findLine(@RequestBody Product product){
        List<Product> list=productServiceImpl.findLine(product);
        return list;
    }
    /**
     *查询款型
     * @return
     */
    @RequestMapping("/findType")
    @ResponseBody
    public List<Product> findType(@RequestBody Product product){
        List<Product> list=productServiceImpl.findType(product);
        return list;
    }
    /**
     *查询车身
     * @return
     */
    @RequestMapping("/findBody")
    @ResponseBody
    public List<Product> findBody(){
        List<Product> list=productServiceImpl.findBody();
        return list;
    }

    /**
     * 查询产品是否存在
     * @return
     */
    @RequestMapping("/findCheckBody")
    @ResponseBody
    public Product findCheckBody(@RequestBody Product product){
        Product pro =productServiceImpl.findCheckBody(product);
        return pro;
    }
    /**
     *查询发动机
     * @return
     */
    @RequestMapping("/findEngine")
    @ResponseBody
    public List<Product> findEngine(){
        List<Product> list=productServiceImpl.findEngine();
        return list;
    }
    /**
     *查询变速箱
     * @return
     */
    @RequestMapping("/findTransmission")
    @ResponseBody
    public List<Product> findTransmission(){
        List<Product> list=productServiceImpl.findTransmission();
        return list;
    }
    /**
     *查询外观颜色
     * @return
     */
    @RequestMapping("/findBodyColor")
    @ResponseBody
    public List<Product> findBodyColor(){
        List<Product> list=productServiceImpl.findBodyColor();
        return list;
    }
    /**
     *查询内饰颜色
     * @return
     */
    @RequestMapping("/findInteriorColor")
    @ResponseBody
    public List<Product> findInteriorColor(){
        List<Product> list=productServiceImpl.findInteriorColor();
        return list;
    }
    /**
     *查询产品状态
     * @return
     */
    @RequestMapping("/findPstatus")
    @ResponseBody
    public List<Product> findPstatus(){
        List<Product> list=productServiceImpl.findPsatus();
        return list;
    }
    /**
     *查询产品状态(条件查询)
     * @return
     */
    @RequestMapping("/findPstatusTwo")
    @ResponseBody
    public List<Product> findPstatusTwo(@RequestBody Product product){
        List<Product> list=productServiceImpl.findPstatusTwo(product);
        return list;
    }
    /**
     *查询产品
     * @return
     */
    @RequestMapping("/productCount")
    @ResponseBody
    public List<Map<String,Object>> productCount(String queryStyle, Date beginTime, Date endTime){
        Map<String, Object> map = timeManage(queryStyle, beginTime, endTime);
        return productServiceImpl.productCount(map);
    }
    /**
     * 查询参数的时间处理
     * @param queryStyle
     * @param beginTime
     * @param endTime
     * @return
     */
    private Map<String,Object> timeManage(String queryStyle, Date beginTime, Date endTime){
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Map<String,Object> map=new HashMap();
        String startTime=null;
        String overTime=null;
        if(beginTime!=null){
            startTime = format.format(beginTime);
            map.put("queryStyle",queryStyle);
            map.put("beginTime",startTime);
        }
        if(endTime!=null){
            overTime = format.format(endTime);
            map.put("endTime",overTime);
        }
        return map;
    }
}
