package com.group2.dao;

import com.group2.entiy.AdviceEntiy;
import com.group2.entiy.HospitalEntiy;
import com.group2.entiy.UserEntiy;

import java.util.List;

/**
 * @author TINGTINGTING
 * 管理员功能持久层接口
 */
public interface AdminDao {
//对于普通用户的操作
    /**
     * 查询所有用户信息
     */
    List<UserEntiy> selectUsers();


//对于医院的操作
    /**
     * 查询所有医院信息
     */
    List<HospitalEntiy> selectHospitals();


    /**
     * 查询医院信息
     */
    HospitalEntiy selectHospital(String hospitalName);

    /**
     * 删除医院信息（当医院与平台停止合作时）
     */
    boolean deleteHospital(String hospitalName);

    /**
     * 添加医院
     */
    boolean insertHospital(HospitalEntiy hospitalEntiy);

//对于资讯的操作
    /**
     * 查询未审核的资讯
     */
    List<AdviceEntiy> selectInformation();

    /**
     * 修改资讯审核状态
     */
    boolean updateInformationState(String informationNum);
}
