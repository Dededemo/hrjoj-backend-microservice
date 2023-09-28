package com.hrj.hrjojbackendmodel.model.codesandbox;

import lombok.Data;

/**
 * 题目配置
 */
@Data
public class JudgeInfo {

    /**
     * 程序执行信息
     */
    private String message;

    /**
     * 消耗内存(KB)
     */
    private Long memory;

    /**
     * 消耗时间(KB)
     */
    private Long time;


}
