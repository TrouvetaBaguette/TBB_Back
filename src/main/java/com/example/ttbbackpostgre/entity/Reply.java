package com.example.ttbbackpostgre.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name= "Reply_Table")
@NoArgsConstructor
@Entity
public class Reply {
    @Id
    private long id_comment;
    private String content;

    private Reply (long id_comment, String content){
        this.id_comment=id_comment;
        this.content = content;
    }

    public long getId_comment() { return id_comment; }

    public String getContent() { return content; }
}
