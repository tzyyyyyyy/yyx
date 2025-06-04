package com.ruoyi.web.controller.system;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.CourseVideo;
import com.ruoyi.system.service.ICourseVideoService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 课程视频Controller
 * 
 * @author wsw
 * @date 2025-05-21
 */
@Controller
@RequestMapping("/system/video")
public class CourseVideoController extends BaseController
{
    private String prefix = "system/video";

    @Autowired
    private ICourseVideoService courseVideoService;

    @RequiresPermissions("system:video:view")
    @GetMapping()
    public String video()
    {
        return prefix + "/video";
    }

    /**
     * 查询课程视频列表
     */
    @RequiresPermissions("system:video:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CourseVideo courseVideo)
    {
        startPage();
        List<CourseVideo> list = courseVideoService.selectCourseVideoList(courseVideo);
        return getDataTable(list);
    }

    /**
     * 导出课程视频列表
     */
    @RequiresPermissions("system:video:export")
    @Log(title = "课程视频", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CourseVideo courseVideo)
    {
        List<CourseVideo> list = courseVideoService.selectCourseVideoList(courseVideo);
        ExcelUtil<CourseVideo> util = new ExcelUtil<CourseVideo>(CourseVideo.class);
        return util.exportExcel(list, "课程视频数据");
    }

    /**
     * 新增课程视频
     */
    @RequiresPermissions("system:video:add")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存课程视频
     */
    @RequiresPermissions("system:video:add")
    @Log(title = "课程视频", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CourseVideo courseVideo)
    {
        return toAjax(courseVideoService.insertCourseVideo(courseVideo));
    }

    /**
     * 修改课程视频
     */
    @RequiresPermissions("system:video:edit")
    @GetMapping("/edit/{videoId}")
    public String edit(@PathVariable("videoId") String videoId, ModelMap mmap)
    {
        CourseVideo courseVideo = courseVideoService.selectCourseVideoByVideoId(videoId);
        mmap.put("courseVideo", courseVideo);
        return prefix + "/edit";
    }

    /**
     * 修改保存课程视频
     */
    @RequiresPermissions("system:video:edit")
    @Log(title = "课程视频", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CourseVideo courseVideo)
    {
        return toAjax(courseVideoService.updateCourseVideo(courseVideo));
    }

    /**
     * 删除课程视频
     */
    @RequiresPermissions("system:video:remove")
    @Log(title = "课程视频", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(courseVideoService.deleteCourseVideoByVideoIds(ids));
    }
}
