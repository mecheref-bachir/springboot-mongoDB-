package com.bachir.springbootmongodb.collection;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "photo")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class Photo {
    @Id
    private String id;
    private String title;
    private Binary photo;
}
