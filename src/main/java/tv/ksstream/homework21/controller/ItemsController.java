package tv.ksstream.homework21.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tv.ksstream.homework21.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class ItemsController {
    private final OrderService orderService;
    public ItemsController(OrderService orderService) {
        this.orderService = orderService;
    }
    @GetMapping("/add")
    public List<Integer> addItems(@RequestParam List<Integer> idItems) {
        return orderService.addItems(idItems);
    }
    @GetMapping("/get")
    public List<Integer> getItems() {
        return orderService.getItems();
    }
}
