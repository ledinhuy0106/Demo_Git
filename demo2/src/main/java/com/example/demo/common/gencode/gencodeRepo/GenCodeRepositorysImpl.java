package com.example.demo.common.gencode;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class GencodeRepositorysImpl {

    public static void writeClassRepositorys(ObjectEntity objectEntity) {
        String className = objectEntity.getClassName();
        List<MethodEntity> repositoryMethods = objectEntity.getListMethod();

        StringBuilder code = new StringBuilder();

        code.append("package com.example.demo.service;\n\n");
        code.append("import org.springframework.stereotype.Repository;\n\n");

        code.append("@Repository\n");
        code.append("public class ").append(className).append("RepositoryImpl implements ").append(className).append("RepositoryService {\n\n");

        // Generate repository methods
        for (MethodEntity method : repositoryMethods) {
            code.append("    @Override\n");
            code.append("    public ").append(method.getType()).append("  ").append(method.getMethod()).append("(");

            for (int i = 0; i < repositoryMethods.size(); i++) {
                MethodEntity parameter = repositoryMethods.get(i);
                code.append(parameter.getParameters());
                if (i < repositoryMethods.size() - 1) {
                    code.append(", ");
                }
            }

            code.append(") {\n");
            code.append("        // TODO: Implement ").append(method.getMethod()).append(" method\n");
            code.append("        return null;\n");
            code.append("    }\n\n");
        }
        code.append("}");
        String saveDirectory = "C:\\Users\\user\\Desktop\\jv03\\demo2\\src\\main\\java\\com\\example\\demo\\repository";

        String codeString = code.toString();

        try {
            // Lưu mã nguồn vào tệp
            String fileName = className + "RepositoryImpl.java";
            Path filePath = Paths.get(saveDirectory, fileName);
            Files.write(filePath, codeString.getBytes());

            System.out.println("Đã lưu mã nguồn vào: " + filePath.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(code.toString());
    }
}
