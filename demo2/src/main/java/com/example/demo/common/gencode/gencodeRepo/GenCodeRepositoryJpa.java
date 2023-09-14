//package com.example.demo.common.gencode;
//
//import java.util.List;
//
//public class GencodeTableRepositorys {
//
//    public static void writeClassRepositorys(ObjectEntity objectEntity) {
//        String className = objectEntity.getClassName();
//        List<MethodEntity> repositoryMethods = objectEntity.getRepositoryMethods();
//
//        StringBuilder code = new StringBuilder();
//
//        code.append("import org.springframework.data.jpa.repository.JpaRepository;\n");
//        code.append("import org.springframework.stereotype.Repository;\n\n");
//
//        code.append("@Repository\n");
//        code.append("public interface ").append(className).append("Repositorys extends JpaRepository<").append(className).append("Entity, Long> {\n\n");
//
//        // Generate repository methods
//        for (MethodEntity method : repositoryMethods) {
//            code.append("    // ").append(method.getDescription()).append("\n");
//            code.append("    ").append(method.getType()).append(" ").append(method.getName()).append("(");
//
//            List<FieldEntity> parameters = method.getParameters();
//            for (int i = 0; i < parameters.size(); i++) {
//                FieldEntity parameter = parameters.get(i);
//                code.append(parameter.getType()).append(" ").append(parameter.getName());
//                if (i < parameters.size() - 1) {
//                    code.append(", ");
//                }
//            }
//
//            code.append(");\n\n");
//        }
//
//        code.append("}");
//
//        System.out.println(code.toString());
//    }
//}
