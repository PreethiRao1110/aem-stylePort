// package com.adobe.aem.stylePort.core.models;


//  public interface AccodrionConstellationModel {

//      String getSize();

//      String getLabelWeight();

//      String getIconPosition();

//      String isExpanded();

//      String isHasSummary();

//      String getLabelText();

//      String getSummary();

//      String getContent();

//      String getCfPath();
// }

package com.adobe.aem.stylePort.core.models;

import com.adobe.aem.stylePort.core.models.AccodrionConstellationModel;
import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.osgi.resource.Resource;


@Model(
    adaptables = {Resource.class, SlingHttpServletRequest.class},
    resourceType = "stylePort/components/accordion-constellation/v1/accordion-constellation",  
    adapters = {AccodrionConstellationModel.class, ComponentExporter.class},
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class AccodrionConstellationModel implements ComponentExporter {

    @ValueMapValue
    private String size;

    @ValueMapValue
    private String labelWeight;

    @ValueMapValue
    private String iconPosition;

    @ValueMapValue
    private String expanded;

    @ValueMapValue
    private String hasSummary;

    @ValueMapValue
    private String labelText;

    @ValueMapValue
    private String summary;

    @ValueMapValue
    private String content;

    @ValueMapValue
    private String cfPath;


    public String getSize() {
        return size;
    }


    public String getLabelWeight() {
        return labelWeight;
    }


    public String getIconPosition() {
       return iconPosition;
    }


    public String isExpanded() {
       return expanded;
    }


    public String isHasSummary() {
        return hasSummary;
    }


    public String getLabelText() {
       return labelText;
    }


    public String getSummary() {
        return summary;
    }


    public String getContent() {
       return content;
    }

    public String getCfPath() {
        return cfPath;
    }

    @Override
    public String getExportedType() {
        return "stylePort/components/accordion-constellation";
    }

}