package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.CourseVideo;

/**
 * 课程视频Service接口
 * 
 * @author wsw
 * @date 2025-05-21
 */
public interface ICourseVideoService 
{
    /**
     * 查询课程视频
     * 
     * @param videoId 课程视频主键
     * @return 课程视频
     */
    public CourseVideo selectCourseVideoByVideoId(String videoId);

    /**
     * 查询课程视频列表
     * 
     * @param courseVideo 课程视频
     * @return 课程视频集合
     */
    public List<CourseVideo> selectCourseVideoList(CourseVideo courseVideo);

    /**
     * 新增课程视频
     * 
     * @param courseVideo 课程视频
     * @return 结果
     */
    public int insertCourseVideo(CourseVideo courseVideo);

    /**
     * 修改课程视频
     * 
     * @param courseVideo 课程视频
     * @return 结果
     */
    public int updateCourseVideo(CourseVideo courseVideo);

    /**
     * 批量删除课程视频
     * 
     * @param videoIds 需要删除的课程视频主键集合
     * @return 结果
     */
    public int deleteCourseVideoByVideoIds(String videoIds);

    /**
     * 删除课程视频信息
     * 
     * @param videoId 课程视频主键
     * @return 结果
     */
    public int deleteCourseVideoByVideoId(String videoId);
}
