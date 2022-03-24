import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.Style;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.ListItem;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Kaufvertragpdf {
    public static void main(String[] args) throws IOException {
       druckepdf();
    }
    public static void druckepdf( ) throws IOException {
        String datei = "C:/Users/abdou/IdeaProjects/LF02/Kaufvertrag/Datei.pdf";
        PdfWriter writer = new PdfWriter(datei);
        PdfDocument pdfDocument = new PdfDocument(writer);
        Document document = new Document(pdfDocument);

        Style ueberschrift = new Style();
        ueberschrift.setFont(PdfFontFactory.createFont(StandardFonts.HELVETICA));
        ueberschrift.setFontSize(14);
        ueberschrift.setBold();
        ueberschrift.setUnderline();
        ueberschrift.setTextAlignment(TextAlignment.CENTER);

        Ware ware = new Ware("Laptop", 250.0);
        ware.setBeschreibung("Super krasses Gaming-Laptop");
        ware.getBesonderheiten().add("Tasche");
        ware.getBesonderheiten().add("Gaming-Maus");
        ware.getMaengel().add("Ladekabel fehlt");
        ware.getMaengel().add("Touchpad defekt");

        Vertragspartner kaeufer = new Vertragspartner("Klaus", "Brandt");
        kaeufer.setAusweisNr("0123456789");
        kaeufer.setAdresse(new Adresse("Zu Hause", "3a", "28199", "Bremen"));

        Vertragspartner verkaeufer = new Vertragspartner("Joachim", "Bredull");
        verkaeufer.setAusweisNr("9876543210");
        verkaeufer.setAdresse(new Adresse("Auch zu Hause", "7", "28195", "Bremen"));

        Kaufvertrag vertrag = new Kaufvertrag(verkaeufer, kaeufer, ware);
        vertrag.setZahlungsModalitaeten("Privater Barverkauf");




        Paragraph p0 = new Paragraph("Kaufvertrag");
        p0.addStyle(ueberschrift);
        p0.add("\n\n");


        ListItem item1 = new ListItem();
        Paragraph p1 = new Paragraph("Käufer");
        p1.add("\n");
        item1.add(p1);
        List subList1 = new List().setListSymbol("-");
        subList1.add("Name: "+kaeufer.getVorname()+" "+kaeufer.getNachname());
        subList1.add("AusweisNr: " +kaeufer.getAusweisNr());
        subList1.add("Adresse: " +kaeufer.getAdresse().getStrasse()+" "+kaeufer.getAdresse().getHausNr()+","+kaeufer.getAdresse().getPlz()+ " "+kaeufer.getAdresse().getOrt());
        item1.add(subList1);


        ListItem item2 = new ListItem();
        Paragraph p2 = new Paragraph("Verkäufer");
        p2.add("\n");
        item2.add(p2);
        List subList2 = new List().setListSymbol("-");
        subList2.add("Name: "+verkaeufer.getVorname()+""+verkaeufer.getNachname());
        subList2.add("AusweisNr: " +verkaeufer.getAusweisNr());
        subList2.add("Adresse: " +verkaeufer.getAdresse().getStrasse()+" "+verkaeufer.getAdresse().getHausNr()+","+verkaeufer.getAdresse().getPlz()+ " "+verkaeufer.getAdresse().getOrt());
        item2.add(subList2);



        ListItem item3 = new ListItem();
        Paragraph p3 = new Paragraph("Verkaufte Ware: ");
        p3.add("\n\n");
        item3.add(p3);

        Table table = new Table(2);
        table.setTextAlignment(TextAlignment.LEFT);

        table.addCell("Text");
        table.addCell("Wert");
        table.addCell("Bezeichnung");
        table.addCell(ware.getBezeichnung());
        table.addCell("Beschreibung");
        table.addCell(ware.getBeschreibung());
        table.addCell("Preis");
        table.addCell(""+ware.getPreis());
        table.addCell("Besonderheiten");
        table.addCell(""+ware.getBesonderheiten());
        table.addCell("Mängel");
        table.addCell(""+ware.getMaengel());

        item3.add(table);


        Paragraph p4 = new Paragraph("Zahlungsmodalitäten:");
        p4.add("\n\n");
        p4.add(vertrag.getZahlungsModalitaeten());


        document.add(p0);
        document.add(item1);
        document.add(item2);
        document.add(item3);
        document.add(p4);


        document.close();


    }
}
