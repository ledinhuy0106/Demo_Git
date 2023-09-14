package com.example.demo.common.gencode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class GencodeRepositoryService {
    public static void writeClassRepositorys(ObjectEntity objectEntity) {
        String className = objectEntity.getClassName();
        List<MethodEntity> repositoryMethods = objectEntity.getListMethod();

        StringBuilder code = new StringBuilder();

        code.append("package com.example.demo.repository;\n");
        code.append("import org.springframework.data.repository.CrudRepository;\n");
        code.append("import org.springframework.stereotype.Repository;\n\n");

        code.append("public interface ").append(className).append("RepositoryService {\n\n");

        // Generate repository methods
        for (MethodEntity method : repositoryMethods) {
            code.append(" List<").append(className).append("> ").append(method.getMethod()).append("(");

            for (MethodEntity parameter : repositoryMethods) {
                code.append(parameter.getParameters());
            }

            code.append(");\n");
        }

        code.append("}");
        String saveDirectory = "C:\\Users\\user\\Desktop\\jv03\\demo2\\src\\main\\java\\com\\example\\demo\\repository";

        String codeString = code.toString();

        try {
            // Lưu mã nguồn vào tệp
            String fileName = className + "RepositoryService.java";
            Path filePath = Paths.get(saveDirectory, fileName);
            Files.write(filePath, codeString.getBytes());

            System.out.println("Đã lưu mã nguồn vào: " + filePath.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(code.toString());
    }
}
