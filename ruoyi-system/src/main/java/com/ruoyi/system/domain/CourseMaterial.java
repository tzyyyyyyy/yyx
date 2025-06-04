package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 课程资料对象 course_material
 * 
 * @author wsw
 * @date 2025-05-21
 */
public class CourseMaterial extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 资料ID，UUID */
    private String materialId;

    /** 课程名称 */
    @Excel(name = "课程名称")
    private String courseName;

    /** 教师名称 */
    @Excel(name = "教师名称")
    private String teacherName;

    /** 资料标题 */
    @Excel(name = "资料标题")
    private String materialTitle;

    /** 资料存储路径 */
    @Excel(name = "资料存储路径")
    private String materialUrl;

    /** 上传时间 */
    @Excel(name = "上传时间")
    private String uploadTime;

    /** 资料描述 */
    @Excel(name = "资料描述")
    private String description;

    public void setMaterialId(String materialId) 
    {
        this.materialId = materialId;
    }

    public String getMaterialId() 
    {
        return materialId;
    }

    public void setCourseName(String courseName) 
    {
        this.courseName = courseName;
    }

    public String getCourseName() 
    {
        return courseName;
    }

    public void setTeacherName(String teacherName) 
    {
        this.teacherName = teacherName;
    }

    public String getTeacherName() 
    {
        return teacherName;
    }

    public void setMaterialTitle(String materialTitle) 
    {
        this.materialTitle = materialTitle;
    }

    public String getMaterialTitle() 
    {
        return materialTitle;
    }

    public void setMaterialUrl(String materialUrl) 
    {
        this.materialUrl = materialUrl;
    }

    public String getMaterialUrl() 
    {
        return materialUrl;
    }

    public void setUploadTime(String uploadTime) 
    {
        this.uploadTime = uploadTime;
    }

    public String getUploadTime() 
    {
        return uploadTime;
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
            .append("materialId", getMaterialId())
            .append("courseName", getCourseName())
            .append("teacherName", getTeacherName())
            .append("materialTitle", getMaterialTitle())
            .append("materialUrl", getMaterialUrl())
            .append("uploadTime", getUploadTime())
            .append("description", getDescription())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
