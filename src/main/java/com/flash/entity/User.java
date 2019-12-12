package com.flash.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Author: LiLiang
 * @Date: 2019/12/5 13:39
 */
@Data
public class User {

    @TableId(type = IdType.AUTO)
    private Long id;

    //@TableField(condition = SqlCondition.LIKE)
    private String name;


    private Integer age;


    private String email;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime ctime;
    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime gtime;

    private Long parentId;

    @Version
    private Integer version;

    @TableLogic
    @TableField(select = false)
    private Integer invalid;
}
