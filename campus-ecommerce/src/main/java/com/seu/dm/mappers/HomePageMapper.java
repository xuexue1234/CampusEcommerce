package com.seu.dm.mappers;

import com.seu.dm.annotations.permissions.SellerPermission;
import com.seu.dm.entities.HomePage;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface HomePageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HomePage record);

    int insertSelective(HomePage record);

    HomePage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HomePage record);

    int updateByPrimaryKey(HomePage record);

    @Select("select * from home_page where campus_id = #{campusId} AND position_id = #{positionId}")
    List<HomePage> getByCampusIdAndPositionId(Integer campusId,Integer positionId);

    @Select("select * from home_page where campus_id = #{campusId}")
    List<HomePage> getByCampusId(Integer campusId);
}