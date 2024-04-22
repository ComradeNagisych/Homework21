package tv.ksstream.homework21.service;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Component
@SessionScope
public class Cart {
    private final List<Integer> items;
    public Cart() {
        this.items = new ArrayList<>();
    }
    public List<Integer> addItems(List<Integer> idItems) {
        items.addAll(idItems);
        return getItems();
    }

    public List<Integer> getItems() {
        return Collections.unmodifiableList(items);
    }
}
