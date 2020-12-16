package com.educandoweb.course.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
public class User implements Serializable {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;

}
