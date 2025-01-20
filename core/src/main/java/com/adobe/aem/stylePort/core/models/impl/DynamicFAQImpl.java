package com.adobe.aem.stylePort.core.models.impl;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adobe.aem.stylePort.core.models.DynamicFAQModel;
import com.adobe.aem.stylePort.core.models.FAQ;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        adapters = DynamicFAQModel.class)
public class DynamicFAQImpl implements DynamicFAQModel {

    private static final Logger LOG = LoggerFactory.getLogger(DynamicFAQImpl.class);

    @ValueMapValue
    private String heading;

    @ValueMapValue
    private String categories;

    @ValueMapValue
    private int num; 

    private List<FAQ> filteredFAQs;

    private static final String FAQ_API_URL= "http://localhost:3000/FAQ";

    @PostConstruct
    protected void init(){
        LOG.info("Initializing DynamicFAQImpl...");
        List<FAQ> allFaqs = fetchFAQsFromAPI();
        LOG.info("Fetched FAQs: {}", allFaqs);
        this.filteredFAQs = filterAndLimitFAQ(allFaqs);
        LOG.info("Filtered FAQs: {}", filteredFAQs);
    }


    @Override
    public List<FAQ> getFilteredFAQs(){
        return filteredFAQs;
    }

    public List<FAQ> fetchFAQsFromAPI(){
        List<FAQ> faqs = new ArrayList<>();
    try {
        URL url = new URL(FAQ_API_URL);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        ObjectMapper mapper = new ObjectMapper();
        faqs = mapper.readValue(connection.getInputStream(), new TypeReference<List<FAQ>>() {});
            } catch (IOException e) {
                LOG.error("Error fetching FAQs from API at {}: {}", FAQ_API_URL, e.getMessage(), e);
            } catch (Exception e) {
                LOG.error("Unexpected error occurred while fetching FAQs: {}", e.getMessage(), e);
            }
        return faqs;
    }

    private List<FAQ> filterAndLimitFAQ(List<FAQ> allFaqs){
        LOG.info("Filtering FAQs for category: {} and limit: {}", categories, num);
        return allFaqs.stream()
                .filter(faq -> faq.getCategory().equalsIgnoreCase(categories))
                .limit(num)
                .collect(Collectors.toList());
    }

    @Override
    public String getHeading() {
        return heading;
    }
    
}
