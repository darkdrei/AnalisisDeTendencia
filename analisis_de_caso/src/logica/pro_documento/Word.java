/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.pro_documento;

import java.io.FileOutputStream;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/*import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import java.io.FileOutputStream;*/
/**
 *
 * @author eugenio
 */
public class Word {
    public static void main(String []a){
        XWPFDocument document = new XWPFDocument();
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();
        run.setText("Pancakes");
        run.setText("and Nutella");
        try{
            FileOutputStream output = new FileOutputStream("respuesta.docx");
            document.write(output);
            output.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
