package com.example.demo.common.gencode;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public  class MethodEntity {
    private String type;
    private String method;
    private String typeMethod;
    private String parameters;
    private String sql;
}