package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.CourseVideo;

/**
 * 课程视频Mapper接口
 * 
 * @author wsw
 * @date 2025-05-21
 */
public interface CourseVideoMapper 
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
     * 删除课程视频
     * 
     * @param videoId 课程视频主键
     * @return 结果
     */
    public int deleteCourseVideoByVideoId(String videoId);

    /**
     * 批量删除课程视频
     * 
     * @param videoIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCourseVideoByVideoIds(String[] videoIds);
}
