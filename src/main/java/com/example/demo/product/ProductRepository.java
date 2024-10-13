package com.example.demo.product;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductRepository {
    //db처럼 사용, 추후 db와 연결예정
    private Map<Integer, Product> db = new HashMap<>();
    private int id = 1;

    public Product findProduct(int idx){
        return db.get(idx);
    }

    public void saveProduct(Product product){
        System.out.println(product.getName());
        db.put(id++, product);
    }

    //1. 상품 수정, 삭제
    //2. @Configuration, @Bean 조합
    //3. Entity vs DTO
    //4. DB연결(JPA?)
    //5. AOP
}
