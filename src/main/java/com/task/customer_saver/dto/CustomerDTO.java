package com.task.customer_saver.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerDTO {
    private String name;

    private String cluster;

    private String email;

    private String phone;
}
