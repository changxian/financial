package cx.rcd.financial.mapper;

import cx.rcd.financial.model.Record;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RecordMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Record record);

    int insertSelective(Record record);

    Record selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Record record);

    int updateByPrimaryKey(Record record);
}