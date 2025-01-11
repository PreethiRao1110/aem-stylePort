package com.adobe.aem.stylePort.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ProductSpecification {

    @ValueMapValue
    private String specificationName;

    @ValueMapValue
    private String specificationValue;

    public String getSpecificationName() {
        return specificationName;
    }

    public String getSpecificationValue() {
        return specificationValue;
    }
}
