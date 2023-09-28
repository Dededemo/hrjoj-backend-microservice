package com.hrj.hrjojbackendjudgeservice.judge.codesandbox;


import com.hrj.hrjojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.hrj.hrjojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 *
 * 之后我们的项目代码只调用接口，不调用具体的实现类，
 * 这样在你使用其他的代码沙箱实现类时，
 * 就不用去修改名称了， 便于扩展
 */
public interface CodeSandbox {
    /**
     * 执行代码
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
