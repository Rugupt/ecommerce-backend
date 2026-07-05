package com.ecommerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Blob;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)          //used to generate values for id automatically using strategy
    private long id;
    private String fileName;
    private String fileType;
    @Lob                                                        //used to tell hibernate that this field stores large object
    private Blob image;                                        //(BINARY LARGE OBJECT) Blob is a SQL datatype that is used to store image,videos and pdf
    private String downloadUrl;
    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product;
}
