package com.lftechnology.paykii.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateDeserializer extends JsonDeserializer<LocalDate> {


    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");

    @Override
    public LocalDate deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return LocalDate.parse(jsonParser.readValueAs(String.class), formatter);
    }
}
