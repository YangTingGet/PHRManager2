package com.group2.dao;

import com.group2.entiy.ABSEntiy;
import com.group2.entiy.DrugEntiy;
import com.group2.entiy.MedRecordEntiy;
import com.group2.entiy.UserEntiy;

import java.util.List;

/**
 * @author TINGTINGTING
 * 用户功能持久层接口
 */
public interface UserDao {


//用户个人中心
    /**
     * 添加用户（用户注册）
     */
    boolean insertUser(UserEntiy userEntiy);

    /**
     * 查询用户密码
     */
    String selectPassword(String userName);

    /**
     * 修改用户密码
     */
    boolean updatePassword(String userName,String password);

    /**
     * 根据用户名查询用户信息
     */
    UserEntiy selectUserbyuserName(String userName);

    /**
     * 更新用户信息
     */
    boolean updeteUser(UserEntiy userEntiy);


//查看药品信息
    /**
     * 查询数据库前几样药品
     */
    List<DrugEntiy> selectDrugs();

    /**
     * 根据药品名称查询药品信息
     */
    DrugEntiy selectDrugbyDrugName(String drugName);


//病历夹
    /**
     *查询病历夹信息
     */
    ABSEntiy selectABSbyuserName(String userName);

    /**
     *修改备忘录笔记
     */
    boolean updateNotes(String notes,String userName);

    /**
     * 根据用户名查看该用户的病历
     */
    MedRecordEntiy selectMedRecordbyuserName(String userName);

    /**
     * 更新用户对服务评价
     */
    boolean updateRemarks(String remarks,String userName);


//用户挂号


//访问资讯

}


















