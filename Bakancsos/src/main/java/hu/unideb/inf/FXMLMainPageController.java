package hu.unideb.inf;
import hu.unideb.inf.model.Desszert;
import hu.unideb.inf.model.Etel;
import hu.unideb.inf.model.Leves;
import hu.unideb.inf.model.Udito;
import javafx.scene.control.Button;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FXMLMainPageController {

        @FXML
        private Button ButtonLogin;

        @FXML
        private Button ButtonRegis;

        public java.util.List<Udito> uditok = new ArrayList<>();
        public java.util.List<Etel> etelek = new ArrayList<>();
        public java.util.List<Leves> levesek = new ArrayList<>();
        public List<Desszert> desszertek = new ArrayList<>();

        @FXML
        void HandledGueButtonPushed(ActionEvent event) throws IOException{
                FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLMenuPage.fxml"));
                Scene scene = new Scene(loader.load());
                Stage stage = new Stage();
                Stage stage2 = (Stage)ButtonRegis.getScene().getWindow();
                stage2.close();
                stage.setTitle("Menu Page");
                stage.setScene(scene);
                stage.show();
                GridpaneLeves();
                GridpaneUEtel();
                GridpaneUDesszert();
                GridpaneUdito();
        }

        @FXML
        void HandledLogButtonPushed(ActionEvent event) throws IOException {
                FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLLogPage.fxml"));
                Scene scene = new Scene(loader.load());
                Stage stage = new Stage();
                Stage stage2 = (Stage)ButtonLogin.getScene().getWindow();
                stage2.close();
                stage.setTitle("Login Page");
                stage.setScene(scene);
                stage.show();
        }

        @FXML
        void HandledRegButtonPushed(ActionEvent event) throws IOException {
                FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/FXMLRegPage.fxml"));
                Scene scene = new Scene(loader.load());
                Stage stage = new Stage();
                Stage stage2 = (Stage)ButtonRegis.getScene().getWindow();
                stage2.close();
                stage.setTitle("Registration Page");
                stage.setScene(scene);
                stage.show();
        }
        public void GridpaneLeves() {
                Leves gulyas = new Leves("Gulyásleves csipedettel, cipóban tálalva", 1390);
                levesek.add(gulyas);
                FXMLMenuPageController.gulyasName_static.setText(gulyas.getName());
                FXMLMenuPageController.gulyasPrice_static.setText(gulyas.getPrice() + "Ft");

                Leves borso = new Leves("Borsóleves vajgaluskával", 990);
                levesek.add(borso);
                FXMLMenuPageController.borsoName_static.setText(borso.getName());
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

    }
