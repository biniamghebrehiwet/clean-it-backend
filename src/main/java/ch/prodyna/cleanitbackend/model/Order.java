package ch.prodyna.cleanitbackend.model;

/**
 * The Order class is a model class that will be used for the structure and behaviour of the order objects
 *
 * @author  Biniam Ghebrehiwet
 * @version 1.0
 * @since   22.06.2022
 */
public class Order {

    private Long orderId;
    private String orderType;
    private String textileType;
    private String entryTime;
    private String orderStatus;
    private String orderAmount;
    private String customerName;

    /**
     * Default Constructor
     */
    public Order() {
    }

    /**
     * Constructor with the attributes/fields of the order object
     * @param orderId unique id of the order
     * @param orderType type of the order
     * @param textileType type of the textile
     * @param entryTime entry date of the order
     * @param orderStatus current status of the order
     * @param orderAmount amount being paid for the order
     * @param customerName customer name of the order
     */
    public Order(
            Long orderId,
            String orderType,
            String textileType,
            String entryTime,
            String orderStatus,
            String orderAmount,
            String customerName
    ) {
        this.orderId = orderId;
        this.orderType = orderType;
        this.textileType = textileType;
        this.entryTime = entryTime;
        this.orderStatus = orderStatus;
        this.orderAmount = orderAmount;
        this.customerName = customerName;
    }

    /**
     * Getter of the orderId
     * @return orderId
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * Setter of the orderId
     * @param orderId orderId
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * Getter of the orderType
     * @return orderType
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * Setter of the orderType
     * @param orderType orderType
     */
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    /**
     * Getter of the textileType
     * @return textileType
     */
    public String getTextileType() {
        return textileType;
    }

    /**
     * Setter of the textileType
     * @param textileType textileType
     */
    public void setTextileType(String textileType) {
        this.textileType = textileType;
    }

    /**
     * Getter of the entryTime
     * @return entryTime
     */
    public String getEntryTime() {
        return entryTime;
    }

    /**
     * Setter of the entryTime
     * @param entryTime entryTime
     */
    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    /**
     * Getter of the orderStatus
     * @return orderStatus
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * Setter of the orderStatus
     * @param orderStatus orderStatus
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * Getter of the orderAmount
     * @return orderAmount
     */
    public String getOrderAmount() {
        return orderAmount;
    }

    /**
     * Setter of the orderAmount
     * @param orderAmount orderAmount
     */
    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     * Getter of the customerName
     * @return customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Setter of the customerName
     * @param customerName customerName
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * This method shows/returns the content or details of the order object as string
     * @return order content as string
     */
    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderType='" + orderType + '\'' +
                ", textileType='" + textileType + '\'' +
                ", entryTime='" + entryTime + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", orderAmount='" + orderAmount + '\'' +
                ", customerName='" + customerName + '\'' +
                '}';
    }
}
