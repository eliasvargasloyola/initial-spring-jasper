package spring.jasper.reports;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.stereotype.Component;
import spring.jasper.domain.Document;

import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class PdfExport {


    public byte[] export() throws JRException {
        InputStream employeeReportStream = getClass().getResourceAsStream("/templates/delivery.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(employeeReportStream);

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("emitedDate", "June 5, 2019");
        parameters.put("fullName", "Joyce Fothergill");
        parameters.put("shortName", "Joyce:");
        parameters.put("totalAmount", "$ 1324123");
        parameters.put(JRParameter.IS_IGNORE_PAGINATION, Boolean.TRUE);

        List<Document> documents = Arrays.asList(new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"), new Document("$ 123123", "21312", "90785632", "79879831"));

        JRBeanCollectionDataSource listDataSource = new JRBeanCollectionDataSource(documents, false);

        parameters.put("listOfJavaBeans", documents);

        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, listDataSource);

        return JasperExportManager.exportReportToPdf(jasperPrint);
    }
}
