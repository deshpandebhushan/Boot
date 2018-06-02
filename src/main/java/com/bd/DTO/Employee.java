package com.sat.DTO;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Employee {

    String name;
    String lastName;
    String company;
    String department;
}
