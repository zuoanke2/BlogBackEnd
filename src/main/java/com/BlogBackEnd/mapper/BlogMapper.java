package com.BlogBackEnd.mapper;

import com.BlogBackEnd.model.BlogBean;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * @className BlogMapper
 * @author Anke Zuo
 * @description DAO of blog service
 * @updateTime 2/9/23 02:17
 * @version 1.0
 */
@Mapper
public interface BlogMapper {
    BlogBean queryBlog(int blogId);

    List<BlogBean> queryBlogsByUser(int userId);
}
