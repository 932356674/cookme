package com.gss.entity;

public class OrderItems {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_items.items_id
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    private Long itemsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_items.pro_itm
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    private Long proItm;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_items.product_id
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    private Integer productId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_items.product_num
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    private Long productNum;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_items.items_id
     *
     * @return the value of order_items.items_id
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    public Long getItemsId() {
        return itemsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_items.items_id
     *
     * @param itemsId the value for order_items.items_id
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    public void setItemsId(Long itemsId) {
        this.itemsId = itemsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_items.pro_itm
     *
     * @return the value of order_items.pro_itm
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    public Long getProItm() {
        return proItm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_items.pro_itm
     *
     * @param proItm the value for order_items.pro_itm
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    public void setProItm(Long proItm) {
        this.proItm = proItm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_items.product_id
     *
     * @return the value of order_items.product_id
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_items.product_id
     *
     * @param productId the value for order_items.product_id
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_items.product_num
     *
     * @return the value of order_items.product_num
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    public Long getProductNum() {
        return productNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_items.product_num
     *
     * @param productNum the value for order_items.product_num
     *
     * @mbggenerated Fri Apr 19 14:58:20 CST 2019
     */
    public void setProductNum(Long productNum) {
        this.productNum = productNum;
    }
}