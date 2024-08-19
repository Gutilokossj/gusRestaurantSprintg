package br.com.gusrestaurantspring.models.dtos;

import br.com.gusrestaurantspring.models.enums.MenuItem;

public record DishDto (String description, String name, double price, MenuItem menuItens) {
}
