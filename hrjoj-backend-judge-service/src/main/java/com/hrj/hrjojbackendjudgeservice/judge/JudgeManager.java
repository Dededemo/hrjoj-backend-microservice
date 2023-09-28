package com.hrj.hrjojbackendjudgeservice.judge;


import com.hrj.hrjojbackendjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.hrj.hrjojbackendjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.hrj.hrjojbackendjudgeservice.judge.strategy.JudgeContext;
import com.hrj.hrjojbackendjudgeservice.judge.strategy.JudgeStrategy;
import com.hrj.hrjojbackendmodel.model.codesandbox.JudgeInfo;
import com.hrj.hrjojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理(简化调用)
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
