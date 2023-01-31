package com.applayos.assist;

import android.content.Context;
import android.widget.Toast;
import com.sewoo.jpos.printer.ZPLPrinter;
import com.sewoo.jpos.command.ZPLConst;
import java.io.UnsupportedEncodingException;
import java.io.IOException;
import java.util.ArrayList;

public class Sample_Print {

    private ZPLPrinter zplPrinter;
    private Context context;

    public Sample_Print(Context con)
    {
        zplPrinter = new ZPLPrinter();  //Default = English
        //zplPrinter = new ZPLPrinter("EUC-KR"); // Korean.
        //zplPrinter = new ZPLPrinter("GB2312"); //Chinese.
        context = con;
    }

    public void Print_Text(int count, char paper_type) throws UnsupportedEncodingException
    {
        zplPrinter.setupPrinter(ZPLConst.ROTATION_180, paper_type, 384, 480);

        zplPrinter.startPage();
        zplPrinter.setInternationalFont(0);

        zplPrinter.printText(ZPLConst.FONT_A, ZPLConst.ROTATION_0, 15, 12, 0, 0, "FontA 0123");
        zplPrinter.printText(ZPLConst.FONT_B, ZPLConst.ROTATION_0, 15, 12, 0, 30, "FontB 0123");
        zplPrinter.printText(ZPLConst.FONT_C, ZPLConst.ROTATION_0, 15, 12, 0, 60, "FontC 0123");
        zplPrinter.printText(ZPLConst.FONT_D, ZPLConst.ROTATION_0, 15, 12, 0, 90, "FontD 0123");
        zplPrinter.printText(ZPLConst.FONT_E, ZPLConst.ROTATION_0, 15, 12, 0, 120, "FontE 0123");
        zplPrinter.printText(ZPLConst.FONT_F, ZPLConst.ROTATION_0, 15, 12, 0, 160, "FontF 0123");
        zplPrinter.printText(ZPLConst.FONT_G, ZPLConst.ROTATION_0, 15, 12, 0, 210, "FontG 01");
        zplPrinter.printText(ZPLConst.FONT_H, ZPLConst.ROTATION_0, 15, 12, 0, 300, "FontH 01234567");

        zplPrinter.endPage(count);
    }

    public void Print_Image(int count, char paper_type) throws IOException
    {
        zplPrinter.setupPrinter(ZPLConst.ROTATION_180, paper_type, 384, 340);

        zplPrinter.startPage();
        zplPrinter.setInternationalFont(0);
/*
		zplPrinter.printImage("//sdcard//temp//test//sample_2.jpg", 1, 1);
    	zplPrinter.printImage("//sdcard//temp//test//sample_3.jpg", 100, 20);
    	zplPrinter.printImage("//sdcard//temp//test//sample_4.jpg", 120, 155);
*/
        zplPrinter.printImage("//sdcard//temp//test//sample_4.jpg", 0, 0);
        zplPrinter.endPage(count);
    }

    public void Print_1DBarcode(int count, char paper_type) throws UnsupportedEncodingException
    {
        String data = "123456789012";

        ArrayList<String> byParam = new ArrayList<String>();
        byParam.add("2");
        byParam.add("3");
        byParam.add("20");

        zplPrinter.setupPrinter(ZPLConst.ROTATION_180, paper_type, 384, 2000);

        zplPrinter.startPage();
        zplPrinter.setInternationalFont(0);

        zplPrinter.setBarcodeField(byParam);

        zplPrinter.printText(ZPLConst.FONT_B, ZPLConst.ROTATION_0, 10, 10, 0, 70, "Code11");
        zplPrinter.printBarcode(ZPLConst.BARCODE_Code11, null, 10, 10, data);

        zplPrinter.printText(ZPLConst.FONT_B, ZPLConst.ROTATION_0, 10, 10, 0, 150, "Code128");
        zplPrinter.printBarcode(ZPLConst.BARCODE_Code128, null, 10, 100, data);

        zplPrinter.printText(ZPLConst.FONT_B, ZPLConst.ROTATION_0, 10, 10, 0, 250, "Code39");
        zplPrinter.printBarcode(ZPLConst.BARCODE_Code39, null, 10, 200, data);

        zplPrinter.printText(ZPLConst.FONT_B, ZPLConst.ROTATION_0, 10, 10, 0, 350, "Code93");
        zplPrinter.printBarcode(ZPLConst.BARCODE_Code93, null, 10, 300, data);

        zplPrinter.printText(ZPLConst.FONT_B, ZPLConst.ROTATION_0, 10, 10, 0, 450, "EAN13");
        zplPrinter.printBarcode(ZPLConst.BARCODE_EAN13, null, 10, 400, data);

        zplPrinter.printText(ZPLConst.FONT_B, ZPLConst.ROTATION_0, 10, 10, 0, 550, "EAN8");
        zplPrinter.printBarcode(ZPLConst.BARCODE_EAN8, null, 10, 500, "12345");

        zplPrinter.printText(ZPLConst.FONT_B, ZPLConst.ROTATION_0, 10, 10, 0, 650, "Industrial 2OF5");
        zplPrinter.printBarcode(ZPLConst.BARCODE_Industrial_2OF5, null, 10, 600, data);

        zplPrinter.printText(ZPLConst.FONT_B, ZPLConst.ROTATION_0, 10, 10, 0, 750, "Interleaved 2OF5");
        zplPrinter.printBarcode(ZPLConst.BARCODE_Interleaved_2OF5, null, 10, 700, data);

        zplPrinter.printText(ZPLConst.FONT_B, ZPLConst.ROTATION_0, 10, 10, 0, 850, "LOGMARS");
        zplPrinter.printBarcode(ZPLConst.BARCODE_LOGMARS, null, 10, 800, data);

        zplPrinter.printText(ZPLConst.FONT_B, ZPLConst.ROTATION_0, 10, 10, 0, 950, "MSI");
        zplPrinter.printBarcode(ZPLConst.BARCODE_MSI, null, 10, 900, data);

        zplPrinter.printText(ZPLConst.FONT_B, ZPLConst.ROTATION_0, 10, 10, 0, 1050, "PlanetCode");
        zplPrinter.printBarcode(ZPLConst.BARCODE_PlanetCode, null, 10, 1000, data);

        zplPrinter.printText(ZPLConst.FONT_B, ZPLConst.ROTATION_0, 10, 10, 0, 1150, "Plessey");
        zplPrinter.printBarcode(ZPLConst.BARCODE_Plessey, null, 10, 1100, data);

        zplPrinter.printText(ZPLConst.FONT_B, ZPLConst.ROTATION_0, 10, 10, 0, 1250, "POSTNET");
        zplPrinter.printBarcode(ZPLConst.BARCODE_POSTNET, null, 10, 1200, data);

        zplPrinter.printText(ZPLConst.FONT_B, ZPLConst.ROTATION_0, 10, 10, 0, 1350, "Standard 2OF5");
        zplPrinter.printBarcode(ZPLConst.BARCODE_Standard_2OF5, null, 10, 1300, data);

        zplPrinter.printText(ZPLConst.FONT_B, ZPLConst.ROTATION_0, 10, 10, 0, 1450, "UPCA");
        zplPrinter.printBarcode(ZPLConst.BARCODE_UPCA, null, 10, 1400, data);

        zplPrinter.printText(ZPLConst.FONT_B, ZPLConst.ROTATION_0, 10, 10, 0, 1550, "UPCE");
        zplPrinter.printBarcode(ZPLConst.BARCODE_UPCE, null, 10, 1500, data);

        zplPrinter.printPDF417(40, 1600, ZPLConst.ROTATION_0, 5, 5, 23, 'N', "ABCDEFGHIJKLMNOPQRSTUVWXTZ");
        zplPrinter.printQRCode(10, 1800, 2, 5, 'L', "QA,1234567890_QRcode");
        zplPrinter.printDataMatrix(200, 1800, ZPLConst.ROTATION_0, ZPLConst.DM_QUALITY_200, 5, "ABCDEFGHIJKLMNOPQRSTUVWXTZ");

        zplPrinter.endPage(count);
    }

    public void Print_2DBarcode(int count, char paper_type) throws UnsupportedEncodingException
    {
        zplPrinter.setupPrinter(ZPLConst.ROTATION_180, paper_type, 384, 400);

        zplPrinter.startPage();
        zplPrinter.setInternationalFont(0);

        zplPrinter.printPDF417(40, 10, ZPLConst.ROTATION_0, 5, 5, 23, 'N', "ABCDEFGHIJKLMNOPQRSTUVWXTZ");
        zplPrinter.printQRCode(10, 180, 2, 5, 'L', "QA,1234567890_QRcode");
        zplPrinter.printDataMatrix(200, 180, ZPLConst.ROTATION_0, ZPLConst.DM_QUALITY_200, 5, "ABCDEFGHIJKLMNOPQRSTUVWXTZ");

        zplPrinter.endPage(count);
    }

    public void Print_Geometry(int count, char paper_type) throws UnsupportedEncodingException
    {
        zplPrinter.setupPrinter(ZPLConst.ROTATION_180, paper_type, 384, 300);

        zplPrinter.startPage();
        zplPrinter.setInternationalFont(0);

        zplPrinter.printCircle(40,40, 70, 2, ZPLConst.LINE_COLOR_B);
        zplPrinter.printDiagonalLine(30, 30, 100, 100, 7, ZPLConst.LINE_COLOR_B, ZPLConst.DIAGONAL_L);
        zplPrinter.printEllipse(10, 10, 300, 200, 2, ZPLConst.LINE_COLOR_B);
        zplPrinter.printRectangle(120, 10, 120, 80, 10, ZPLConst.LINE_COLOR_B, 0);
        zplPrinter.printRectangle(120, 100, 120, 80, 10, ZPLConst.LINE_COLOR_B, 8);
        zplPrinter.endPage(count);
    }

    public void Print_UTF8(int count, char paper_type) throws UnsupportedEncodingException
    {
        zplPrinter.setCharSet("UTF-8");

        zplPrinter.setupPrinter(ZPLConst.ROTATION_180, paper_type, 384, 460);
        zplPrinter.startPage();
        zplPrinter.setInternationalFont(24);

        zplPrinter.printText(ZPLConst.FONT_1, ZPLConst.ROTATION_0, 16, 16, 0, 0, "汉语 漢語");
        zplPrinter.printText(ZPLConst.FONT_1, ZPLConst.ROTATION_0, 20, 20, 0, 30, "汉语 漢語");
        zplPrinter.printText(ZPLConst.FONT_1, ZPLConst.ROTATION_0, 24, 24, 0, 60, "汉语 漢語");
        zplPrinter.printText(ZPLConst.FONT_1, ZPLConst.ROTATION_0, 32, 32, 0, 90, "汉语 漢語");
        zplPrinter.printText(ZPLConst.FONT_1, ZPLConst.ROTATION_0, 40, 40, 0, 130, "汉语 漢語");
        zplPrinter.printText(ZPLConst.FONT_1, ZPLConst.ROTATION_0, 48, 48, 0, 180, "汉语 漢語");
        zplPrinter.printText(ZPLConst.FONT_1, ZPLConst.ROTATION_0, 60, 60, 0, 240, "汉语 漢語");
        zplPrinter.printText(ZPLConst.FONT_1, ZPLConst.ROTATION_0, 80, 80, 0, 320, "汉语 漢語");

        zplPrinter.endPage(count);

        zplPrinter.setupPrinter(ZPLConst.ROTATION_180, paper_type, 384, 480);
        zplPrinter.startPage();
        zplPrinter.setInternationalFont(0);

        zplPrinter.printText(ZPLConst.FONT_A, ZPLConst.ROTATION_0, 15, 12, 0, 0, "FontA 0123");
        zplPrinter.printText(ZPLConst.FONT_B, ZPLConst.ROTATION_0, 15, 12, 0, 30, "FontB 0123");
        zplPrinter.printText(ZPLConst.FONT_C, ZPLConst.ROTATION_0, 15, 12, 0, 60, "FontC 0123");
        zplPrinter.printText(ZPLConst.FONT_D, ZPLConst.ROTATION_0, 15, 12, 0, 90, "FontD 0123");
        zplPrinter.printText(ZPLConst.FONT_E, ZPLConst.ROTATION_0, 15, 12, 0, 120, "FontE 0123");
        zplPrinter.printText(ZPLConst.FONT_F, ZPLConst.ROTATION_0, 15, 12, 0, 160, "FontF 0123");
        zplPrinter.printText(ZPLConst.FONT_G, ZPLConst.ROTATION_0, 15, 12, 0, 210, "FontG 01");
        zplPrinter.printText(ZPLConst.FONT_H, ZPLConst.ROTATION_0, 15, 12, 0, 300, "FontH 01234567");

        zplPrinter.endPage(count);
    }

    public void Download_Logo() throws IOException
    {
        zplPrinter.downloadGraphic("//sdcard//temp//test//logo_m.jpg", "12345678");

        Toast.makeText(context, "Download Logo", Toast.LENGTH_SHORT).show();
    }

    public void Delete_Logo() throws IOException
    {
        zplPrinter.deleteGraphic("12345678");

        Toast.makeText(context, "Delete Logo", Toast.LENGTH_SHORT).show();
    }

    public void Print_Logo(char paper_type) throws IOException
    {
        zplPrinter.setupPrinter(ZPLConst.ROTATION_180, paper_type, 384, 340);

        zplPrinter.startPage();
        zplPrinter.setInternationalFont(0);
        zplPrinter.printGraphic("12345678", 1, 1, 1, 1);
        zplPrinter.endPage(1);
    }

    public void Print_PDF(char paper_type) throws IOException
    {
        /* ********************************** Notice **********************************
        printPDFFile() is a function that can print a PDF file, and the quantity part is always fixed to 1 in endPage().
        If a value other than 1 is written, it will not be output normally.
        To use compress in printPDFFile(), you must add jniLibs folder referring to Sample.
        ******************************************************************************* */
        zplPrinter.setupPrinter(ZPLConst.ROTATION_180, paper_type, 384, 600);
        zplPrinter.startPage();

        zplPrinter.printPDFFile("//sdcard//temp//test//PDF_Sample.pdf", 0, 0, 384, 0);
        zplPrinter.endPage(1);  //always quantity should be written as 1.
    }
}
