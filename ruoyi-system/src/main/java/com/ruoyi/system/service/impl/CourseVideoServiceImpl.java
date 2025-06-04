package com.ruoyi.system.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.uuid.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.CourseVideoMapper;
import com.ruoyi.system.domain.CourseVideo;
import com.ruoyi.system.service.ICourseVideoService;
import com.ruoyi.common.core.text.Convert;

/**
 * 课程视频Service业务层处理
 * 
 * @author wsw
 * @date 2025-05-21
 */
@Service
public class CourseVideoServiceImpl implements ICourseVideoService 
{
    @Autowired
    private CourseVideoMapper courseVideoMapper;

    /**
     * 查询课程视频
     * 
     * @param videoId 课程视频主键
     * @return 课程视频
     */
    @Override
    public CourseVideo selectCourseVideoByVideoId(String videoId)
    {
        return courseVideoMapper.selectCourseVideoByVideoId(videoId);
    }

    /**
     * 查询课程视频列表
     * 
     * @param courseVideo 课程视频
     * @return 课程视频
     */
    @Override
    public List<CourseVideo> selectCourseVideoList(CourseVideo courseVideo)
    {
        return courseVideoMapper.selectCourseVideoList(courseVideo);
    }

    /**
     * 新增课程视频
     * 
     * @param courseVideo 课程视频
     * @return 结果
     */
    @Override
    public int insertCourseVideo(CourseVideo courseVideo)
    {
        courseVideo.setVideoId(UUID.randomUUID().toString().replace("-", ""));
        courseVideo.setUploadTime(DateUtils.getTime());
        return courseVideoMapper.insertCourseVideo(courseVideo);
    }

    /**
     * 修改课程视频
     * 
     * @param courseVideo 课程视频
     * @return 结果
     */
    @Override
    public int updateCourseVideo(CourseVideo courseVideo)
    {
        courseVideo.setUpdateTime(DateUtils.getNowDate());
        return courseVideoMapper.updateCourseVideo(courseVideo);
    }

    /**
     * 批量删除课程视频
     * 
     * @param videoIds 需要删除的课程视频主键
     * @return 结果
     */
    @Override
    public int deleteCourseVideoByVideoIds(String videoIds)
    {
        return courseVideoMapper.deleteCourseVideoByVideoIds(Convert.toStrArray(videoIds));
    }

    /**
     * 删除课程视频信息
     * 
     * @param videoId 课程视频主键
     * @return 结果
     */
    @Override
    public int deleteCourseVideoByVideoId(String videoId)
    {
        return courseVideoMapper.deleteCourseVideoByVideoId(videoId);
    }
}
