package com.gss.mapper;

import com.gss.entity.OrderItems;
import com.gss.entity.Shopcar;
import com.gss.entity.ShopcarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopcarMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopcar
     *
     * @mbggenerated Wed Apr 17 10:59:22 CST 2019
     */
    int countByExample(ShopcarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopcar
     *
     * @mbggenerated Wed Apr 17 10:59:22 CST 2019
     */
    int deleteByExample(ShopcarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopcar
     *
     * @mbggenerated Wed Apr 17 10:59:22 CST 2019
     */
    int deleteByPrimaryKey(Integer carId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopcar
     *
     * @mbggenerated Wed Apr 17 10:59:22 CST 2019
     */
    int insert(Shopcar record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopcar
     *
     * @mbggenerated Wed Apr 17 10:59:22 CST 2019
     */
    int insertSelective(Shopcar record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopcar
     *
     * @mbggenerated Wed Apr 17 10:59:22 CST 2019
     */
    List<Shopcar> selectByExample(ShopcarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopcar
     *
     * @mbggenerated Wed Apr 17 10:59:22 CST 2019
     */
    Shopcar selectByPrimaryKey(Integer carId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopcar
     *
     * @mbggenerated Wed Apr 17 10:59:22 CST 2019
     */
    int updateByExampleSelective(@Param("record") Shopcar record, @Param("example") ShopcarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopcar
     *
     * @mbggenerated Wed Apr 17 10:59:22 CST 2019
     */
    int updateByExample(@Param("record") Shopcar record, @Param("example") ShopcarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopcar
     *
     * @mbggenerated Wed Apr 17 10:59:22 CST 2019
     */
    int updateByPrimaryKeySelective(Shopcar record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopcar
     *
     * @mbggenerated Wed Apr 17 10:59:22 CST 2019
     */
    int updateByPrimaryKey(Shopcar record);

    int deleteshopca(Shopcar shopcar);
}