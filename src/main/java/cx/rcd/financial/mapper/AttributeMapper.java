package cx.rcd.financial.mapper;

import cx.rcd.financial.model.Attribute;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AttributeMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Attribute record);

    int insertSelective(Attribute record);

    Attribute selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Attribute record);

    int updateByPrimaryKey(Attribute record);
}