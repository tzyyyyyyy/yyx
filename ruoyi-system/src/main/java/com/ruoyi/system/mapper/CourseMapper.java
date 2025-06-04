package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Course;

/**
 * 课程信息Mapper接口
 * 
 * @author wsw
 * @date 2025-05-21
 */
public interface CourseMapper 
{
    /**
     * 查询课程信息
     * 
     * @param courseId 课程信息主键
     * @return 课程信息
     */
    public Course selectCourseByCourseId(String courseId);

    /**
     * 查询课程信息列表
     * 
     * @param course 课程信息
     * @return 课程信息集合
     */
    public List<Course> selectCourseList(Course course);

    /**
     * 新增课程信息
     * 
     * @param course 课程信息
     * @return 结果
     */
    public int insertCourse(Course course);

    /**
     * 修改课程信息
     * 
     * @param course 课程信息
     * @return 结果
     */
    public int updateCourse(Course course);

    /**
     * 删除课程信息
     * 
     * @param courseId 课程信息主键
     * @return 结果
     */
    public int deleteCourseByCourseId(String courseId);

    /**
     * 批量删除课程信息
     * 
     * @param courseIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCourseByCourseIds(String[] courseIds);
}
