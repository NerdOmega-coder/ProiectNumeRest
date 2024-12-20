package com.numele_tau.proiect_nume;

import java.util.List;

public class Order {
    private Long id;

    
    private User user;

    
    private List<Product> products;

    
    public Order() {}
    public Order(Long id, User user, List<Product> products) {
        this.id = id;
        this.user = user;
        this.products = products;
    }

  
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

  
    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", user=" + user +
                ", products=" + products +
                '}';
    }
}
