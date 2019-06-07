package com.nice.com.nice.demo;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PoiTest {

    public static void main(String[] args) {
        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet("我是工作蒲");
        FileOutputStream fileOutputStream ;
        try {
            fileOutputStream = new FileOutputStream("d:/nice.xls");
            wb.write(fileOutputStream);
            wb.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}