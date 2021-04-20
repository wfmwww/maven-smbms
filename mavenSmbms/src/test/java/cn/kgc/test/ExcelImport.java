package cn.kgc.test;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author : www
 * @date : 9:51 2021/4/6
 * @introduce :
 */
public class ExcelImport {
    public static void main(String[] args) {
        InputStream is=null;
        try {
            is = new FileInputStream("d:\\abc.xlsx");
            //创建excel对象
            Workbook book = new XSSFWorkbook(is);
            //获取工作薄
            Sheet j93 = book.getSheet("j93");
            //获取行
            Row row = j93.getRow(2);
            //获取单元格
            Cell cell0 = row.getCell(1);
            System.out.println(cell0.getStringCellValue());
            Cell cell1 = row.getCell(2);
            System.out.println(cell1.getStringCellValue());
            Cell cell2 = row.getCell(3);
            System.out.println(cell2.getStringCellValue());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
