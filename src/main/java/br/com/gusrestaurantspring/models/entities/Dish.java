package br.com.gusrestaurantspring.models.entities;

import br.com.gusrestaurantspring.models.enums.MenuItem;
import org.springframework.data.annotation.Id;

import java.util.UUID;

public class Dish extends MenuItens {

    @Id
    private UUID id;
    private String description;

    public UUID getId(){
        return id;
    }

    public void setId(UUID id){
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
