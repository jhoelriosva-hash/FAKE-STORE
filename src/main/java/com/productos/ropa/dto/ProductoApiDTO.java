package com.productos.ropa.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * DTO que representa un producto del JSON de https://fakestoreapi.com/products
 * Se ignoran las propiedades desconocidas (por ejemplo "rating").
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductoApiDTO {

    private Long id;
    private String title;
    private Double price;
    private String description;
    private String category;
    private String image;

    public ProductoApiDTO() {
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }
}
