package com.techm.springcasendra.Controller;

import com.techm.springcasendra.domain.Product;
import com.techm.springcasendra.repositories.ProductRepository;
import com.techm.springcasendra.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private ProductRepository productRepository;

    @RequestMapping({"/product/list", "/product"})
    public List<Product> listProducts(Model model) {
        model.addAttribute("products", productService.listAll());
        return productService.listAll();
    }


    @RequestMapping(value = "/productsave", method = RequestMethod.POST)
    public String saveProduct(@RequestBody Product productForm) {


        Product savedProduct = productService.saveOrUpdate(productForm);

        return savedProduct.toString();
    }


    @RequestMapping("/product/delete/{id}")
    public String delete(@PathVariable String id) {
        productService.delete(UUID.fromString(id));
        return "redirect:/product/list";
    }
    @RequestMapping("/price/{price}")
    public List<Product> getbyprice(@PathVariable int price)
    {
        return productRepository.findByPrice(price);
    }


}
