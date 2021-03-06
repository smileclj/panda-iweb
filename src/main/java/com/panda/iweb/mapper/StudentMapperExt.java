package com.panda.iweb.mapper;

import com.panda.iweb.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface StudentMapperExt extends StudentMapper {
    Student findStudentByIdWithXLock(@Param("id") int id);

    Student findStudentById(@Param("id") int id);

    int batchInsert(@Param("students") List<Student> students);

    int batchUpdate(@Param("students") List<Student> students);

    List<Map<String, Object>> executeQuery(@Param("sql") String sql);

    int executeUpdate(@Param("sql") String sql);

    List<Student> selectMulti(@Param("id") int id, @Param("sex") int sex);
}