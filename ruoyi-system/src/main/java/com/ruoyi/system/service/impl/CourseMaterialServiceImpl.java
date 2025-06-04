package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.uuid.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.CourseMaterialMapper;
import com.ruoyi.system.domain.CourseMaterial;
import com.ruoyi.system.service.ICourseMaterialService;
import com.ruoyi.common.core.text.Convert;

/**
 * 课程资料Service业务层处理
 * 
 * @author wsw
 * @date 2025-05-21
 */
@Service
public class CourseMaterialServiceImpl implements ICourseMaterialService 
{
    @Autowired
    private CourseMaterialMapper courseMaterialMapper;

    /**
     * 查询课程资料
     * 
     * @param materialId 课程资料主键
     * @return 课程资料
     */
    @Override
    public CourseMaterial selectCourseMaterialByMaterialId(String materialId)
    {
        return courseMaterialMapper.selectCourseMaterialByMaterialId(materialId);
    }

    /**
     * 查询课程资料列表
     * 
     * @param courseMaterial 课程资料
     * @return 课程资料
     */
    @Override
    public List<CourseMaterial> selectCourseMaterialList(CourseMaterial courseMaterial)
    {
        return courseMaterialMapper.selectCourseMaterialList(courseMaterial);
    }

    /**
     * 新增课程资料
     * 
     * @param courseMaterial 课程资料
     * @return 结果
     */
    @Override
    public int insertCourseMaterial(CourseMaterial courseMaterial)
    {
        courseMaterial.setMaterialId(UUID.randomUUID().toString().replace("-", ""));
        courseMaterial.setUploadTime(DateUtils.getTime());
        return courseMaterialMapper.insertCourseMaterial(courseMaterial);
    }

    /**
     * 修改课程资料
     * 
     * @param courseMaterial 课程资料
     * @return 结果
     */
    @Override
    public int updateCourseMaterial(CourseMaterial courseMaterial)
    {
        courseMaterial.setUpdateTime(DateUtils.getNowDate());
        return courseMaterialMapper.updateCourseMaterial(courseMaterial);
    }

    /**
     * 批量删除课程资料
     * 
     * @param materialIds 需要删除的课程资料主键
     * @return 结果
     */
    @Override
    public int deleteCourseMaterialByMaterialIds(String materialIds)
    {
        return courseMaterialMapper.deleteCourseMaterialByMaterialIds(Convert.toStrArray(materialIds));
    }

    /**
     * 删除课程资料信息
     * 
     * @param materialId 课程资料主键
     * @return 结果
     */
    @Override
    public int deleteCourseMaterialByMaterialId(String materialId)
    {
        return courseMaterialMapper.deleteCourseMaterialByMaterialId(materialId);
    }
}
