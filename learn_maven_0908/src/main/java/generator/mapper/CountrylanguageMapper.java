package generator.mapper;

import generator.domain.Countrylanguage;

/**
* @author gambit
* @description 针对表【countrylanguage】的数据库操作Mapper
* @createDate 2024-09-15 17:22:56
* @Entity generator.domain.Countrylanguage
*/
public interface CountrylanguageMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Countrylanguage record);

    int insertSelective(Countrylanguage record);

    Countrylanguage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Countrylanguage record);

    int updateByPrimaryKey(Countrylanguage record);

}
