package com.hyl.umis;

import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@ToString
@Component
public class Employee {
    @Value("小明")
    private String name;
}
