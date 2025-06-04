package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.CourseMaterial;

/**
 * 课程资料Service接口
 * 
 * @author wsw
 * @date 2025-05-21
 */
public interface ICourseMaterialService 
{
    /**
     * 查询课程资料
     * 
     * @param materialId 课程资料主键
     * @return 课程资料
     */
    public CourseMaterial selectCourseMaterialByMaterialId(String materialId);

    /**
     * 查询课程资料列表
     * 
     * @param courseMaterial 课程资料
     * @return 课程资料集合
     */
    public List<CourseMaterial> selectCourseMaterialList(CourseMaterial courseMaterial);

    /**
     * 新增课程资料
     * 
     * @param courseMaterial 课程资料
     * @return 结果
     */
    public int insertCourseMaterial(CourseMaterial courseMaterial);

    /**
     * 修改课程资料
     * 
     * @param courseMaterial 课程资料
     * @return 结果
     */
    public int updateCourseMaterial(CourseMaterial courseMaterial);

    /**
     * 批量删除课程资料
     * 
     * @param materialIds 需要删除的课程资料主键集合
     * @return 结果
     */
    public int deleteCourseMaterialByMaterialIds(String materialIds);

    /**
     * 删除课程资料信息
     * 
     * @param materialId 课程资料主键
     * @return 结果
     */
    public int deleteCourseMaterialByMaterialId(String materialId);
}
