package com.syr.dao;

import com.syr.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author syr
 * @date 2022/2/18 - 15:47
 */
public interface TeacherMapper {
    @Select("select * from teacher where id = #{tid}")
    Teacher getTeacher(@Param("tid") int id);
}
