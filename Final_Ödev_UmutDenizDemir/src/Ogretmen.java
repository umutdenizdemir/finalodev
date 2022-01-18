import java.time.LocalDateTime;
import java.util.Calendar;

public class Ogretmen extends Insan{

    String brans;
    int baslamaYili;
    int tecrube;
    int dersSaati;
    float maas;
    int yil;

    Ogretmen() {
        brans="";
        baslamaYili=0;
        tecrube=0;
        dersSaati=0;
        maas=0;
        yil=LocalDateTime.now().getYear();
    }


    Ogretmen(String ad,String soyad,int dogumyili,String brans,int baslamaYili,int dersSaati,float maas,int zamMiktarı,
             float zamOrani) {

        super(ad,soyad,dogumyili);
        this.brans = brans;
        this.baslamaYili = baslamaYili;
        this.tecrube = tarihHesapla(baslamaYili);
        this.dersSaati = dersSaati;
        this.maas = maas;
    }

    void Bilgi(){
        System.out.println("Kişinin Adi : " + this.ad +
                "\nKisinin Soyadi :" +this.soyad +
                "\nKisinin Yasi :" +this.yas +
                "\nKisinin Bransi :" +this.brans +
                "\nDers Saati :" +this.dersSaati +
                "\nTecrubesi :" +this.tecrube +
                "\nMaas :" +this.maas );
    }


    void Zam(int zamMiktari){
        this.maas = this.maas + zamMiktari;
        System.out.println("Kişinin " + zamMiktari +" tl ile birlikte zamlı maaşı : " + this.maas);
    }

    void Zam(float zamOrani){
        float zamMiktari = this.maas * zamOrani/100;
        this.maas = this.maas + zamMiktari;
        System.out.println("Kişinin " + zamOrani +" zam oranı ile birlikte maaşı : " + this.maas);
    }

    public int tarihHesapla(int baslamaYili){
        Calendar simdi = Calendar.getInstance();
        int yil = simdi.get(Calendar.YEAR);
        int tecrube =yil-baslamaYili;
        return tecrube;
    }

}
