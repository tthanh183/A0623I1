package ss16_io_text_file.copyfiletext;

import java.io.*;

public class CopyFileText {
    public static int charCount(String line) {
        String[] split = line.split(" ");
        int sum = 0;
        for(int i = 0; i < split.length; i++) {
            sum += split[i].length();
        }
        return sum;
    }
    public static void copyFile(String srcFilePath, String desFilePath) {
        File srcFile = new File(srcFilePath);
        File desFile = new File(desFilePath);
        if( !srcFile.exists() ) {
            System.out.println("File gốc không tồn tại!");
        }
        if( !desFile.exists() ) {
            System.out.println("File đích không tồn tại!");
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(srcFile));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(desFile));
            String line = "";
            int charNums = 0;
            while ( (line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                charNums += charCount(line);
                bufferedWriter.write(line);
                bufferedWriter.write("\n");
            }
            bufferedReader.close();
            bufferedWriter.close();
            System.out.println("Số lượng ký tự trong file là: " +charNums);
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thầy file");
        } catch (IOException e) {
            System.out.println("Lỗi đọc ghi file");
        }
    }

    public static void main(String[] args) {
        String desFile = "D:\\intelliJ\\untitled\\src\\ss16_io_text_file\\copyfiletext\\des_file";
        String srcFile = "D:\\intelliJ\\untitled\\src\\ss16_io_text_file\\copyfiletext\\src_file";
        copyFile(srcFile,desFile);
    }
}
