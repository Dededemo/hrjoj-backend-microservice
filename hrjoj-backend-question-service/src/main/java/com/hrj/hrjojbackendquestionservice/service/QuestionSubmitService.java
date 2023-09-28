package com.hrj.hrjojbackendquestionservice.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hrj.hrjojbackendmodel.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.hrj.hrjojbackendmodel.model.dto.questionsubmit.QuestionSubmitQueryRequest;
import com.hrj.hrjojbackendmodel.model.entity.QuestionSubmit;
import com.hrj.hrjojbackendmodel.model.entity.User;
import com.hrj.hrjojbackendmodel.model.vo.QuestionSubmitVO;

/**
 * @author hrj
 * @description 针对表【question_submit(题目提交)】的数据库操作Service
 * @createDate 2023-09-14 16:37:25
 */
public interface QuestionSubmitService extends IService<QuestionSubmit> {

    /**
     * 题目提交信息
     *
     * @param questionSubmitAddRequest 题目创建信息
     * @param loginUser
     * @return
     */
    long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, User loginUser);


    /**
     * 获取查询条件
     *
     * @param questionSubmitQueryRequest
     * @return
     */
    QueryWrapper<QuestionSubmit> getQueryWrapper(QuestionSubmitQueryRequest questionSubmitQueryRequest);

    /**
     * 获取题目封装
     *
     * @param questionSubmit
     * @param loginUser
     * @return
     */
    QuestionSubmitVO getQuestionSubmitVO(QuestionSubmit questionSubmit, User loginUser);

    /**
     * 分页获取题目封装
     *
     * @param questionSubmitPage
     * @param loginUser
     * @return
     */
    Page<QuestionSubmitVO> getQuestionSubmitVOPage(Page<QuestionSubmit> questionSubmitPage, User loginUser);

}
