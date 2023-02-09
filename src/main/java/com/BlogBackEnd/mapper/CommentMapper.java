package com.BlogBackEnd.mapper;

import com.BlogBackEnd.model.CommentBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {
    List<CommentBean> queryCommendListByBlogId(int blogId);
}
