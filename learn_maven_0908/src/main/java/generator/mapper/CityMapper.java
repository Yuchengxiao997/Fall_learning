package generator.mapper;

import generator.domain.City;

/**
* @author gambit
* @description 针对表【city】的数据库操作Mapper
* @createDate 2024-09-15 17:22:56
* @Entity generator.domain.City
*/
public interface CityMapper {

    int deleteByPrimaryKey(Long id);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);

}
