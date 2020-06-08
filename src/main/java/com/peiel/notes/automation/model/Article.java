package com.peiel.notes.automation.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "article")
public class Article {
    @TableId(type = IdType.AUTO)
    private java.lang.Integer id;
    private java.lang.String name;
    private java.lang.String content;
    private java.lang.Integer type;
    private java.lang.Integer isPublic;
    private java.lang.Integer status;
    private java.util.Date updatedTime;
    private java.util.Date createdTime;
}
