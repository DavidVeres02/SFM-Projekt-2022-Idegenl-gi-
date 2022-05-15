package hu.unideb.inf;

import hu.unideb.inf.model.Desszert;
import hu.unideb.inf.model.Etel;
import hu.unideb.inf.model.Leves;
import hu.unideb.inf.model.Udito;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.AnchorPane;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class FXMLMenuPageController {
    public static List<Udito> uditok = new ArrayList<Udito>();
    public static List<Etel> etelek = new ArrayList<Etel>();
    public static List<Leves> levesek = new ArrayList<Leves>();
    public static List<Desszert> desszertek = new ArrayList<Desszert>();
    @FXML
    private Label name;
    public static Label name_static;

    @FXML
    private AnchorPane mainPane;
    public static AnchorPane mainPane_static;
    private ObservableList <Integer> valasztas = FXCollections.observableArrayList(0, 1, 2, 3, 4, 5);

    public List<ChoiceBox> leveschb = new ArrayList<>();
    public List<ChoiceBox> etelchb = new ArrayList<>();
    public List<ChoiceBox> dessertchb = new ArrayList<>();
    public List<ChoiceBox> uditochb = new ArrayList<>();

    @FXML
    public void initialize()
    {
        name_static = name;
        mainPane_static = mainPane;
        alev.setValue(0);
        alev.setItems(valasztas);
        //etel.addItem(alev);
    }

    @FXML
    private Label alevName;
    public static Label alevName_static;

    @FXML
    private Label alevPrice;
    public static Label alevPrice_static;

    @FXML
    private Label blevName;
    public static Label blevName_static;

    @FXML
    private Label blevPrice;
    public static Label blevPrice_static;

    @FXML
    private Label clevName;
    public static Label clevName_static;

    @FXML
    private Label clevPrice;
    public static Label clevPrice_static;

    @FXML
    private Label dlevName;
    public static Label dlevName_static;

    @FXML
    private Label dlevPrice;
    public static Label dlevPrice_static;

    @FXML
    private Label elevName;
    public static Label elevName_static;

    @FXML
    private Label elevPrice;
    public static Label elevPrice_static;

    @FXML
    private Label flevName;
    public static Label flevName_static;

    @FXML
    private Label flevPrice;
    public static Label flevPrice_static;

    public void GridpaneLeves() {
        Leves gulyas = new Leves("Gulyásleves csipedettel, cipóban tálalva", 1390);
        levesek.add(gulyas);
        FXMLMenuPageController.alevName_static.setText(gulyas.getName());
        FXMLMenuPageController.alevPrice_static.setText(gulyas.getPrice() + "Ft");

        Leves borso = new Leves("Borsóleves vajgaluskával", 990);
        levesek.add(borso);
        FXMLMenuPageController.blevName_static.setText(borso.getName());
        FXMLMenuPageController.blevPrice_static.setText(borso.getPrice() + "Ft");

        Leves hagyma = new Leves("Fokhagymakrémleves pirított kenyérkockával", 1190);
        levesek.add(hagyma);
        FXMLMenuPageController.clevName_static.setText(hagyma.getName());
        FXMLMenuPageController.clevPrice_static.setText(hagyma.getPrice() + "Ft");

        Leves ujhazi = new Leves("Újházi tyúkhúsleves", 1190);
        levesek.add(ujhazi);
        FXMLMenuPageController.dlevName_static.setText(ujhazi.getName());
        FXMLMenuPageController.dlevPrice_static.setText(ujhazi.getPrice() + "Ft");

        Leves gyumolcs = new Leves("Hideg gyümölcsleves idénygyümölcsökkel", 790);
        levesek.add(gyumolcs);
        FXMLMenuPageController.elevName_static.setText(gyumolcs.getName());
        FXMLMenuPageController.elevPrice_static.setText(gyumolcs.getPrice() + "Ft");

        Leves paradicsom = new Leves("Paradicsomleves bazsalikommal, betűtésztával", 990);
        levesek.add(paradicsom);
        FXMLMenuPageController.flevName_static.setText(paradicsom.getName());
        FXMLMenuPageController.flevPrice_static.setText(paradicsom.getPrice() + "Ft");
    }

    @FXML
    private Label atelName;
    public static Label atelName_static;

    @FXML
    private Label atelPrice;
    public static Label atelPrice_static;

    @FXML
    private Label btelName;
    public static Label btelName_static;

    @FXML
    private Label btelPrice;
    public static Label btelPrice_static;

    @FXML
    private Label ctelName;
    public static Label ctelName_static;

    @FXML
    private Label ctelPrice;
    public static Label ctelPrice_static;

    @FXML
    private Label dtelName;
    public static Label dtelName_static;

    @FXML
    private Label dtelPrice;
    public static Label dtelPrice_static;

    @FXML
    private Label etelName;
    public static Label etelName_static;

    @FXML
    private Label etelPrice;
    public static Label etelPrice_static;

    @FXML
    private Label ftelName;
    public static Label ftelName_static;

    @FXML
    private Label ftelPrice;
    public static Label ftelPrice_static;

    public void GridpaneUEtel() {
        Etel juhturo = new Etel("Juhtúrós-kapros sztrappacska", 1890);
        etelek.add(juhturo);
        FXMLMenuPageController.atelName_static.setText(juhturo.getName());
        FXMLMenuPageController.atelPrice_static.setText(juhturo.getPrice() + "Ft");

        Etel matrai = new Etel("Mátrai borzaska, petrezselymes burgonyával", 2090);
        etelek.add(matrai);
        FXMLMenuPageController.btelName_static.setText(matrai.getName());
        FXMLMenuPageController.btelPrice_static.setText(matrai.getPrice() + "Ft");

        Etel mezes = new Etel("Mézes-mustáros csirkemell, rizzsel", 2090);
        etelek.add(mezes);
        FXMLMenuPageController.ctelName_static.setText(mezes.getName());
        FXMLMenuPageController.ctelPrice_static.setText(mezes.getPrice() + "Ft");

        Etel voros = new Etel("Vörösboros marhapörkölt, nokedlivel", 2690);
        etelek.add(voros);
        FXMLMenuPageController.dtelName_static.setText(voros.getName());
        FXMLMenuPageController.dtelPrice_static.setText(voros.getPrice() + "Ft");

        Etel szabolcsi = new Etel("Szabolcsi töltött káposzta", 2690);
        etelek.add(szabolcsi);
        FXMLMenuPageController.etelName_static.setText(szabolcsi.getName());
        FXMLMenuPageController.etelPrice_static.setText(szabolcsi.getPrice() + "Ft");

        Etel csusza = new Etel("Túrós csusza, harcsapaprikással", 2390);
        etelek.add(csusza);
        FXMLMenuPageController.ftelName_static.setText(csusza.getName());
        FXMLMenuPageController.ftelPrice_static.setText(csusza.getPrice() + "Ft");
    }

    @FXML
    private Label adesName;
    public static Label adesName_static;

    @FXML
    private Label adesPrice;
    public static Label adesPrice_static;

    @FXML
    private Label bdesName;
    public static Label bdesName_static;

    @FXML
    private Label bdesPrice;
    public static Label bdesPrice_static;

    @FXML
    private Label cdesName;
    public static Label cdesName_static;

    @FXML
    private Label cdesPrice;
    public static Label cdesPrice_static;

    @FXML
    private Label ddesName;
    public static Label ddesName_static;

    @FXML
    private Label ddesPrice;
    public static Label ddesPrice_static;

    @FXML
    private Label edesName;
    public static Label edesName_static;

    @FXML
    private Label edesPrice;
    public static Label edesPrice_static;

    @FXML
    private Label fdesName;
    public static Label fdesName_static;

    @FXML
    private Label fdesPrice;
    public static Label fdesPrice_static;

    public void GridpaneUDesszert() {
        Desszert gundel = new Desszert("Gundel palacsinta, csokoládé fagylalttal", 990);
        desszertek.add(gundel);
        FXMLMenuPageController.adesName_static.setText(gundel.getName());
        FXMLMenuPageController.adesPrice_static.setText(gundel.getPrice() + "Ft");

        Desszert meggy = new Desszert("Meggyes-mákos guba, vaníliasodóval", 1190);
        desszertek.add(meggy);
        FXMLMenuPageController.bdesName_static.setText(meggy.getName());
        FXMLMenuPageController.bdesPrice_static.setText(meggy.getPrice() + "Ft");

        Desszert gesztenye = new Desszert("Gesztenyepüré, tejszínhabbal", 790);
        desszertek.add(gesztenye);
        FXMLMenuPageController.cdesName_static.setText(gesztenye.getName());
        FXMLMenuPageController.cdesPrice_static.setText(gesztenye.getPrice() + "Ft");

        Desszert somloi = new Desszert("Somlói galuska", 990);
        desszertek.add(somloi);
        FXMLMenuPageController.ddesName_static.setText(somloi.getName());
        FXMLMenuPageController.ddesPrice_static.setText(somloi.getPrice() + "Ft");

        Desszert fekete = new Desszert("Feketeerdő pohárkrém, tejszínhabbal", 790);
        desszertek.add(fekete);
        FXMLMenuPageController.edesName_static.setText(fekete.getName());
        FXMLMenuPageController.edesPrice_static.setText(fekete.getPrice() + "Ft");

        Desszert dobos = new Desszert("Dobostorta", 990);
        desszertek.add(dobos);
        FXMLMenuPageController.fdesName_static.setText(dobos.getName());
        FXMLMenuPageController.fdesPrice_static.setText(dobos.getPrice() + "Ft");
    }

    @FXML
    private Label audiName;
    public static Label audiName_static;

    @FXML
    private Label audiPrice;
    public static Label audiPrice_static;

    @FXML
    private Label budiName;
    public static Label budiName_static;

    @FXML
    private Label budiPrice;
    public static Label budiPrice_static;

    @FXML
    private Label cudiName;
    public static Label cudiName_static;

    @FXML
    private Label cudiPrice;
    public static Label cudiPrice_static;

    @FXML
    private Label dudiName;
    public static Label dudiName_static;

    @FXML
    private Label duduPrice;
    public static Label dudiPrice_static;

    @FXML
    private Label eudiName;
    public static Label eudiName_static;

    @FXML
    private Label eudiPrice;
    public static Label eudiPrice_static;

    @FXML
    private Label fudiName;
    public static Label fudiName_static;

    @FXML
    private Label fudiPrice;
    public static Label fudiPrice_static;

    public void GridpaneUdito() {
        Udito limonade = new Udito("Házi limonádék (citrom, eper, málna)", 590);
        uditok.add(limonade);
        FXMLMenuPageController.audiName_static.setText(limonade.getName());
        FXMLMenuPageController.audiPrice_static.setText(limonade.getPrice() + "Ft / 0.5l");

        Udito uditoek = new Udito("Üdítőitalok (Fanta, Cola, Nestea)", 490);
        uditok.add(uditoek);
        FXMLMenuPageController.budiName_static.setText(uditoek.getName());
        FXMLMenuPageController.budiPrice_static.setText(uditoek.getPrice() + "Ft / 0.33l");

        Udito szoda = new Udito("Szóda", 390);
        uditok.add(szoda);
        FXMLMenuPageController.cudiName_static.setText(szoda.getName());
        FXMLMenuPageController.cudiPrice_static.setText(szoda.getPrice() + "Ft / 0.5l");

        Udito borok = new Udito("Borok (vörös, fehér, rosé)", 690);
        uditok.add(borok);
        FXMLMenuPageController.dudiName_static.setText(borok.getName());
        FXMLMenuPageController.dudiPrice_static.setText(borok.getPrice() + "Ft / 0.25l");

        Udito palinkak = new Udito("Pálinkák (szilva, körte, meggy)", 790);
        uditok.add(palinkak);
        FXMLMenuPageController.eudiName_static.setText(palinkak.getName());
        FXMLMenuPageController.eudiPrice_static.setText(palinkak.getPrice() + "Ft / 8cl");

        Udito forro = new Udito("Tea, kávé", 590);
        uditok.add(forro);
        FXMLMenuPageController.fudiName_static.setText(forro.getName());
        FXMLMenuPageController.fudiPrice_static.setText(forro.getPrice() + "Ft / 0.2l");
    }

}
