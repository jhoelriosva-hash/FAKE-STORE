package com.productos.ropa.controller;

import com.productos.ropa.dto.ProductoApiDTO;
import com.productos.ropa.service.FakeStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/reportes")
public class ProductoApiController {

    @Autowired
    private FakeStoreService fakeStoreService;

    @GetMapping("/reporte-api")
    public String mostrarReporteApi(Model model) {
        List<ProductoApiDTO> productos = fakeStoreService.obtenerProductosExternos();
        Double totalPrecios = fakeStoreService.calcularTotalPrecios(productos);

        model.addAttribute("productos", productos);
        model.addAttribute("totalRegistros", productos.size());
        model.addAttribute("totalPrecios", totalPrecios);

        return "reporte-api";
    }
}
