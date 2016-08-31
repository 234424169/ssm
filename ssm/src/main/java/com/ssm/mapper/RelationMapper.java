package com.ssm.mapper;

import com.ssm.pojo.Relation;
import com.ssm.pojo.RelationExample;
import com.ssm.pojo.RelationKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RelationMapper {
    int countByExample(RelationExample example);

    int deleteByExample(RelationExample example);

    int deleteByPrimaryKey(RelationKey key);

    int insert(Relation record);

    int insertSelective(Relation record);

    List<Relation> selectByExample(RelationExample example);

    Relation selectByPrimaryKey(RelationKey key);

    int updateByExampleSelective(@Param("record") Relation record, @Param("example") RelationExample example);

    int updateByExample(@Param("record") Relation record, @Param("example") RelationExample example);

    int updateByPrimaryKeySelective(Relation record);

    int updateByPrimaryKey(Relation record);
}