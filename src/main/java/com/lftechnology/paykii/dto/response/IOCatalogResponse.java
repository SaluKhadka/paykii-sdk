package com.lftechnology.paykii.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.lftechnology.paykii.deserializer.ValidLengthsDeserializer;

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
    @JsonDeserialize(using = ValidLengthsDeserializer.class)
    private List<Integer> validLengths;


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("IOCatalogResponse{");
        sb.append("catalogVersion='").append(catalogVersion).append('\'');
        sb.append(", billerId='").append(billerId).append('\'');
        sb.append(", skuId='").append(skuId).append('\'');
        sb.append(", ioId='").append(ioId).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", operation=").append(operation);
        sb.append(", name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", datatype='").append(datatype).append('\'');
        sb.append(", minLength=").append(minLength);
        sb.append(", maxLenth=").append(maxLenth);
        sb.append(", validLengths=").append(validLengths);
        sb.append('}');
        return sb.toString();
    }
}


/**Type of data field*/
enum Type {
    Input(0),
    Output(1);

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

    public static Type forCode(int code) {
        for (Type element : values()) {
            if (element.value == code) {
                return element;
            }
        }
        return null;
    }

    @JsonCreator
    public static Type forValue(Integer v) {
        return Type.forCode(v);
    }
}


/**Type of operation that uses this Input/Output.*/
enum Operation{
    Inquiry(0),
    Payment(1),
    Both(2);

    private Integer value;

    @JsonValue
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
