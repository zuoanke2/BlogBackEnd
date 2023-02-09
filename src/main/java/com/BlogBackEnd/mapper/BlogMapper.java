package com.BlogBackEnd.mapper;

import com.BlogBackEnd.model.BlogBean;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface BlogMapper {
    BlogBean queryBlog(int blogId);

    List<BlogBean> queryBlogsByUser(int userId);
}
