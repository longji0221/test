package com.cloud.client.dao;

import com.cloud.client.entity.FinUserDo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FinUserDao {


    void saveRecord(FinUserDo finUserDo);

    @Select("select * from fin_user")
    List<FinUserDo>  find();

}
