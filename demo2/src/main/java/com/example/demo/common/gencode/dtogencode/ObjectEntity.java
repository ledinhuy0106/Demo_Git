package com.example.demo.common.gencode;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ObjectEntity {
    private String className;
    private String desc;
    private List<MethodEntity> listMethod;
    List<Fields> listField;
}