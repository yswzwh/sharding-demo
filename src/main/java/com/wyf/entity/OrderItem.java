package com.wyf.entity;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_order_item0
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class OrderItem {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_item0.order_item_id
     *
     * @mbg.generated
     */
    private Long orderItemId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_item0.order_id
     *
     * @mbg.generated
     */
    private Long orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_item0.user_id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_item0.item_name
     *
     * @mbg.generated
     */
    private String itemName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_item0.order_item_id
     *
     * @return the value of t_order_item0.order_item_id
     *
     * @mbg.generated
     */
    public Long getOrderItemId() {
        return orderItemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_item0.order_item_id
     *
     * @param orderItemId the value for t_order_item0.order_item_id
     *
     * @mbg.generated
     */
    public void setOrderItemId(Long orderItemId) {
        this.orderItemId = orderItemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_item0.order_id
     *
     * @return the value of t_order_item0.order_id
     *
     * @mbg.generated
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_item0.order_id
     *
     * @param orderId the value for t_order_item0.order_id
     *
     * @mbg.generated
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_item0.user_id
     *
     * @return the value of t_order_item0.user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_item0.user_id
     *
     * @param userId the value for t_order_item0.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_item0.item_name
     *
     * @return the value of t_order_item0.item_name
     *
     * @mbg.generated
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_item0.item_name
     *
     * @param itemName the value for t_order_item0.item_name
     *
     * @mbg.generated
     */
    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }
}