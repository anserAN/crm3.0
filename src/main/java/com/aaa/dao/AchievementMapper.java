package com.aaa.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface AchievementMapper {
    List<Map<String,Object>> listAchievement(Map<String, Object> query);

    Integer countAchievement(Map<String, Object> query);
}
