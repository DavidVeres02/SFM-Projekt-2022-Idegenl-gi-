package hu.unideb.inf;

import hu.unideb.inf.model.Desszert;
import hu.unideb.inf.model.Etel;
import hu.unideb.inf.model.Leves;
import hu.unideb.inf.model.Udito;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.awt.*;
import javafx.event.ActionEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FXMLMenuPageController {
    /*
    public List<Udito> uditok = new ArrayList<>();
    public List<Etel> etelek = new ArrayList<>();
    public List<Leves> levesek = new ArrayList<>();
    public List<Desszert> desszertek = new ArrayList<>();
     */
    @FXML
    private Label name;
    public static Label name_static;

    @FXML
    public Button buttonRendel;
    @FXML
    public Button buttonVissza;
    @FXML
    private AnchorPane mainPane;
    public static AnchorPane mainPane_static;
    private ObservableList<Integer> valasztas = FXCollections.observableArrayList(0, 1, 2, 3, 4, 5);

    public List<ChoiceBox> leveschb = new ArrayList<>();
    public List<ChoiceBox> etelchb = new ArrayList<>();
    public List<ChoiceBox> dessertchb = new ArrayList<>();
    public List<ChoiceBox> uditochb = new ArrayList<>();

    //Gulyásleves
    @FXML
    private Label gulyasName;
    public static Label gulyasName_static;

    @FXML
    private Label gulyasPrice;
    public static Label gulyasPrice_static;

    @FXML
    private ChoiceBox<Integer> gulyascb;

    //Borsóleves
    @FXML
    private Label borsoName;
    public static Label borsoName_static;

    @FXML
    private Label borsoPrice;
    public static Label borsoPrice_static;

    @FXML
    private ChoiceBox<Integer> borsocb;

    //Hagymaleves
    @FXML
    private Label hagymaName;
    public static Label hagymaName_static;

    @FXML
    private Label hagymaPrice;
    public static Label hagymaPrice_static;

    @FXML
    private ChoiceBox<Integer> hagymacb;

    //űjházi húsleves
    @FXML
    private Label ujhaziName;
    public static Label ujhaziName_static;

    @FXML
    private Label ujhaziPrice;
    public static Label ujhaziPrice_static;

    @FXML
    private ChoiceBox<Integer> ujhazicb;

    //Gyümölcsleves
    @FXML
    private Label gyumolcsName;
    public static Label gyumolcsName_static;

    @FXML
    private Label gyumolcsPrice;
    public static Label gyumolcsPrice_static;

    @FXML
    private ChoiceBox<Integer> gyumolcscb;

    //Paradicsomleves
    @FXML
    private Label paradicsName;
    public static Label paradicsName_static;

    @FXML
    private Label paradicsPrice;
    public static Label paradicsPrice_static;

    @FXML
    private ChoiceBox<Integer> paradicscb;

    //Juhtúrós sztrappacska
    @FXML
    private Label sztraoaName;
    public static Label sztraoaName_static;

    @FXML
    private Label sztraoaPrice;
    public static Label sztraoaPrice_static;

    @FXML
    private ChoiceBox<Integer> sztraoacb;

    //Mátrai borzaska
    @FXML
    private Label matraiName;
    public static Label matraiName_static;

    @FXML
    private Label matraiPrice;
    public static Label matraiPrice_static;

    @FXML
    private ChoiceBox<Integer> matraicb;

    //MM csirke
    @FXML
    private Label mmcsirkeName;
    public static Label mmcsirkeName_static;

    @FXML
    private Label mmcsirkePrice;
    public static Label mmcsirkePrice_static;

    @FXML
    private ChoiceBox<Integer> mmcsirkecb;

    //Marhapörkölt
    @FXML
    private Label marhaName;
    public static Label marhaName_static;

    @FXML
    private Label marhaPrice;
    public static Label marhaPrice_static;

    @FXML
    private ChoiceBox<Integer> marhacb;

    //Töltöttkáposzta
    @FXML
    private Label toltottName;
    public static Label toltottName_static;

    @FXML
    private Label toltottPrice;
    public static Label toltottPrice_static;

    @FXML
    private ChoiceBox<Integer> toltottcb;

    //Túrós csusza
    @FXML
    private Label csuszaName;
    public static Label csuszaName_static;

    @FXML
    private Label csuszaPrice;
    public static Label csuszaPrice_static;

    @FXML
    private ChoiceBox<Integer> csuszacb;

    //Gundel palacsinta
    @FXML
    private Label gundelpName;
    public static Label gundelpName_static;

    @FXML
    private Label gundelpPrice;
    public static Label gundelpPrice_static;

    @FXML
    private ChoiceBox<Integer> gundelcb;

    //Mákosguba
    @FXML
    private Label makosName;
    public static Label makosName_static;

    @FXML
    private Label makosPrice;
    public static Label makosPrice_static;

    @FXML
    private ChoiceBox<Integer> makoscb;

    //Gesztenyepüré
    @FXML
    private Label pureeName;
    public static Label pureeName_static;

    @FXML
    private Label pureePrice;
    public static Label pureePrice_static;

    @FXML
    private ChoiceBox<Integer> pureecb;

    //Somlói galuska
    @FXML
    private Label somloiName;
    public static Label somloiName_static;

    @FXML
    private Label somloiPrice;
    public static Label somloiPrice_static;

    @FXML
    private ChoiceBox<Integer> somloicb;

    //Feketeerdő pohárkrém
    @FXML
    private Label poharkName;
    public static Label poharkName_static;

    @FXML
    private Label poharkPrice;
    public static Label poharkPrice_static;

    @FXML
    private ChoiceBox<Integer> poharkcb;

    //Dobostorta
    @FXML
    private Label dobostName;
    public static Label dobostName_static;

    @FXML
    private Label dobostPrice;
    public static Label dobostPrice_static;

    @FXML
    private ChoiceBox<Integer> dobostcb;

    //Házi limonádék
    @FXML
    private Label limonadeName;
    public static Label limonadeName_static;

    @FXML
    private Label limonadePrice;
    public static Label limonadePrice_static;

    @FXML
    private ChoiceBox<Integer> limonadecb;

    //Üdítőitalok
    @FXML
    private Label uditoekName;
    public static Label uditoekName_static;

    @FXML
    private Label uditoekPrice;
    public static Label uditoekPrice_static;

    @FXML
    private ChoiceBox<Integer> uditoekcb;

    //Szóda
    @FXML
    private Label sodaName;
    public static Label sodaName_static;

    @FXML
    private Label sodaPrice;
    public static Label sodaPrice_static;

    @FXML
    private ChoiceBox<Integer> sodacb;

    //Borok
    @FXML
    private Label borokName;
    public static Label borokName_static;

    @FXML
    private Label borokPrice;
    public static Label borokPrice_static;

    @FXML
    private ChoiceBox<Integer> borokcb;

    //Pálinkák
    @FXML
    private Label palinkaName;
    public static Label palinkaName_static;

    @FXML
    private Label palinkaPrice;
    public static Label palinkaPrice_static;

    @FXML
    private ChoiceBox<Integer> palinkacb;

    //Forró italok
    @FXML
    private Label forrokName;
    public static Label forrokName_static;

    @FXML
    private Label forrokPrice;
    public static Label forrokPrice_static;

    @FXML
    private ChoiceBox<Integer> forrokcb;
    @FXML
    public void initialize()
    {
        name_static = name;
        mainPane_static = mainPane;

        gulyascb.setValue(0);
        gulyascb.setItems(valasztas);
        leveschb.add(gulyascb);

        borsocb.setValue(0);
        borsocb.setItems(valasztas);
        leveschb.add(borsocb);

        hagymacb.setValue(0);
        hagymacb.setItems(valasztas);
        leveschb.add(hagymacb);

        ujhazicb.setValue(0);
        ujhazicb.setItems(valasztas);
        leveschb.add(ujhazicb);

        gyumolcscb.setValue(0);
        gyumolcscb.setItems(valasztas);
        leveschb.add(gyumolcscb);

        paradicscb.setValue(0);
        paradicscb.setItems(valasztas);
        leveschb.add(paradicscb);

        //

        sztraoacb.setValue(0);
        sztraoacb.setItems(valasztas);
        etelchb.add(sztraoacb);

        matraicb.setValue(0);
        matraicb.setItems(valasztas);
        etelchb.add(matraicb);

        mmcsirkecb.setValue(0);
        mmcsirkecb.setItems(valasztas);
        etelchb.add(mmcsirkecb);

        marhacb.setValue(0);
        marhacb.setItems(valasztas);
        etelchb.add(marhacb);

        toltottcb.setValue(0);
        toltottcb.setItems(valasztas);
        etelchb.add(toltottcb);

        csuszacb.setValue(0);
        csuszacb.setItems(valasztas);
        etelchb.add(csuszacb);

        //

        gundelcb.setValue(0);
        gundelcb.setItems(valasztas);
        dessertchb.add(gundelcb);

        makoscb.setValue(0);
        makoscb.setItems(valasztas);
        dessertchb.add(makoscb);

        pureecb.setValue(0);
        pureecb.setItems(valasztas);
        dessertchb.add(pureecb);

        somloicb.setValue(0);
        somloicb.setItems(valasztas);
        dessertchb.add(somloicb);

        poharkcb.setValue(0);
        poharkcb.setItems(valasztas);
        dessertchb.add(poharkcb);

        dobostcb.setValue(0);
        dobostcb.setItems(valasztas);
        dessertchb.add(dobostcb);

        //

        limonadecb.setValue(0);
        limonadecb.setItems(valasztas);
        uditochb.add(limonadecb);

        uditoekcb.setValue(0);
        uditoekcb.setItems(valasztas);
        uditochb.add(uditoekcb);

        sodacb.setValue(0);
        sodacb.setItems(valasztas);
        uditochb.add(sodacb);

        borokcb.setValue(0);
        borokcb.setItems(valasztas);
        uditochb.add(borokcb);

        palinkacb.setValue(0);
        palinkacb.setItems(valasztas);
        uditochb.add(palinkacb);

        forrokcb.setValue(0);
        forrokcb.setItems(valasztas);
        uditochb.add(forrokcb);

        //

        gulyasName_static = gulyasName;
        gulyasPrice_static = gulyasPrice;

        borsoName_static = borsoName;
        borsoPrice_static = borsoPrice;

        hagymaName_static = hagymaName;
        hagymaPrice_static = hagymaPrice;

        ujhaziName_static = ujhaziName;
        ujhaziPrice_static = ujhaziPrice;

        gyumolcsName_static = gyumolcsName;
        gyumolcsPrice_static = gyumolcsPrice;

        paradicsName_static = paradicsName;
        paradicsPrice_static = paradicsPrice;

        //

        sztraoaName_static = sztraoaName;
        sztraoaPrice_static = sztraoaPrice;

        matraiName_static = matraiName;
        matraiPrice_static = matraiPrice;

        mmcsirkeName_static = mmcsirkeName;
        mmcsirkePrice_static = mmcsirkePrice;

        marhaName_static = marhaName;
        marhaPrice_static = marhaPrice;

        toltottName_static = toltottName;
        toltottPrice_static = toltottPrice;

        csuszaName_static = csuszaName;
        csuszaPrice_static = csuszaPrice;

        //

        gundelpName_static = gundelpName;
        gundelpPrice_static = gundelpPrice;

        makosName_static = makosName;
        makosPrice_static = makosPrice;

        pureeName_static = pureeName;
        pureePrice_static = pureePrice;

        somloiName_static = somloiName;
        somloiPrice_static = somloiPrice;

        poharkName_static = poharkName;
        poharkPrice_static = poharkPrice;

        dobostName_static = dobostName;
        dobostPrice_static = dobostPrice;

        //

        limonadeName_static = limonadeName;
        limonadePrice_static = limonadePrice;

        uditoekName_static = uditoekName;
        uditoekPrice_static = uditoekPrice;

        sodaName_static = sodaName;
        sodaPrice_static = sodaPrice;

        borokName_static = borokName;
        borokPrice_static = borokPrice;

        palinkaName_static = palinkaName;
        palinkaPrice_static = palinkaPrice;

        forrokName_static = forrokName;
        forrokPrice_static = forrokPrice;

    }
/*
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
*/
    /*
    public void GridpaneLeves() {
        Leves gulyas = new Leves("Gulyásleves csipedettel, cipóban tálalva", 1390);
        levesek.add(gulyas);
        FXMLMenuPageController.gulyasName_static.setText(gulyas.getName());
        FXMLMenuPageController.gulyasPrice_static.setText(gulyas.getPrice() + "Ft");

        Leves borso = new Leves("Borsóleves vajgaluskával", 990);
        levesek.add(borso);
        FXMLMenuPageController.borsoPrice_static.setText(borso.getName());
        FXMLMenuPageController.borsoPrice_static.setText(borso.getPrice() + "Ft");

        Leves hagyma = new Leves("Fokhagymakrémleves pirított kenyérkockával", 1190);
        levesek.add(hagyma);
        FXMLMenuPageController.hagymaName_static.setText(hagyma.getName());
        FXMLMenuPageController.hagymaPrice_static.setText(hagyma.getPrice() + "Ft");

        Leves ujhazi = new Leves("Újházi tyúkhúsleves", 1190);
        levesek.add(ujhazi);
        FXMLMenuPageController.ujhaziName_static.setText(ujhazi.getName());
        FXMLMenuPageController.ujhaziPrice_static.setText(ujhazi.getPrice() + "Ft");

        Leves gyumolcs = new Leves("Hideg gyümölcsleves idénygyümölcsökkel", 790);
        levesek.add(gyumolcs);
        FXMLMenuPageController.gyumolcsName_static.setText(gyumolcs.getName());
        FXMLMenuPageController.gyumolcsPrice_static.setText(gyumolcs.getPrice() + "Ft");

        Leves paradicsom = new Leves("Paradicsomleves bazsalikommal, betűtésztával", 990);
        levesek.add(paradicsom);
        FXMLMenuPageController.paradicsName_static.setText(paradicsom.getName());
        FXMLMenuPageController.paradicsPrice_static.setText(paradicsom.getPrice() + "Ft");
    }
     */
/*
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
*/
    /*
    public void GridpaneUEtel() {
        Etel juhturo = new Etel("Juhtúrós-kapros sztrappacska", 1890);
        etelek.add(juhturo);
        FXMLMenuPageController.sztraoaName_static.setText(juhturo.getName());
        FXMLMenuPageController.sztraoaPrice_static.setText(juhturo.getPrice() + "Ft");

        Etel matrai = new Etel("Mátrai borzaska, petrezselymes burgonyával", 2090);
        etelek.add(matrai);
        FXMLMenuPageController.matraiName_static.setText(matrai.getName());
        FXMLMenuPageController.matraiPrice_static.setText(matrai.getPrice() + "Ft");

        Etel mezes = new Etel("Mézes-mustáros csirkemell, rizzsel", 2090);
        etelek.add(mezes);
        FXMLMenuPageController.mmcsirkeName_static.setText(mezes.getName());
        FXMLMenuPageController.mmcsirkePrice_static.setText(mezes.getPrice() + "Ft");

        Etel voros = new Etel("Vörösboros marhapörkölt, nokedlivel", 2690);
        FXMLMenuPageController.marhaName_static.setText(voros.getName());
        etelek.add(voros);
        FXMLMenuPageController.marhaPrice_static.setText(voros.getPrice() + "Ft");

        Etel szabolcsi = new Etel("Szabolcsi töltött káposzta", 2690);
        etelek.add(szabolcsi);
        FXMLMenuPageController.toltottName_static.setText(szabolcsi.getName());
        FXMLMenuPageController.toltottPrice_static.setText(szabolcsi.getPrice() + "Ft");

        Etel csusza = new Etel("Túrós csusza, harcsapaprikással", 2390);
        etelek.add(csusza);
        FXMLMenuPageController.csuszaName_static.setText(csusza.getName());
        FXMLMenuPageController.csuszaPrice_static.setText(csusza.getPrice() + "Ft");
    }
     */
/*
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
*/
    /*
    public void GridpaneUDesszert() {
        Desszert gundel = new Desszert("Gundel palacsinta, csokoládé fagylalttal", 990);
        desszertek.add(gundel);
        FXMLMenuPageController.gundelpName_static.setText(gundel.getName());
        FXMLMenuPageController.gundelpPrice_static.setText(gundel.getPrice() + "Ft");

        Desszert meggy = new Desszert("Meggyes-mákos guba, vaníliasodóval", 1190);
        desszertek.add(meggy);
        FXMLMenuPageController.makosName_static.setText(meggy.getName());
        FXMLMenuPageController.makosPrice_static.setText(meggy.getPrice() + "Ft");

        Desszert gesztenye = new Desszert("Gesztenyepüré, tejszínhabbal", 790);
        desszertek.add(gesztenye);
        FXMLMenuPageController.pureeName_static.setText(gesztenye.getName());
        FXMLMenuPageController.pureePrice_static.setText(gesztenye.getPrice() + "Ft");

        Desszert somloi = new Desszert("Somlói galuska", 990);
        desszertek.add(somloi);
        FXMLMenuPageController.somloiName_static.setText(somloi.getName());
        FXMLMenuPageController.somloiPrice_static.setText(somloi.getPrice() + "Ft");

        Desszert fekete = new Desszert("Feketeerdő pohárkrém, tejszínhabbal", 790);
        desszertek.add(fekete);
        FXMLMenuPageController.poharkName_static.setText(fekete.getName());
        FXMLMenuPageController.poharkPrice_static.setText(fekete.getPrice() + "Ft");

        Desszert dobos = new Desszert("Dobostorta", 990);
        desszertek.add(dobos);
        FXMLMenuPageController.dobostName_static.setText(dobos.getName());
        FXMLMenuPageController.dobostPrice_static.setText(dobos.getPrice() + "Ft");
    }
     */
/*
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
*/
    /*
    public void GridpaneUdito() {
        Udito limonade = new Udito("Házi limonádék (citrom, eper, málna)", 590);
        uditok.add(limonade);
        FXMLMenuPageController.limonadeName_static.setText(limonade.getName());
        FXMLMenuPageController.limonadePrice_static.setText(limonade.getPrice() + "Ft / 0.5l");

        Udito uditoek = new Udito("Üdítőitalok (Fanta, Cola, Nestea)", 490);
        uditok.add(uditoek);
        FXMLMenuPageController.uditoekName_static.setText(uditoek.getName());
        FXMLMenuPageController.uditoekPrice_static.setText(uditoek.getPrice() + "Ft / 0.33l");

        Udito szoda = new Udito("Szóda", 390);
        uditok.add(szoda);
        FXMLMenuPageController.sodaName_static.setText(szoda.getName());
        FXMLMenuPageController.sodaPrice_static.setText(szoda.getPrice() + "Ft / 0.5l");

        Udito borok = new Udito("Borok (vörös, fehér, rosé)", 690);
        uditok.add(borok);
        FXMLMenuPageController.borokName_static.setText(borok.getName());
        FXMLMenuPageController.borokPrice_static.setText(borok.getPrice() + "Ft / 0.25l");

        Udito palinkak = new Udito("Pálinkák (szilva, körte, meggy)", 790);
        uditok.add(palinkak);
        FXMLMenuPageController.palinkaName_static.setText(palinkak.getName());
        FXMLMenuPageController.palinkaPrice_static.setText(palinkak.getPrice() + "Ft / 8cl");

        Udito forro = new Udito("Tea, kávé", 590);
        uditok.add(forro);
        FXMLMenuPageController.forrokName_static.setText(forro.getName());
        FXMLMenuPageController.forrokPrice_static.setText(forro.getPrice() + "Ft / 0.2l");
    }
     */
    @FXML
    void HandledOrderButtonPushed(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLOrderPage.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = new Stage();
        Stage stage2 = (Stage)buttonVissza.getScene().getWindow();
        stage2.close();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void HandledVisszaButtonPushed(ActionEvent event) throws IOException
    {
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLLogPage.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = new Stage();
        Stage stage2 = (Stage)buttonVissza.getScene().getWindow();
        stage2.close();
        stage.setScene(scene);
        stage.show();
    }
}
