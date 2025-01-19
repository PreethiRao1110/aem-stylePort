package com.adobe.aem.stylePort.core.models.impl;

import javax.annotation.PostConstruct;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Via;
import org.apache.sling.models.annotations.injectorspecific.ResourcePath;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adobe.aem.stylePort.core.models.Author;
import com.day.cq.wcm.api.Page;

@Model(adaptables = SlingHttpServletRequest.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        adapters = Author.class)
public class AuthorImpl implements Author{

    private static final Logger LOG = LoggerFactory.getLogger(AuthorImpl.class);

    @ValueMapValue
    String fname;

    @ValueMapValue
    String lname;

    @ValueMapValue
    String subject;

    @ScriptVariable
    Page currentPage;

    @ResourcePath(path = "/content/stylePort/us/en/writer-info") 
    @Via("resource")
    Resource resourceAbc;

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

    public String getPageTitle(){
        return currentPage.getTitle();
    }

    public String getHomePageName() {
        return resourceAbc.getName();
    }

    @PostConstruct
    protected void init(){
        LOG.info(" \n Inside init method {} : {}" , currentPage.getTitle() , resourceAbc.getPath());
    }
}
