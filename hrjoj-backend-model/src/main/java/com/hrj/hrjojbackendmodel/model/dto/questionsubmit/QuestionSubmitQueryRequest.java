package com.hrj.hrjojbackendmodel.model.dto.questionsubmit;

import com.hrj.hrjojbackendcommon.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 查询判题状态
 */
@Data
@EqualsAndHashCode(callSuper = true)//重写父类Equal和hashcode方法
public class QuestionSubmitQueryRequest extends PageRequest implements Serializable {

    /**
     * 编程语言
     */
    private String language;

    /**
     * 提交状态
     */
    private Integer status;

    /**
     * 题目 id
     */
    private Long questionId;
    /**
     * 用户id
     */
    private Long userId;


    private static final long serialVersionUID = 1L;
}