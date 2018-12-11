package com.lftechnology.paykii.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class IOCatalogResponse extends Response {

    @JsonProperty(value = "CatalogVersion")
    private String catalogVersion;

    @JsonProperty(value = "BillerID")
    private String billerId;

    @JsonProperty(value = "SKU")
    private String skuId;

    @JsonProperty(value = "IOID")
    private String ioId;

    @JsonProperty(value = "Type")
    private Type type;

    @JsonProperty(value = "Operation")
    private Operation operation;

    @JsonProperty(value="Name")
    private String name;

    @JsonProperty(value = "Description")
    private String description;

    @JsonProperty(value = "Datatype")
    private String datatype;

    @JsonProperty(value = "MinLength")
    private Integer minLength;

    @JsonProperty(value = "MaxLength")
    private Integer maxLenth;

    @JsonProperty(value = "ValidLengths")
    private List<Integer> validLengths;

}


/**Type of data field*/
enum Type{
    Input (1),
    Ouput (2);

    private Integer value;

    Integer getValue() {
        return value;
    }

    void setValue(Integer value) {
        this.value = value;
    }

    Type(Integer value)
    {
        this.value = value;
    }
}

/**Type of operation that uses this Input/Output.*/
enum Operation{
    Inquiry(0),
    Payment(1),
    Both(2);

    private Integer value;

    Integer getValue() {
        return value;
    }

    void setValue(Integer value) {
        this.value = value;
    }

    Operation(Integer value)
    {
        this.value = value;
    }
}
