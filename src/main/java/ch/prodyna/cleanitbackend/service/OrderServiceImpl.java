package ch.prodyna.cleanitbackend.service;

import ch.prodyna.cleanitbackend.api.OrderService;
import ch.prodyna.cleanitbackend.model.Order;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static ch.prodyna.cleanitbackend.common.OrderApiConstants.PATH_BASE_ORDERS;

/**
 * The OrderServiceImpl class is an implementation class of the OrderService class.
 * It implements the interface methods and acts as a RestController that receives http request (REST APIs)
 * from the client and answers back with result.
 *
 * @author  Biniam Ghebrehiwet
 * @version 1.0
 * @since   22.06.2022
 */
@RestController
@RequestMapping(PATH_BASE_ORDERS)
public class OrderServiceImpl implements OrderService {

    // Hardcoded ready list for a couple of orders in a list (instead of using a database) -- works as a temporary solution
    List<Order> orderList = new ArrayList<>();

    /**
     * Default Constructor that initiates and prepares information (in this case a couple of order objects inside a list)
     */
    public OrderServiceImpl() {
        this.orderList.add(new Order(1L, "Trocknen", "Anzug", "12.02.2022", "open", "45.50", "Hans Müller"));
        this.orderList.add(new Order(2L, "Waschen", "Jacke", "02.11.2021", "closed", "39.99", "Anna Schmidt"));
        this.orderList.add(new Order(3L, "Bügeln", "Hemd", "25.05.2022", "open", "29.95", "Ruedi Thomas"));
        this.orderList.add(new Order(4L, "Waschen", "Teppich", "26.08.2021", "pending", "55.00", "Marianne Flury"));
        this.orderList.add(new Order(5L, "Trocknen", "Brautkleid", "17.09.2021", "closed", "40.85", "Dominik Grossenbacher"));
    }

    /**
     * This method implements and returns a list of order objects
     * @return List<Order> list of orders
     * @throws IOException
     */
    @Override
    public List<Order> getOrders() throws IOException {
        return this.orderList;
    }

    /**
     * This method searches for orders in list based on a search word and returns a list of found order objects
     * @param searchOrderValue search text
     * @return List<Order> list of found orders
     */
    @Override
    public List<Order> searchOrders(@RequestBody final String searchOrderValue) {
        List<Order> updatedOrderList = new ArrayList<>();
        try {
            for (Order order: this.orderList) {
                if (order.getOrderStatus().contains(searchOrderValue)) {
                    updatedOrderList.add(order);
                }
            }
        } catch (Exception exception) {
            // Logger would be the perfect solution here!
            System.out.println("Exception has happened while searching an order in the order list!");
        }
        return updatedOrderList;
    }
}

