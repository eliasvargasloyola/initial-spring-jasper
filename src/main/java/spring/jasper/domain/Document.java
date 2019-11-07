package spring.jasper.domain;

import java.io.Serializable;

public class Document implements Serializable {

    private String amount;

    private String caseDoc;

    private String document;

    private String bol;

    public Document(String amount, String caseDoc, String document, String bol) {
        this.amount = amount;
        this.caseDoc = caseDoc;
        this.document = document;
        this.bol = bol;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCaseDoc() {
        return caseDoc;
    }

    public void setCaseDoc(String caseDoc) {
        this.caseDoc = caseDoc;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getBol() {
        return bol;
    }

    public void setBol(String bol) {
        this.bol = bol;
    }
}
