package ch.prodyna.cleanitbackend.api;

import ch.prodyna.cleanitbackend.model.Order;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.IOException;
import java.util.List;

import static ch.prodyna.cleanitbackend.common.OrderApiConstants.PATH_ORDERS_READ;
import static ch.prodyna.cleanitbackend.common.OrderApiConstants.PATH_ORDER_SEARCH;

/**
 * The OrderService class is an interface class that will be implemented by the OrderServiceImpl class
 *
 * @author  Biniam Ghebrehiwet
 * @version 1.0
 * @since   22.06.2022
 */
@Service
public interface OrderService {

    /**
     * This method reads and returns all orders as a list
     * @return List<Order> orders in a list
     * @throws IOException
     */
    @GetMapping(PATH_ORDERS_READ)
    List<Order> getOrders() throws IOException;

    /**
     * This method search orders based on a string/text value and returns an order list
     * @param searchOrderValue search text
     * @return List<Order> order list that matches the search text
     */
    @PostMapping(PATH_ORDER_SEARCH)
    List<Order> searchOrders(@RequestBody final String searchOrderValue);

}
