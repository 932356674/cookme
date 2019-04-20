package com.gss.entity;

import com.gss.utils.Constants;

import java.util.Date;

public class AliOrder {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ali_order.order_id
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    private Long orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ali_order.order_num
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    private String orderNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ali_order.us_id
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    private Integer usId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ali_order.con_id
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    private Integer conId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ali_order.status
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ali_order.pay_status
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    private Integer payStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ali_order.amount
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    private Long amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ali_order.trade_num
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    private String tradeNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ali_order.create_date
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ali_order.remark
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ali_order.ali_item
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    private Long aliItem;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ali_order.order_id
     *
     * @return the value of ali_order.order_id
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ali_order.order_id
     *
     * @param orderId the value for ali_order.order_id
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ali_order.order_num
     *
     * @return the value of ali_order.order_num
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    public String getOrderNum() {
        return orderNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ali_order.order_num
     *
     * @param orderNum the value for ali_order.order_num
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum == null ? null : orderNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ali_order.us_id
     *
     * @return the value of ali_order.us_id
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    public Integer getUsId() {
        return usId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ali_order.us_id
     *
     * @param usId the value for ali_order.us_id
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    public void setUsId(Integer usId) {
        this.usId = usId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ali_order.con_id
     *
     * @return the value of ali_order.con_id
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    public Integer getConId() {
        return conId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ali_order.con_id
     *
     * @param conId the value for ali_order.con_id
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    public void setConId(Integer conId) {
        this.conId = conId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ali_order.status
     *
     * @return the value of ali_order.status
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ali_order.status
     *
     * @param status the value for ali_order.status
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ali_order.pay_status
     *
     * @return the value of ali_order.pay_status
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    public Integer getPayStatus() {
        return payStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ali_order.pay_status
     *
     * @param payStatus the value for ali_order.pay_status
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ali_order.amount
     *
     * @return the value of ali_order.amount
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ali_order.amount
     *
     * @param amount the value for ali_order.amount
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ali_order.trade_num
     *
     * @return the value of ali_order.trade_num
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    public String getTradeNum() {
        return tradeNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ali_order.trade_num
     *
     * @param tradeNum the value for ali_order.trade_num
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    public void setTradeNum(String tradeNum) {
        this.tradeNum = tradeNum == null ? null : tradeNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ali_order.create_date
     *
     * @return the value of ali_order.create_date
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ali_order.create_date
     *
     * @param createDate the value for ali_order.create_date
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ali_order.remark
     *
     * @return the value of ali_order.remark
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ali_order.remark
     *
     * @param remark the value for ali_order.remark
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ali_order.ali_item
     *
     * @return the value of ali_order.ali_item
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    public Long getAliItem() {
        return aliItem;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ali_order.ali_item
     *
     * @param aliItem the value for ali_order.ali_item
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    public void setAliItem(Long aliItem) {
        this.aliItem = aliItem;
    }


    public AliOrder(String orderNum, Integer usId, Long amount, String remark) {
        this.orderNum = orderNum;
        this.usId = usId;
        this.status = Constants.ORDER_STATUS_CREATE;
        this.amount = amount;
        this.remark = remark;
    }
}