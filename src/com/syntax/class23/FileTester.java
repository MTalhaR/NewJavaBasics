package com.syntax.class23;

/*
Create a class File that will have the following behaviors: open, edit, close. Edit and close are implemented method
while open is an abstract. Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation
of open behaviour: Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft
word to be installed etc
 */
public class FileTester {
    public static void main(String[] args) {
      /* File[] file = {new JavaFile(), new WordFile(), new PdfFile()};
        for (File ans : file) {
            ans.open();
        }
        File obj=new PdfFile();
        obj.open();*/

        int[] arr=new int[5];
       File obj=new PdfFile(); //upcasting



       /* File file1=new JavaFile(); //upcasting
        file1.open();
        file1.edit();
        file1.close();*/
    }
}
abstract class File {
    abstract void open();
    void edit() {
        System.out.println("Edit the file");
    }
    public void close() {
        System.out.println("Close the file");
    }
}
class JavaFile extends File {
    @Override
    void open() {
        System.out.println("To open .java file we need notepad++ or sublime text");
    }
}
class WordFile extends File {
    @Override
    void open() {
        System.out.println("to open .doc file we need Microsoft word to be installed");
    }
}
class PdfFile extends File {
    @Override
    void open() {
        System.out.println("To open .pdf file we need Adobe reader to be installed");
    }
}
