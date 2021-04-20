package cn.kgc.test;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author : www
 * @date : 9:52 2021/4/6
 * @introduce :
 */
public class ExcelExport {
    public static void main(String[] args) {
        OutputStream os=null;
        //创建对象XSSFWorkbook
        Workbook excel0 = new XSSFWorkbook();
        //创建sheet工作薄  j93工作薄名
        Sheet sheet0 = excel0.createSheet("j93");
        //创建行
        Row row0 = sheet0.createRow(1);
        //创建列
        Cell cell0 = row0.createCell(1);
        cell0.setCellValue("编号");
        Cell cell1 = row0.createCell(2);
        cell1.setCellValue("姓名");
        Cell cell2 = row0.createCell(3);
        cell2.setCellValue("地址");

        //创建第二行
        Row row1 = sheet0.createRow(2);
        //第二行的列
        Cell cell10 = row1.createCell(1);
        cell10.setCellValue("1");
        Cell cell11 = row1.createCell(2);
        cell11.setCellValue("王威威");
        Cell cell12 = row1.createCell(3);
        cell12.setCellValue("合肥");

        //写出到文档中
        try {
            os = new FileOutputStream("d:\\abc.xlsx");
            excel0.write(os);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
