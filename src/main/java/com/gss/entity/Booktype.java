package com.gss.entity;

public class Booktype {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column booktype.type_id
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    private Integer typeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column booktype.type_name
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    private String typeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column booktype.type_pid
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    private Integer typePid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column booktype.type_id
     *
     * @return the value of booktype.type_id
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column booktype.type_id
     *
     * @param typeId the value for booktype.type_id
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column booktype.type_name
     *
     * @return the value of booktype.type_name
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column booktype.type_name
     *
     * @param typeName the value for booktype.type_name
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column booktype.type_pid
     *
     * @return the value of booktype.type_pid
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public Integer getTypePid() {
        return typePid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column booktype.type_pid
     *
     * @param typePid the value for booktype.type_pid
     *
     * @mbggenerated Tue Apr 09 21:38:01 CST 2019
     */
    public void setTypePid(Integer typePid) {
        this.typePid = typePid;
    }
}