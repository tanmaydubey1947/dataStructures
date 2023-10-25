package arrays;

import javax.xml.bind.annotation.XmlElement;

public class ExternalInstrument {

    @XmlElement(required = true)
    protected String instrumentType;

    protected String instrumentSubtype;
    protected String instrumentName;
    protected String instrumentBrand;
    protected String clientReferenceId;

    public String getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    public String getInstrumentSubtype() {
        return instrumentSubtype;
    }

    public void setInstrumentSubtype(String instrumentSubtype) {
        this.instrumentSubtype = instrumentSubtype;
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    public String getInstrumentBrand() {
        return instrumentBrand;
    }

    public void setInstrumentBrand(String instrumentBrand) {
        this.instrumentBrand = instrumentBrand;
    }

    public String getClientReferenceId() {
        return clientReferenceId;
    }

    public void setClientReferenceId(String clientReferenceId) {
        this.clientReferenceId = clientReferenceId;
    }
}
