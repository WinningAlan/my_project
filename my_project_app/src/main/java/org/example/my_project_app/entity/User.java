package org.example.my_project_app.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * (User)表实体类
 *
 * @author makejava
 * @since 2024-04-16 17:45:24
 */
@SuppressWarnings("serial")
@Data
public class User {

    private Integer id;

    private String username;

    private String password;

    @TableField(value = "createTime",fill = FieldFill.INSERT)
    private LocalDateTime create_time;

    @TableField(value = "updateTime",fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime update_time;

}

