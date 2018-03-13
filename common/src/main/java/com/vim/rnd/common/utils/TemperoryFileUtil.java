package com.vim.rnd.common.utils;

import java.io.File;

public class TemperoryFileUtil {

    //private File file = null;

//        public static TempFileCreator createFile(String filename) throws Exception {
//            file = File.createTempFile(filename, ".tmp");
//        }

    public File createTempFileWithContent(File file, StringBuffer content)  throws Exception {
        //        Set<PosixFilePermission> permissions = PosixFilePermissions.fromString("rwxrwxrwx");
//        FileAttribute<Set<PosixFilePermission>> attrs = PosixFilePermissions
//                .asFileAttribute(permissions);
//        FileAttribute<?>[] attrs = {};
//        Path path = Files.createTempFile("stringFromFile", "test", attrs);
//        System.out.print(path.getFileName());
        return null;
    }

//        public File createTempFileWithContent(String filename, StringBuffer content)  throws Exception {
//
//            //create a temp file
//            File temp = File.createTempFile(filename, ".tmp");
//            System.out.println("Temp file : " + temp.getAbsolutePath());
//
//            //delete temporary file when the program is exited
//            temp.deleteOnExit();
//
//            //write to it
//            BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
//            bw.write(content.toString());
//            //bw.write("This is the temporary file content\n");
//            bw.close();
//
//            //read contents
//            String str;
//            BufferedReader br = new BufferedReader(new FileReader(temp));
//            while((str = br.readLine()) != null) {
//                System.out.println(str);
//            }
//            br.close();
//            return temp;
//        }
}
