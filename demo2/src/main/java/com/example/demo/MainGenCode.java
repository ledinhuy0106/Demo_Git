package com.example.demo.common.gencode;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainGenCode {

    public static void main(String[] args) throws IOException {
        String strPath = System.getProperty("user.dir") + "\\src\\main\\resources\\";
        Reader reader = Files.newBufferedReader(Paths.get(strPath + "template_gencode.json"));
        gencodeAll(reader);
    }

    private static void gencodeAll(Reader reader) {
        try {
            ObjectEntity itemObject = (ObjectEntity) FunctionCommon.convertJsonToObject(reader, ObjectEntity.class);
            if (itemObject != null) {
//               1 GencodeController.writeClassController(itemObject);
//               2 GencodeDTO.writeClassDTO(itemObject);
//               3GencodeService.writeClassService(itemObject);
//               4GencodeServiceImpl.writeClassService(itemObject);
//                  5GencodeRepositoryService.writeClassRepositorys(itemObject);
                GencodeRepositorysImpl.writeClassRepositorys(itemObject);
//                GencodeTableService.writeClassService(itemObject);
//                GencodeTableRepositorys.writeClassRepositorys(itemObject);
//                GencodeTableEntity.writeClassEntity(itemObject);
            } else {
                System.out.println("Không thể đọc thông tin từ tệp JSON.");
            }
        } catch (Exception ex) {
            Logger.getLogger(GencodeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
