package com.BlogBackEnd.mapper;

import com.BlogBackEnd.model.BlogBean;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BlogMapper {
    BlogBean queryBlog(int blogId);
}
