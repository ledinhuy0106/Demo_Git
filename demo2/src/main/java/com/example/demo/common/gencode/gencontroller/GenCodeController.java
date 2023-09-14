package com.example.demo.common.gencode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class GencodeController {

    public static void writeClassController(ObjectEntity objectEntity) {
        String className = objectEntity.getClassName();
        List<MethodEntity> controllerMethods = objectEntity.getListMethod();

        StringBuilder code = new StringBuilder();
        code.append("package com.example.demo.controller;\n");
        code.append("import org.springframework.http.ResponseEntity;\n");
        code.append("import org.springframework.web.bind.annotation.*;\n\n");
        code.append("import com.example.demo.common.sqlcommon.Constants;\n");
        code.append("import com.example.demo.entity.model.").append(className).append(";\n");

        code.append("@RestController\n");
        code.append("@RequestMapping(Constants.API_V1 + \"").append(className.toLowerCase()).append("\")\n");
        code.append("public class ").append(className).append("Controller {\n\n");

        for (MethodEntity method : controllerMethods) {
            code.append("    @").append(capitalizeFirstLetter(method.getType())).append("Mapping").append("(\"").append(method.getParameters()).append("\")\n");
            code.append("    public ResponseEntity<").append(className).append(">").append(" ").append(method.getMethod()).append("(");
            code.append("@RequestParam(\"").append(method.getMethod()).append("\") ").append(method.getMethod());
            code.append(") {\n");
            code.append("        // TODO: Implement ").append(method.getMethod()).append(" method\n");
            code.append("        return ResponseEntity.ok().build();\n");
            code.append("    }\n\n");
        }

        code.append("}");
        // Thay đổi thư mục đích
        String saveDirectory = "C:\\Users\\user\\Desktop\\jv03\\demo2\\src\\main\\java\\com\\example\\demo\\controller";

        String codeString = code.toString();

        try {
            // Lưu mã nguồn vào tệp
            String fileName = className + "Controller.java";
            Path filePath = Paths.get(saveDirectory, fileName);
            Files.write(filePath, codeString.getBytes());

            System.out.println("Đã lưu mã nguồn vào: " + filePath.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
     static String capitalizeFirstLetter(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return Character.toUpperCase(input.charAt(0)) + input.substring(1);
    }

}
