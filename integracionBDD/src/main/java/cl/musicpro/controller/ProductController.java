package cl.musicpro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products-db")
public class ProductController {
    @Autowired
    ProductController productController;

    @GetMapping(path = "/producto", produces = MediaTyp)
    
}
