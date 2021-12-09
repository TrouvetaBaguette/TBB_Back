package com.example.ttbbackpostgre.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.format.DateTimeFormatter;

@Data
@Table(name= "Comment_Table")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Comment {
    @Id
    @GeneratedValue
    private long id_comment;
    private long id_client;
    private long id_bakery;
    private long id_product;
    private String nameProduct;
    private String note;
    private String content;
    private String title;
    private DateTimeFormatter date;
    private Reply fils;
    private Boolean ifReply;

    private Comment (long id_comment,long id_client, long id_bakery,long id_product, String nameProduct, String note, String content, String title, Reply fils ){
        this.id_comment = id_comment;
        this.id_client = id_client;
        this.id_bakery = id_bakery;
        this.id_product = id_product;
        this.nameProduct = nameProduct;
        this.note = note;
        this.content =content;
        this.title = title;
        this.fils=fils;
        this.date = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm");
    }

    public Reply getFils() { return fils; }

    public DateTimeFormatter getDate() { return date; }

    public String getContent() { return content; }

    public long getId_bakery() { return id_bakery; }

    public long getId_client() { return id_client; }

    public long getId_comment() { return id_comment; }

    public long getId_product() { return id_product; }

    public String getNameProduct() { return nameProduct; }

    public String getNote() { return note; }

    public String getTitle() { return title; }

    public Boolean getIfReply() { return ifReply; }

    public void setFils(Reply fils) { this.fils = fils; }

}
