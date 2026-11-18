# Práctica 06 – Spring Boot + Fake Store API

Proyecto: `com.productos:ropa` (Java 17, WAR, Spring Boot 3.5.0)

## Ejecutar
```bash
mvn spring-boot:run
```
Abrir en el navegador: http://localhost:8080/reportes/reporte-api

## Estructura
- `dto/ProductoApiDTO`        -> modelo del JSON de la API
- `service/FakeStoreService`  -> consume https://fakestoreapi.com/products con RestTemplate
- `controller/ProductoApiController` -> expone /reportes/reporte-api
- `templates/reporte-api.html` -> reporte (Thymeleaf + Bootstrap)
