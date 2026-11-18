package com.productos.ropa.service;

import com.productos.ropa.dto.ProductoApiDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class FakeStoreService {

    private static final String API_URL = "https://fakestoreapi.com/products";

    public List<ProductoApiDTO> obtenerProductosExternos() {
        RestTemplate restTemplate = new RestTemplate();
        ProductoApiDTO[] respuesta = restTemplate.getForObject(API_URL, ProductoApiDTO[].class);

        if (respuesta != null) {
            return Arrays.asList(respuesta);
        }
        return Collections.emptyList();
    }

    public Double calcularTotalPrecios(List<ProductoApiDTO> productos) {
        return productos.stream()
                .mapToDouble(ProductoApiDTO::getPrice)
                .sum();
    }
}
