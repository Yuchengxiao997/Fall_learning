package generator.mapper;

import generator.domain.Country;

/**
* @author gambit
* @description 针对表【country】的数据库操作Mapper
* @createDate 2024-09-15 17:22:56
* @Entity generator.domain.Country
*/
public interface CountryMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Country record);

    int insertSelective(Country record);

    Country selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Country record);

    int updateByPrimaryKey(Country record);

}
