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
import com.ruoyi.system.domain.CourseMaterial;
import com.ruoyi.system.service.ICourseMaterialService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 课程资料Controller
 * 
 * @author wsw
 * @date 2025-05-21
 */
@Controller
@RequestMapping("/system/material")
public class CourseMaterialController extends BaseController
{
    private String prefix = "system/material";

    @Autowired
    private ICourseMaterialService courseMaterialService;

    @RequiresPermissions("system:material:view")
    @GetMapping()
    public String material()
    {
        return prefix + "/material";
    }

    /**
     * 查询课程资料列表
     */
    @RequiresPermissions("system:material:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CourseMaterial courseMaterial)
    {
        startPage();
        List<CourseMaterial> list = courseMaterialService.selectCourseMaterialList(courseMaterial);
        return getDataTable(list);
    }

    /**
     * 导出课程资料列表
     */
    @RequiresPermissions("system:material:export")
    @Log(title = "课程资料", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CourseMaterial courseMaterial)
    {
        List<CourseMaterial> list = courseMaterialService.selectCourseMaterialList(courseMaterial);
        ExcelUtil<CourseMaterial> util = new ExcelUtil<CourseMaterial>(CourseMaterial.class);
        return util.exportExcel(list, "课程资料数据");
    }

    /**
     * 新增课程资料
     */
    @RequiresPermissions("system:material:add")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存课程资料
     */
    @RequiresPermissions("system:material:add")
    @Log(title = "课程资料", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CourseMaterial courseMaterial)
    {
        return toAjax(courseMaterialService.insertCourseMaterial(courseMaterial));
    }

    /**
     * 修改课程资料
     */
    @RequiresPermissions("system:material:edit")
    @GetMapping("/edit/{materialId}")
    public String edit(@PathVariable("materialId") String materialId, ModelMap mmap)
    {
        CourseMaterial courseMaterial = courseMaterialService.selectCourseMaterialByMaterialId(materialId);
        mmap.put("courseMaterial", courseMaterial);
        return prefix + "/edit";
    }

    /**
     * 修改保存课程资料
     */
    @RequiresPermissions("system:material:edit")
    @Log(title = "课程资料", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CourseMaterial courseMaterial)
    {
        return toAjax(courseMaterialService.updateCourseMaterial(courseMaterial));
    }

    /**
     * 删除课程资料
     */
    @RequiresPermissions("system:material:remove")
    @Log(title = "课程资料", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(courseMaterialService.deleteCourseMaterialByMaterialIds(ids));
    }
}
