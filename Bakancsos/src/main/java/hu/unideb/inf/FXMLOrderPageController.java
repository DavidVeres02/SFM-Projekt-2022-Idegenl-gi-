package hu.unideb.inf;
import hu.unideb.inf.model.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static hu.unideb.inf.FXMLMenuPageController.mainPane_static;

public class FXMLOrderPageController {
    @FXML
    private TextArea basket;
    public static TextArea basket_static;

    @FXML
    private Label osszeg;
    private static Label osszeg_static;

    public static List<Etel> etellista = new ArrayList<>();
    public static List<Udito> leveslista = new ArrayList<>();

    private static Integer italosszeg = 0;
    private static Integer levesosszeg = 0;

    @FXML
    public void initialize(){
        basket_static = basket;
        osszeg_static = osszeg;
    }
    static void kajaRendeles(int kajaindex, int darab){
        /*
        for (int i = 0; i < darab; i++)
        {
            etellista.add(etelek.get(kajaindex));
        }
        FXMLScenes object = new FXMLScenes();
        Pane view = object.getPage("FXMLOrderPage");
        Stage stage = new Stage();
        mainPane_static.getChildren().setAll(view);
        
         */
    }
    /*
    static void OsszegKiir()
    {
        osszeg.setText(italosszeg + kajaosszeg + "Ft");
    }

     */

    static void Kiir()
    {
        //String[] italtartalom = italKiir();
        String[] kajatartalom = kajaKiir();

        int meret = /*italtartalom.length +*/ kajatartalom.length;
        String[] teljes = new String[meret];
/*
        for (int i = 0; i < italtartalom.length; i++)
        {
            teljes[i] = italtartalom[i];
        }

        for (int j = 0; j < kajatartalom.length; j++)
        {
            teljes[j+italtartalom.length] = kajatartalom[j];
        }

 */

        for (int j = 0; j < kajatartalom.length; j++)
        {
            teljes[j+kajatartalom.length] = kajatartalom[j];
        }

        basket_static.setText(String.join("\n", teljes));
    }
    public static List<Etel> kajalistap = new ArrayList<>();
    static int count_kaja(String name){
        int db = 0;
        for (Etel item : etellista) {
            if (item.getName()==name){
                db++;
            }
        }
        return db;
    }
    static String[] kajaKiir()
    {
        Set<Etel> szurtlista = new HashSet<>(etellista);
        String[] tartalom = new String[szurtlista.size()];
        List<Etel> kajalista = new ArrayList<>(szurtlista);
        kajalistap.addAll(kajalista);
        for (int i = 0; i < kajalista.size(); i++)
        {
            int db = count_kaja(kajalista.get(i).getName());
            tartalom[i] = kajalista.get(i).getName() + "\t\t\t" + db + "db" + "\t" + db * kajalista.get(i).getPrice() + " ft";
            //kajaosszeg += db * kajalista.get(i).getPrice();
        }
        return tartalom;
    }
}
