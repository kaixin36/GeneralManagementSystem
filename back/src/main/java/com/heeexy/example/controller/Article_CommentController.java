package com.heeexy.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.bean.entity.Article_Comment;
import com.heeexy.example.dao.Article_CommentDao;
import org.aspectj.weaver.ast.Var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/article_comment")
public class Article_CommentController {

    @Autowired
    private Article_CommentDao article_CommentDao;

    @PostMapping("/add")
    public int Add(@RequestBody JSONObject requestJson) {
        Article_Comment article_Comment = new Article_Comment();
        article_Comment.article_Id=1;
        article_Comment.comment="评论";
        article_Comment.create_time=new Date();
        article_Comment.update_time=new Date();
        article_Comment.delete_status=1;
        article_CommentDao.insert(article_Comment);
        return 1;
    }


}
