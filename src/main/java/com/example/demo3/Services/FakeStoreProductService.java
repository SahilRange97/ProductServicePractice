package com.example.demo3.Services;

import com.example.demo3.Dtos.FakeProductServiceDto;
import com.example.demo3.Model.Category;
import com.example.demo3.Model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
public class FakeStoreProductService implements ProductService {
    RestTemplate restTemplate;
    FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    Product convertFakeProductDtoToProduct(FakeProductServiceDto Dto) {
        Product product = new Product();
        product.setId(Dto.getId());
        product.setTitle(Dto.getTitle());
        product.setDescription(Dto.getDescription());
        product.setPrice(Dto.getPrice());
        product.setImage(Dto.getImage());

        Category category = new Category();
        category.setId(Dto.getId());
        category.setTitle(Dto.getCategory());
        product.setCategory(category);
        return product;
    }
    @Override
    public Product getProductById(long id) {
        FakeProductServiceDto fakeProductServiceDto =
                restTemplate.getForObject("https://fakestoreapi.com/products/"+id, FakeProductServiceDto.class);
        if(fakeProductServiceDto == null) {
            return null;
        }
        return convertFakeProductDtoToProduct(fakeProductServiceDto);
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }
}
