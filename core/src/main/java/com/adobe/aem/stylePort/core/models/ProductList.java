package com.adobe.aem.stylePort.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;


@Model(adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ProductList {

    @ValueMapValue
    private String productName;

    @ValueMapValue
    private String productDescription;

    @ValueMapValue
    private Double productPrice;

    @ChildResource
    private List<ProductSpecification> productSpecification;

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public List<ProductSpecification> getProductSpecification() {
        return productSpecification;
    }
}
