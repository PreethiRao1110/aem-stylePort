package com.adobe.aem.stylePort.core.models;

import java.util.List;

public interface DynamicFAQModel {

    String getHeading();

    // String getCategories();

    // int getNum();

    List<FAQ> getFilteredFAQs();

} 

