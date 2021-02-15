package com.vahe.lombok;

//https://projectlombok.org/

import lombok.*;

//@Getter
//@Setter
////@ToString(exclude = {"age"}, includeFieldNames = true)
//@ToString
////@EqualsAndHashCode(exclude = {"age"})
//@EqualsAndHashCode
//@AllArgsConstructor
//@RequiredArgsConstructor// make constructor for final fields
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private String firstname;
    private String lastname;
    private int age;

}
