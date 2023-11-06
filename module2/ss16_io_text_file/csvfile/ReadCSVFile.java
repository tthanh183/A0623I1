package ss16_io_text_file.csvfile;

import java.io.*;
import java.util.ArrayList;

public class ReadCSVFile {
    public static void readCSVFile(String pathFile) {
        File srcFile = new File(pathFile);
        if( !srcFile.exists() ) {
            System.out.println("File không tồn tại");
        }
        ArrayList<Country> countries = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(srcFile));
            String line = "";
            while ((line = bufferedReader.readLine()) != null ) {
                String[] token = line.split(",");
                Country tmp = new Country(token[0], token[1], token[2]);
                countries.add(tmp);
            }
            bufferedReader.close();
        }catch (FileNotFoundException exception) {
            System.out.println("Không tìm thầy file");
        } catch (IOException e) {
            System.out.println("Lỗi đọc ghi file");
        }
        for (Country c: countries) {
            System.out.println(c);
        }

    }
    public static void main(String[] args) {
        String srcFile = "D:\\intelliJ\\untitled\\src\\ss16_io_text_file\\csvfile\\text.csv";
        readCSVFile(srcFile);
    }
}
