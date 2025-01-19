package com.adobe.aem.stylePort.core.models.impl;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.aem.stylePort.core.models.Author;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        adapters = Author.class)
public class AuthorImpl implements Author{

    @ValueMapValue
    String fname;

    @ValueMapValue
    String lname;

    @ValueMapValue
    String subject;

    @Override
    public String getFName() {
        return fname;
    }

    @Override
    public String getLName() {
        return lname;
    }

    @Override
    public String getSubject() {
        return subject;
    }
    
}
