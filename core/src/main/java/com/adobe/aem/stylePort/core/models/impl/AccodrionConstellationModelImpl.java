// package com.adobe.aem.stylePort.core.models.impl;

// import com.adobe.aem.stylePort.core.models.AccodrionConstellationModel;
// import com.adobe.cq.export.json.ComponentExporter;
// import com.adobe.cq.export.json.ExporterConstants;
// import org.apache.sling.api.SlingHttpServletRequest;
// import org.apache.sling.models.annotations.DefaultInjectionStrategy;
// import org.apache.sling.models.annotations.Exporter;
// import org.apache.sling.models.annotations.Model;
// import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
// import org.osgi.resource.Resource;


// @Model(
//     adaptables = {Resource.class, SlingHttpServletRequest.class},  
//     adapters = {AccodrionConstellationModel.class, ComponentExporter.class},
//     resourceType = "stylePort/components/content/accordion-constellation/v1/accordion-constellation",
//     defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
// )
// @Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
// public class AccodrionConstellationModelImpl implements AccodrionConstellationModel {

//     @ValueMapValue
//      String size;

//     @ValueMapValue
//      String labelWeight;

//     @ValueMapValue
//      String iconPosition;

//     @ValueMapValue
//      String expanded;

//     @ValueMapValue
//      String hasSummary;

//     @ValueMapValue
//      String labelText;

//     @ValueMapValue
//      String summary;

//     @ValueMapValue
//      String content;

//     @ValueMapValue
//      String cfPath;

//     @Override
//     public String getSize() {
//         return size;
//     }

//     @Override
//     public String getLabelWeight() {
//         return labelWeight;
//     }

//     @Override
//     public String getIconPosition() {
//        return iconPosition;
//     }

//     @Override
//     public String isExpanded() {
//        return expanded;
//     }

//     @Override
//     public String isHasSummary() {
//         return hasSummary;
//     }

//     @Override
//     public String getLabelText() {
//        return labelText;
//     }

//     @Override
//     public String getSummary() {
//         return summary;
//     }

//     @Override
//     public String getContent() {
//        return content;
//     }

//     @Override
//     public String getCfPath() {
//         return cfPath;
//     }

// }