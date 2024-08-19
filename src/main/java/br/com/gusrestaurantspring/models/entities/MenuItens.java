package br.com.gusrestaurantspring.models.entities;

import br.com.gusrestaurantspring.models.enums.MenuItem;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class MenuItens {

    private MenuItem menuItem;
    private String name;
    private double price;

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(MenuItem menuItem) {
        this.menuItem = menuItem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
