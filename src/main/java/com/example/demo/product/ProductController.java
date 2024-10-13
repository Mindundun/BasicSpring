package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class ProductController {
    // "사용자(화면) 요청을 던지면" 그걸 받아서
    // 요청에 맞는 메소드를 실행 시킨다.
    // 그 안에서, 그에 맞는 로직을 수행할 수 있도록 서비스한테 시킴
    @Autowired
    private ProductService productService;
    // 상품 조회
    @RequestMapping(value = "/products/{id}", method= RequestMethod.GET)
    public Product findProduct(@PathVariable("id") int id){
        //ProductService productService= new ProductService();
        return productService.findProduct(id);
    }

    // 상품 등록
    @RequestMapping(value="/products", method = RequestMethod.POST) // 이 조합으로 호출하면 아래의 메소드 실행
    public void saveProduct(@RequestBody Product product){//Product 클래스
            //public void saveProduct(@RequestParam(value="name") String productName){
        //localhost:8080/product?name=_____ => productName
        productService.saveProduct(product);
    }

}
