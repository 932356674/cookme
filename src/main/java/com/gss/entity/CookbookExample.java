package com.gss.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CookbookExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cookbook
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cookbook
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cookbook
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cookbook
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public CookbookExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cookbook
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cookbook
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cookbook
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cookbook
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cookbook
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cookbook
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cookbook
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cookbook
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cookbook
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cookbook
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cookbook
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andBookIdIsNull() {
            addCriterion("book_Id is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("book_Id is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(Integer value) {
            addCriterion("book_Id =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(Integer value) {
            addCriterion("book_Id <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(Integer value) {
            addCriterion("book_Id >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_Id >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(Integer value) {
            addCriterion("book_Id <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(Integer value) {
            addCriterion("book_Id <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<Integer> values) {
            addCriterion("book_Id in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<Integer> values) {
            addCriterion("book_Id not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(Integer value1, Integer value2) {
            addCriterion("book_Id between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(Integer value1, Integer value2) {
            addCriterion("book_Id not between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNull() {
            addCriterion("book_name is null");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNotNull() {
            addCriterion("book_name is not null");
            return (Criteria) this;
        }

        public Criteria andBookNameEqualTo(String value) {
            addCriterion("book_name =", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotEqualTo(String value) {
            addCriterion("book_name <>", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThan(String value) {
            addCriterion("book_name >", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThanOrEqualTo(String value) {
            addCriterion("book_name >=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThan(String value) {
            addCriterion("book_name <", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThanOrEqualTo(String value) {
            addCriterion("book_name <=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLike(String value) {
            addCriterion("book_name like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotLike(String value) {
            addCriterion("book_name not like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameIn(List<String> values) {
            addCriterion("book_name in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotIn(List<String> values) {
            addCriterion("book_name not in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameBetween(String value1, String value2) {
            addCriterion("book_name between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotBetween(String value1, String value2) {
            addCriterion("book_name not between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andUsIdIsNull() {
            addCriterion("us_id is null");
            return (Criteria) this;
        }

        public Criteria andUsIdIsNotNull() {
            addCriterion("us_id is not null");
            return (Criteria) this;
        }

        public Criteria andUsIdEqualTo(Integer value) {
            addCriterion("us_id =", value, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdNotEqualTo(Integer value) {
            addCriterion("us_id <>", value, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdGreaterThan(Integer value) {
            addCriterion("us_id >", value, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("us_id >=", value, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdLessThan(Integer value) {
            addCriterion("us_id <", value, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdLessThanOrEqualTo(Integer value) {
            addCriterion("us_id <=", value, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdIn(List<Integer> values) {
            addCriterion("us_id in", values, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdNotIn(List<Integer> values) {
            addCriterion("us_id not in", values, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdBetween(Integer value1, Integer value2) {
            addCriterion("us_id between", value1, value2, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("us_id not between", value1, value2, "usId");
            return (Criteria) this;
        }

        public Criteria andBookDetailsIsNull() {
            addCriterion("book_details is null");
            return (Criteria) this;
        }

        public Criteria andBookDetailsIsNotNull() {
            addCriterion("book_details is not null");
            return (Criteria) this;
        }

        public Criteria andBookDetailsEqualTo(String value) {
            addCriterion("book_details =", value, "bookDetails");
            return (Criteria) this;
        }

        public Criteria andBookDetailsNotEqualTo(String value) {
            addCriterion("book_details <>", value, "bookDetails");
            return (Criteria) this;
        }

        public Criteria andBookDetailsGreaterThan(String value) {
            addCriterion("book_details >", value, "bookDetails");
            return (Criteria) this;
        }

        public Criteria andBookDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("book_details >=", value, "bookDetails");
            return (Criteria) this;
        }

        public Criteria andBookDetailsLessThan(String value) {
            addCriterion("book_details <", value, "bookDetails");
            return (Criteria) this;
        }

        public Criteria andBookDetailsLessThanOrEqualTo(String value) {
            addCriterion("book_details <=", value, "bookDetails");
            return (Criteria) this;
        }

        public Criteria andBookDetailsLike(String value) {
            addCriterion("book_details like", value, "bookDetails");
            return (Criteria) this;
        }

        public Criteria andBookDetailsNotLike(String value) {
            addCriterion("book_details not like", value, "bookDetails");
            return (Criteria) this;
        }

        public Criteria andBookDetailsIn(List<String> values) {
            addCriterion("book_details in", values, "bookDetails");
            return (Criteria) this;
        }

        public Criteria andBookDetailsNotIn(List<String> values) {
            addCriterion("book_details not in", values, "bookDetails");
            return (Criteria) this;
        }

        public Criteria andBookDetailsBetween(String value1, String value2) {
            addCriterion("book_details between", value1, value2, "bookDetails");
            return (Criteria) this;
        }

        public Criteria andBookDetailsNotBetween(String value1, String value2) {
            addCriterion("book_details not between", value1, value2, "bookDetails");
            return (Criteria) this;
        }

        public Criteria andBookCommentIsNull() {
            addCriterion("book_comment is null");
            return (Criteria) this;
        }

        public Criteria andBookCommentIsNotNull() {
            addCriterion("book_comment is not null");
            return (Criteria) this;
        }

        public Criteria andBookCommentEqualTo(String value) {
            addCriterion("book_comment =", value, "bookComment");
            return (Criteria) this;
        }

        public Criteria andBookCommentNotEqualTo(String value) {
            addCriterion("book_comment <>", value, "bookComment");
            return (Criteria) this;
        }

        public Criteria andBookCommentGreaterThan(String value) {
            addCriterion("book_comment >", value, "bookComment");
            return (Criteria) this;
        }

        public Criteria andBookCommentGreaterThanOrEqualTo(String value) {
            addCriterion("book_comment >=", value, "bookComment");
            return (Criteria) this;
        }

        public Criteria andBookCommentLessThan(String value) {
            addCriterion("book_comment <", value, "bookComment");
            return (Criteria) this;
        }

        public Criteria andBookCommentLessThanOrEqualTo(String value) {
            addCriterion("book_comment <=", value, "bookComment");
            return (Criteria) this;
        }

        public Criteria andBookCommentLike(String value) {
            addCriterion("book_comment like", value, "bookComment");
            return (Criteria) this;
        }

        public Criteria andBookCommentNotLike(String value) {
            addCriterion("book_comment not like", value, "bookComment");
            return (Criteria) this;
        }

        public Criteria andBookCommentIn(List<String> values) {
            addCriterion("book_comment in", values, "bookComment");
            return (Criteria) this;
        }

        public Criteria andBookCommentNotIn(List<String> values) {
            addCriterion("book_comment not in", values, "bookComment");
            return (Criteria) this;
        }

        public Criteria andBookCommentBetween(String value1, String value2) {
            addCriterion("book_comment between", value1, value2, "bookComment");
            return (Criteria) this;
        }

        public Criteria andBookCommentNotBetween(String value1, String value2) {
            addCriterion("book_comment not between", value1, value2, "bookComment");
            return (Criteria) this;
        }

        public Criteria andBookPageviewIsNull() {
            addCriterion("book_pageView is null");
            return (Criteria) this;
        }

        public Criteria andBookPageviewIsNotNull() {
            addCriterion("book_pageView is not null");
            return (Criteria) this;
        }

        public Criteria andBookPageviewEqualTo(Integer value) {
            addCriterion("book_pageView =", value, "bookPageview");
            return (Criteria) this;
        }

        public Criteria andBookPageviewNotEqualTo(Integer value) {
            addCriterion("book_pageView <>", value, "bookPageview");
            return (Criteria) this;
        }

        public Criteria andBookPageviewGreaterThan(Integer value) {
            addCriterion("book_pageView >", value, "bookPageview");
            return (Criteria) this;
        }

        public Criteria andBookPageviewGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_pageView >=", value, "bookPageview");
            return (Criteria) this;
        }

        public Criteria andBookPageviewLessThan(Integer value) {
            addCriterion("book_pageView <", value, "bookPageview");
            return (Criteria) this;
        }

        public Criteria andBookPageviewLessThanOrEqualTo(Integer value) {
            addCriterion("book_pageView <=", value, "bookPageview");
            return (Criteria) this;
        }

        public Criteria andBookPageviewIn(List<Integer> values) {
            addCriterion("book_pageView in", values, "bookPageview");
            return (Criteria) this;
        }

        public Criteria andBookPageviewNotIn(List<Integer> values) {
            addCriterion("book_pageView not in", values, "bookPageview");
            return (Criteria) this;
        }

        public Criteria andBookPageviewBetween(Integer value1, Integer value2) {
            addCriterion("book_pageView between", value1, value2, "bookPageview");
            return (Criteria) this;
        }

        public Criteria andBookPageviewNotBetween(Integer value1, Integer value2) {
            addCriterion("book_pageView not between", value1, value2, "bookPageview");
            return (Criteria) this;
        }

        public Criteria andBookGradeIsNull() {
            addCriterion("book_grade is null");
            return (Criteria) this;
        }

        public Criteria andBookGradeIsNotNull() {
            addCriterion("book_grade is not null");
            return (Criteria) this;
        }

        public Criteria andBookGradeEqualTo(Double value) {
            addCriterion("book_grade =", value, "bookGrade");
            return (Criteria) this;
        }

        public Criteria andBookGradeNotEqualTo(Double value) {
            addCriterion("book_grade <>", value, "bookGrade");
            return (Criteria) this;
        }

        public Criteria andBookGradeGreaterThan(Double value) {
            addCriterion("book_grade >", value, "bookGrade");
            return (Criteria) this;
        }

        public Criteria andBookGradeGreaterThanOrEqualTo(Double value) {
            addCriterion("book_grade >=", value, "bookGrade");
            return (Criteria) this;
        }

        public Criteria andBookGradeLessThan(Double value) {
            addCriterion("book_grade <", value, "bookGrade");
            return (Criteria) this;
        }

        public Criteria andBookGradeLessThanOrEqualTo(Double value) {
            addCriterion("book_grade <=", value, "bookGrade");
            return (Criteria) this;
        }

        public Criteria andBookGradeIn(List<Double> values) {
            addCriterion("book_grade in", values, "bookGrade");
            return (Criteria) this;
        }

        public Criteria andBookGradeNotIn(List<Double> values) {
            addCriterion("book_grade not in", values, "bookGrade");
            return (Criteria) this;
        }

        public Criteria andBookGradeBetween(Double value1, Double value2) {
            addCriterion("book_grade between", value1, value2, "bookGrade");
            return (Criteria) this;
        }

        public Criteria andBookGradeNotBetween(Double value1, Double value2) {
            addCriterion("book_grade not between", value1, value2, "bookGrade");
            return (Criteria) this;
        }

        public Criteria andBookCollectIsNull() {
            addCriterion("book_collect is null");
            return (Criteria) this;
        }

        public Criteria andBookCollectIsNotNull() {
            addCriterion("book_collect is not null");
            return (Criteria) this;
        }

        public Criteria andBookCollectEqualTo(Integer value) {
            addCriterion("book_collect =", value, "bookCollect");
            return (Criteria) this;
        }

        public Criteria andBookCollectNotEqualTo(Integer value) {
            addCriterion("book_collect <>", value, "bookCollect");
            return (Criteria) this;
        }

        public Criteria andBookCollectGreaterThan(Integer value) {
            addCriterion("book_collect >", value, "bookCollect");
            return (Criteria) this;
        }

        public Criteria andBookCollectGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_collect >=", value, "bookCollect");
            return (Criteria) this;
        }

        public Criteria andBookCollectLessThan(Integer value) {
            addCriterion("book_collect <", value, "bookCollect");
            return (Criteria) this;
        }

        public Criteria andBookCollectLessThanOrEqualTo(Integer value) {
            addCriterion("book_collect <=", value, "bookCollect");
            return (Criteria) this;
        }

        public Criteria andBookCollectIn(List<Integer> values) {
            addCriterion("book_collect in", values, "bookCollect");
            return (Criteria) this;
        }

        public Criteria andBookCollectNotIn(List<Integer> values) {
            addCriterion("book_collect not in", values, "bookCollect");
            return (Criteria) this;
        }

        public Criteria andBookCollectBetween(Integer value1, Integer value2) {
            addCriterion("book_collect between", value1, value2, "bookCollect");
            return (Criteria) this;
        }

        public Criteria andBookCollectNotBetween(Integer value1, Integer value2) {
            addCriterion("book_collect not between", value1, value2, "bookCollect");
            return (Criteria) this;
        }

        public Criteria andBookImageIsNull() {
            addCriterion("book_image is null");
            return (Criteria) this;
        }

        public Criteria andBookImageIsNotNull() {
            addCriterion("book_image is not null");
            return (Criteria) this;
        }

        public Criteria andBookImageEqualTo(String value) {
            addCriterion("book_image =", value, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageNotEqualTo(String value) {
            addCriterion("book_image <>", value, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageGreaterThan(String value) {
            addCriterion("book_image >", value, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageGreaterThanOrEqualTo(String value) {
            addCriterion("book_image >=", value, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageLessThan(String value) {
            addCriterion("book_image <", value, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageLessThanOrEqualTo(String value) {
            addCriterion("book_image <=", value, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageLike(String value) {
            addCriterion("book_image like", value, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageNotLike(String value) {
            addCriterion("book_image not like", value, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageIn(List<String> values) {
            addCriterion("book_image in", values, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageNotIn(List<String> values) {
            addCriterion("book_image not in", values, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageBetween(String value1, String value2) {
            addCriterion("book_image between", value1, value2, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookImageNotBetween(String value1, String value2) {
            addCriterion("book_image not between", value1, value2, "bookImage");
            return (Criteria) this;
        }

        public Criteria andBookTimeIsNull() {
            addCriterion("book_time is null");
            return (Criteria) this;
        }

        public Criteria andBookTimeIsNotNull() {
            addCriterion("book_time is not null");
            return (Criteria) this;
        }

        public Criteria andBookTimeEqualTo(Date value) {
            addCriterionForJDBCDate("book_time =", value, "bookTime");
            return (Criteria) this;
        }

        public Criteria andBookTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("book_time <>", value, "bookTime");
            return (Criteria) this;
        }

        public Criteria andBookTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("book_time >", value, "bookTime");
            return (Criteria) this;
        }

        public Criteria andBookTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("book_time >=", value, "bookTime");
            return (Criteria) this;
        }

        public Criteria andBookTimeLessThan(Date value) {
            addCriterionForJDBCDate("book_time <", value, "bookTime");
            return (Criteria) this;
        }

        public Criteria andBookTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("book_time <=", value, "bookTime");
            return (Criteria) this;
        }

        public Criteria andBookTimeIn(List<Date> values) {
            addCriterionForJDBCDate("book_time in", values, "bookTime");
            return (Criteria) this;
        }

        public Criteria andBookTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("book_time not in", values, "bookTime");
            return (Criteria) this;
        }

        public Criteria andBookTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("book_time between", value1, value2, "bookTime");
            return (Criteria) this;
        }

        public Criteria andBookTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("book_time not between", value1, value2, "bookTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cookbook
     *
     * @mbggenerated do_not_delete_during_merge Tue Apr 09 21:38:01 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cookbook
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}