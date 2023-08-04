package com.education.content.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 添加、修改删除课程计划
 * @author：wufengning
 * @date: 2023/8/2
 */
//这个类只保存在数据库中不能为空的字段
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaveTeachplanDto {
    /**
     * 教学计划id
     */
    private Long id;
    /**
     * 课程计划名称
     */
    private String pname;
    /**
     * 课程计划父级Id
     */
    private Long parentid;
    /**
     * 层级，分为1、2、3级
     */
    private Integer grade;
    /**
     * 课程类型:1视频、2文档
     */
    private String mediaType;
    /**
     * 课程标识
     */
    private Long courseId;
    /**
     * 课程发布标识
     */
    private Long coursePubId;
    /**
     * 是否支持试学或预览（试看）
     */
    private String isPreview;
}
