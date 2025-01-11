package com.adobe.aem.stylePort.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class BookDetails {

    @ValueMapValue
    private String bookname;

    @ValueMapValue
    private String booksubject;

    @ValueMapValue
    private String publishyear;

    public String getBookname() {
        return bookname;
    }

    public String getBooksubject() {
        return booksubject;
    }

    public String getPublishyear() {
        return publishyear;
    }
}
