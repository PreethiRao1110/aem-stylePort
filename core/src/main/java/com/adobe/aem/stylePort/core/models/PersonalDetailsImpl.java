package com.adobe.aem.stylePort.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class PersonalDetailsImpl {

    @ValueMapValue
    private String authorname;

    @ChildResource
    private List<BookDetails> bookdetailswithmap;

    public String getAuthorname() {
        return authorname;
    }

    public List<BookDetails> getBookdetailswithmap() {
        return bookdetailswithmap;
    }
}
