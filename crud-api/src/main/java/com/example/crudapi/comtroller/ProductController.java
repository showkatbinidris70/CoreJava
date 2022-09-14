package com.example.crudapi.comtroller;

import com.example.crudapi.service.ProductService;
import com.example.crudapi.model.ProductEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/save")
    private ProductEntity save(@RequestBody ProductEntity productEntity){
    return productService.save(productEntity);
    }
//    http://localhost:8077/product/save



    @GetMapping("/list")
    public List<ProductEntity> fetchProductList()
    {
        return productService.fetchProductList();
    }
//    http://localhost:8077/product/list

    @GetMapping("/findById/{id}")
    public ProductEntity findById(@PathVariable Integer id)
    {
        return productService.findById(id);
    }
    // Update operation
    @PutMapping("/update/{id}")
    public ProductEntity update(@RequestBody ProductEntity productEntity, @PathVariable Integer id){
        return productService.updateProduct(productEntity, id);
    }
//    http://localhost:8077/product/update/{id}

// Delete operation
@DeleteMapping("/delete/{id}")
public String deleteById(@PathVariable Integer id)
{
    productService.deleteProductById(id);
    return "Deleted Successfully";
}
//    http://localhost:8077/product/delete/{id}
}
