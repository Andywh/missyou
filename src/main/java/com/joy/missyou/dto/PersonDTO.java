package com.joy.missyou.dto;

import lombok.*;
import org.hibernate.validator.constraints.Length;

/**
 * Created by SongLiang on 2020-02-27
 * DTO 数据传输对象
 */
//@Getter
//@Setter
////@AllArgsConstructor
//@NoArgsConstructor
@Builder
@Getter
//@NoArgsConstructor
public class PersonDTO {
//    @NonNull
    private String name;
    private Integer age;

}
