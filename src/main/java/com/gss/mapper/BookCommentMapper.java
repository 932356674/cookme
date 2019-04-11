package com.gss.mapper;

import com.gss.entity.BookComment;
import com.gss.entity.BookCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_comment
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    int countByExample(BookCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_comment
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    int deleteByExample(BookCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_comment
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    int deleteByPrimaryKey(Integer commentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_comment
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    int insert(BookComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_comment
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    int insertSelective(BookComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_comment
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    List<BookComment> selectByExample(BookCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_comment
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    BookComment selectByPrimaryKey(Integer commentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_comment
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    int updateByExampleSelective(@Param("record") BookComment record, @Param("example") BookCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_comment
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    int updateByExample(@Param("record") BookComment record, @Param("example") BookCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_comment
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    int updateByPrimaryKeySelective(BookComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_comment
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    int updateByPrimaryKey(BookComment record);
}