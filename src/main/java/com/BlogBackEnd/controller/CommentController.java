package com.BlogBackEnd.controller;

import com.BlogBackEnd.model.CommentBean;
import com.BlogBackEnd.model.CommentVO;
import com.BlogBackEnd.model.UserComments;
import com.BlogBackEnd.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController {
    @Autowired
    private CommentService commentService;

    /**
     * @methodName queryCommentListByBlog
     * @author Anke Zuo
     * @Param blogId
     * @version 1.0
     * @description query all the comments of a single blog
     * @updateTime 2/9/23 01:59
     * @return: java.util.List<com.BlogBackEnd.model.CommentBean>
     * @throws
     */
    @GetMapping("/comment/get/{blogId}")
    public List<CommentBean> queryCommentListByBlog(@PathVariable("blogId") int blogId) {
        return commentService.queryCommentListByBlog(blogId);
    }

    /**
     * @methodName addComment
     * @author Anke Zuo
     * @Param commentVO
     * @version 1.0
     * @description add comment to a blog
     * @updateTime 2/9/23 02:00
     * @return: java.lang.String
     * @throws
     */
    @PostMapping("/comment/add")
    public String addComment(@RequestBody CommentVO commentVO) {
        commentService.addComment(commentVO.getAuthorId(), commentVO.getBlogId(), commentVO.getComment());
        return "Added!";
    }

    /**
     * @methodName updateComment
     * @author Anke Zuo
     * @Param commentVO
     * @version 1.0
     * @description modify one piece of comment
     * @updateTime 2/9/23 02:00
     * @return: java.lang.String
     * @throws
     */
    @PostMapping("/comment/update")
    public String updateComment(@RequestBody CommentVO commentVO) {
        commentService.updateComment(commentVO.getCmtId(), commentVO.getComment());
        return "Updated!";
    }

    /**
     * @methodName deleteComment
     * @author Anke Zuo
     * @Param cmtId
     * @version 1.0
     * @description delete a comment
     * @updateTime 2/9/23 02:01
     * @return: java.lang.String
     * @throws
     */
    @GetMapping("/comment/delete/{cmtId}")
    public String deleteComment(@PathVariable("cmtId") int cmtId) {
        commentService.deleteComment(cmtId);
        return "Deleted!";
    }

    /**
     * @methodName queryUserComments
     * @author Anke Zuo
     * @Param userId
     * @version 1.0
     * @description query all the comments written by someone
     * @updateTime 2/9/23 02:01
     * @return: java.util.List<com.BlogBackEnd.model.UserComments>
     * @throws
     */
    @GetMapping("/comment/querybyuser/{userId}")
    public List<UserComments> queryUserComments(@PathVariable("userId") int userId) {
        return commentService.queryUserComments(userId);
    }
}
