package com.adobe.aem.stylePort.core.models.impl;

import com.adobe.aem.stylePort.core.models.ProductDetails;
import com.adobe.aem.stylePort.core.models.ProductList;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

import java.util.List;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        adapters = ProductDetails.class)
public class ProductDetailsImpl implements ProductDetails {

    @ChildResource
    private List<ProductList> productList;

    @Override
    public List<ProductList> getProductList() {
        return productList;
    }
}
