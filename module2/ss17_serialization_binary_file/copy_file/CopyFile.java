package ss17_serialization_binary_file.copy_file;

import java.io.*;

public class CopyFile {
    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
        String srcFile = "D:\\intelliJ\\untitled\\src\\ss17_serialization_binary_file\\copy_file\\src_file.txt";
        String destFile = "D:\\intelliJ\\untitled\\src\\ss17_serialization_binary_file\\copy_file\\des_file.txt";
        try {
            CopyFile.copyFileUsingStream(new File(srcFile),new File(destFile));
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
