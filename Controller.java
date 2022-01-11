

import Sydn.Mathf;
import Sydn.Precise;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    public Button root;
    public TextField Texthasil;
    public Button Delete;
    public Button Kurungpenutup;
    public Button Kurungpembuka;
    public Button Nol;
    public Button titik;
    public Button clear;
    String persamaan = "";
    int jumlahkurung = 0;
    boolean telahmenambahangka;
    boolean sudahmenginputsimbol = false;
    String samadengan = "";
    public TextField Text;
    public Button Tujuh;
    public Button Delapan;
    public Button Sembilan;
    public Button Empat;
    public Button Lima;
    public Button Enam;
    public Button Satu;
    public Button Dua;
    public Button Tiga;
    public Button plus;
    public Button Kurang;
    public Button Kali;
    public Button Bagi;
    public Button Power;
    public Button Hasil;
    void menambahpersamaan(String data) {
        persamaan+= data;
        Text.setText(persamaan);
        menghitung();
    }
    void menghitung() {
        try {
            samadengan = String.valueOf(Mathf.eval(persamaan, Precise.PRECISE));
            System.out.println(samadengan);
            Texthasil.setText(samadengan);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Belum lengkap");
        }
    }
    public void Powerf(ActionEvent actionEvent) {
        menambahpersamaan("^");
    }

    public void Hasilf(ActionEvent actionEvent) {
        persamaan = samadengan;
        Text.setText(persamaan);
    }

    public void Bagif(ActionEvent actionEvent) {

        menambahpersamaan("/");

    }

    public void Kalif(ActionEvent actionEvent) {

        menambahpersamaan("*");

    }

    public void Kurangf(ActionEvent actionEvent) {

        menambahpersamaan("-");telahmenambahangka = false;

    }

    public void plusf(ActionEvent actionEvent) {

        menambahpersamaan("+");

    }

    public void Tigaf(ActionEvent actionEvent) {
        menambahpersamaan("3");
        telahmenambahangka = true;

    }

    public void Duaf(ActionEvent actionEvent) {
        menambahpersamaan("2");
        telahmenambahangka = true;

    }

    public void Satuf(ActionEvent actionEvent) {
        menambahpersamaan("1");
        telahmenambahangka = true;

    }

    public void Enamf(ActionEvent actionEvent) {
        menambahpersamaan("6");
        telahmenambahangka = true;

    }

    public void Limaf(ActionEvent actionEvent) {
        menambahpersamaan("5");
        telahmenambahangka = true;

    }

    public void Empatf(ActionEvent actionEvent) {
        menambahpersamaan("4");
        telahmenambahangka = true;

    }

    public void Sembilanf(ActionEvent actionEvent) {
        menambahpersamaan("9");
        telahmenambahangka = true;

    }

    public void Delapanf(ActionEvent actionEvent) {
        menambahpersamaan("8");
        telahmenambahangka = true;

    }

    public void Tujuhf(ActionEvent actionEvent) {
        menambahpersamaan("7");
        telahmenambahangka = true;

    }

    public void Hasilfn(ActionEvent actionEvent) {
    }

    public void rootf(ActionEvent actionEvent) {
        if (telahmenambahangka) {
            menambahpersamaan("|");

        }
    }

    public void akhirkurungf(ActionEvent actionEvent) {
        menambahpersamaan(")");
        jumlahkurung++;
        System.out.println(jumlahkurung);
    }

    public void Deletef(ActionEvent actionEvent) {
        char[] tescheck = {'(', ')','+','-','*','/','^','|'};
        StringBuilder tempn = new StringBuilder(persamaan);
        if (!persamaan.isEmpty()) {
            tempn.delete(tempn.length() - 1, tempn.length());
            persamaan = tempn.toString();
            Text.setText(persamaan);
            menghitung();
        }
        if (persamaan.isEmpty()) {
            Texthasil.setText("");
        }
    }

    public void awalkurungf(ActionEvent actionEvent) {
        menambahpersamaan("(");
        jumlahkurung++;
        System.out.println(jumlahkurung);
    }

    public void Nolf(ActionEvent actionEvent) {
        menambahpersamaan("0");
        telahmenambahangka = true;
    }

    public void titikf(ActionEvent actionEvent) {
        menambahpersamaan(".");
    }

    public void Clear1(ActionEvent actionEvent) {
        persamaan = "";
        Text.setText(persamaan);
        Texthasil.setText(persamaan);
    }
}
