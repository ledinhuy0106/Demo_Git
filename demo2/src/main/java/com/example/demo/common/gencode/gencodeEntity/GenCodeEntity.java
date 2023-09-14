package com.example.demo.common.gencode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class GencodeDTO {

    public static void writeClassDTO(ObjectEntity objectEntity) {
        String className = objectEntity.getClassName();
        List<Fields> list=objectEntity.getListField();
        StringBuilder code = new StringBuilder();
        code.append("package com.example.demo.entity.dto;\n" +
                "\n" +
                "import lombok.AllArgsConstructor;\n" +
                "import lombok.Builder;\n" +
                "import lombok.Data;\n" +
                "import lombok.NoArgsConstructor;\n" +
                "\n" +
                "@Data\n" +
                "@NoArgsConstructor\n" +
                "@AllArgsConstructor\n" +
                "@Builder\n");
        code.append("public class ").append(className).append("DTO {\n\n");

        for (Fields fields:list) {
            code.append("private int ").append(fields.getId()).append(";\n");
            code.append("private String ").append(fields.getName()).append(";\n");
        }

        code.append("}");
        String saveDirectory = "C:\\Users\\user\\Desktop\\jv03\\demo2\\src\\main\\java\\com\\example\\demo\\entity\\dto";

        String codeString = code.toString();

        try {
            // Lưu mã nguồn vào tệp
            String fileName = className + "DTO.java";
            Path filePath = Paths.get(saveDirectory, fileName);
            Files.write(filePath, codeString.getBytes());

            System.out.println("Đã lưu mã nguồn vào: " + filePath.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(code.toString());
    }
}
