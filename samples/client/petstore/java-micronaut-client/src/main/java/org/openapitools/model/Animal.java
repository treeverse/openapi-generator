/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Animal
 */
@JsonPropertyOrder({
  Animal.JSON_PROPERTY_CLASS_NAME,
  Animal.JSON_PROPERTY_COLOR
})
@JsonTypeName("Animal")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", comments = "Generator version: 7.12.0-SNAPSHOT")
@JsonIgnoreProperties(
  value = "className", // ignore manually set className, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the className to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "className", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = BigCat.class, name = "BigCat"),
  @JsonSubTypes.Type(value = Cat.class, name = "Cat"),
  @JsonSubTypes.Type(value = Dog.class, name = "Dog"),
})

@Introspected
public class Animal {
    public static final String JSON_PROPERTY_CLASS_NAME = "className";
    protected String className;

    public static final String JSON_PROPERTY_COLOR = "color";
    private String color = "red";

    public Animal() {
    }
    public Animal className(String className) {
        this.className = className;
        return this;
    }

    /**
     * Get className
     * @return className
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_CLASS_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getClassName() {
        return className;
    }

    @JsonProperty(JSON_PROPERTY_CLASS_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setClassName(String className) {
        this.className = className;
    }

    public Animal color(String color) {
        this.color = color;
        return this;
    }

    /**
     * Get color
     * @return color
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_COLOR)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getColor() {
        return color;
    }

    @JsonProperty(JSON_PROPERTY_COLOR)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Animal animal = (Animal) o;
        return Objects.equals(this.className, animal.className) &&
            Objects.equals(this.color, animal.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(className, color);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Animal {\n");
        sb.append("    className: ").append(toIndentedString(className)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    /**
     * Accept the visitor and invoke it for the specific Animal type.
     *
     * @param visitor the Animal visitor
     * @param <T> the return type of the visitor
     * @return the result from the visitor
     */
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitAnimal(this);
    }

    /**
     * A Animal visitor implementation allows visiting the various Animal types.
     *
     * @param <R> the return type of the visitor
     */
    public interface Visitor<R> {
        R visitBigCat(BigCat value);
        R visitCat(Cat value);
        R visitDog(Dog value);
        R visitAnimal(Animal value);
    }

}

