package com.heeexy.example.dao;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.bean.entity.Article_Comment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: heeexy
 * @description: 用户/角色/权限
 * @date: 2017-11-14 15:08:45
 */
@Service
public interface Article_CommentDao {

    int insert(Article_Comment Article_Comment);

}
