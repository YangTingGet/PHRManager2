package com.group2.dao;


import com.group2.entiy.AdviceEntiy;
import com.group2.entiy.UserEntiy;

import java.util.List;

/**
 * @author wts
 * 医院功能持久层接口
 */

public interface HospitalDao {
//健康资讯文章的操作
    /* 返回已发布的文章 */
    List<AdviceEntiy> getAdvices();

    /* 发布新文章 */
    void publishAdvice ();

    /* 修改指定文章的内容 */
    void updateContent(AdviceEntiy advice);

    /* 删除文章 */
    void deleteAdvice();

//医疗手术的安排操作
    /* 为病人安排一场手术 */
    void scheduleOperation(UserEntiy patient);

//对本院医生的调度操作

//预约的操作
    /* 是否接受该用户的申请 */
    boolean isReservable(UserEntiy user);

//对病人的操作
    /* 记录就诊结果信息 */
    void recordInfoInto(UserEntiy patient);
}
