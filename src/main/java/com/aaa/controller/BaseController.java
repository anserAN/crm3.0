package com.aaa.controller;

import com.aaa.entity.ResultModel;
import com.aaa.entity.ResultsModel;
import org.apache.shiro.SecurityUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @ClassName BaseController
 * @Description controller基类，返回前台，1代表成功，0代表失败
 * @Author LP
 * @Date 2018/12/8 8:59
 * @Version 1.0
 **/
public class BaseController {
    private MultipartFile file;
    private String filePath;

    public ResultsModel returnSuccessInfo(String meassage) {
        ResultsModel rm= new ResultsModel();
        rm.setRetStatus(0);
        rm.setMessage(meassage);
        return rm;

    }
    public ResultsModel returnSuccessInfo(String meassage ,Object obj) {
        ResultsModel rm= new ResultsModel();
        rm.setRetStatus(0);
        rm.setMessage(meassage);
        rm.setObj(obj);
        return rm;

    }
    public ResultsModel returnErrorInfo(String meassage) {
        ResultsModel rm= new ResultsModel();
        rm.setRetStatus(1);
        rm.setMessage(meassage);
        return rm;

    }
    /**
     *
     *TODO 返回操作失败通用方法
     *@param message
     *@param obj
     *@return
     *2018-6-14下午4:06:47
     */
    public ResultsModel returnErrorInfo(String message ,Object obj) {
        ResultsModel rm= new ResultsModel();
        rm.setRetStatus(1);
        rm.setMessage(message);
        rm.setObj(obj);
        return rm;

    }


    public ResultModel returnSuccess(String message){
        ResultModel rm=new ResultModel();
        rm.setResultStatus(1);
        rm.setMessage(message);
        return rm;
    }
    public ResultModel returnSuccess(String message,Object obj){
        ResultModel rm=new ResultModel();
        rm.setResultStatus(1);
        rm.setObject(obj);
        rm.setMessage(message);
        return rm;
    }
    public ResultModel returnError(String message){
        ResultModel rm=new ResultModel();
        rm.setResultStatus(0);
        rm.setMessage(message);
        return rm;
    }
    public ResultModel returnError(String message,Object obj){
        ResultModel rm=new ResultModel();
        rm.setResultStatus(0);
        rm.setObject(obj);
        rm.setMessage(message);
        return rm;
    }

    /**
     * 文件上传
     * @param file
     * @param filePath
     * @return
     */
    public Map upload(MultipartFile file, String filePath) {
        this.file = file;
        this.filePath = filePath;
        //上传至服务器的路径
        String fileName= file.getOriginalFilename();
        //修改文件名称
        //获取文件后缀名称,拼接uuid
        String[] split = fileName.split("\\.");
        UUID uuid = UUID.randomUUID();
        fileName=uuid+"."+split[split.length-1];
        File targetFile= new File(filePath,fileName);
        //String src=filePath+fileName;
        Map map = new HashMap();
        map.put("name", fileName);
        map.put("url", "/crm/"+fileName);
        try {
            //将页面传入的文件拷贝至服务器对应目录
            file.transferTo(targetFile);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }
    /**
     * 获取当前登录用户名
     * @return {ShiroUser}
     */
    public String getShiroUserName() {
        return  SecurityUtils.getSubject().getPrincipal().toString();
    }

}
