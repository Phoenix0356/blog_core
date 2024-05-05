package com.phoenix.blog.model.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class CollectionDTO {
    String collectionUsername;
    String collectionName;
    String collectionDescription;
}