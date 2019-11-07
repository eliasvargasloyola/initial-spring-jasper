package spring.jasper.controllers;

import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import spring.jasper.reports.PdfExport;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PdfExportController {

    @Autowired
    PdfExport pdfExport;

    @GetMapping("/pdf/export")
    public ResponseEntity<byte[]> report() throws JRException {
        byte[] bytes = pdfExport.export();
        String filename = "pdf_file2export";
        return ResponseEntity.ok()
                .header("Content-Type", "application/pdf; charset=UTF-8")
                .header("Content-Disposition", "inline; filename=\"" + filename + ".pdf\"")
                .body(bytes);
    }

}
