package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Course;

/**
 * 课程信息Service接口
 * 
 * @author wsw
 * @date 2025-05-21
 */
public interface ICourseService 
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
     * 批量删除课程信息
     * 
     * @param courseIds 需要删除的课程信息主键集合
     * @return 结果
     */
    public int deleteCourseByCourseIds(String courseIds);

    /**
     * 删除课程信息信息
     * 
     * @param courseId 课程信息主键
     * @return 结果
     */
    public int deleteCourseByCourseId(String courseId);
}
