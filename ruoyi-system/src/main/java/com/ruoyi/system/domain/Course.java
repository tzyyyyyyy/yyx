package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 课程信息对象 course
 * 
 * @author wsw
 * @date 2025-05-21
 */
public class Course extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 课程ID（主键） */
    private String courseId;

    /** 课程名称 */
    @Excel(name = "课程名称")
    private String courseName;

    /** 课程编号 */
    @Excel(name = "课程编号")
    private String courseCode;

    /** 教师名称 */
    @Excel(name = "教师名称")
    private String teacherName;

    /** 课程学分 */
    @Excel(name = "课程学分")
    private String courseCredit;

    /** 上课地点 */
    @Excel(name = "上课地点")
    private String courseLocation;

    /** 课程简介 */
    @Excel(name = "课程简介")
    private String description;

    public void setCourseId(String courseId) 
    {
        this.courseId = courseId;
    }

    public String getCourseId() 
    {
        return courseId;
    }

    public void setCourseName(String courseName) 
    {
        this.courseName = courseName;
    }

    public String getCourseName() 
    {
        return courseName;
    }

    public void setCourseCode(String courseCode) 
    {
        this.courseCode = courseCode;
    }

    public String getCourseCode() 
    {
        return courseCode;
    }

    public void setTeacherName(String teacherName) 
    {
        this.teacherName = teacherName;
    }

    public String getTeacherName() 
    {
        return teacherName;
    }

    public void setCourseCredit(String courseCredit) 
    {
        this.courseCredit = courseCredit;
    }

    public String getCourseCredit() 
    {
        return courseCredit;
    }

    public void setCourseLocation(String courseLocation) 
    {
        this.courseLocation = courseLocation;
    }

    public String getCourseLocation() 
    {
        return courseLocation;
    }

    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("courseId", getCourseId())
            .append("courseName", getCourseName())
            .append("courseCode", getCourseCode())
            .append("teacherName", getTeacherName())
            .append("courseCredit", getCourseCredit())
            .append("courseLocation", getCourseLocation())
            .append("description", getDescription())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
