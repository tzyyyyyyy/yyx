package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 课程视频对象 course_video
 * 
 * @author wsw
 * @date 2025-05-21
 */
public class CourseVideo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 视频ID，UUID */
    private String videoId;

    /** 课程名称 */
    @Excel(name = "课程名称")
    private String courseName;

    /** 视频标题 */
    @Excel(name = "视频标题")
    private String videoTitle;

    /** 视频存储路径 */
    @Excel(name = "视频存储路径")
    private String videoUrl;

    /** 上传时间 */
    @Excel(name = "上传时间")
    private String uploadTime;

    /** 视频描述 */
    @Excel(name = "视频描述")
    private String description;

    public void setVideoId(String videoId) 
    {
        this.videoId = videoId;
    }

    public String getVideoId() 
    {
        return videoId;
    }

    public void setCourseName(String courseName) 
    {
        this.courseName = courseName;
    }

    public String getCourseName() 
    {
        return courseName;
    }

    public void setVideoTitle(String videoTitle) 
    {
        this.videoTitle = videoTitle;
    }

    public String getVideoTitle() 
    {
        return videoTitle;
    }

    public void setVideoUrl(String videoUrl) 
    {
        this.videoUrl = videoUrl;
    }

    public String getVideoUrl() 
    {
        return videoUrl;
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
            .append("videoId", getVideoId())
            .append("courseName", getCourseName())
            .append("videoTitle", getVideoTitle())
            .append("videoUrl", getVideoUrl())
            .append("uploadTime", getUploadTime())
            .append("description", getDescription())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
