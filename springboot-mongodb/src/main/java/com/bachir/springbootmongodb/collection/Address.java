package com.bachir.springbootmongodb.collection;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder

public class Address  {
    private String address1;
    private String address2;
    private String city;
}
