import java.time.LocalDateTime;
import java.util.Calendar;

public class Doktor extends Insan{

    String dokAlani;
    String uzmAlani;
    int ameliyatSayisi;
    int baslamaYili;
    int tecrube;
    float maas;


    Doktor() {
        dokAlani="";
        uzmAlani="";
        ameliyatSayisi=0;
        baslamaYili=0;
        tecrube=0;
        maas=0;

    }
    Doktor(String ad,String soyad,int dogumyili,String dokAlani,String uzmAlani,int ameliyatSayisi,
           int baslamaYili,float maas,int zamMiktarı, float zamOrani) {

        super(ad,soyad,dogumyili);
        this.dokAlani = dokAlani;
        this.uzmAlani = uzmAlani;
        this.ameliyatSayisi = ameliyatSayisi;
        this.baslamaYili = baslamaYili;
        this.tecrube = tarihHesapla(baslamaYili);
        this.maas = maas;
    }

    void Bilgi(){
        System.out.println("Kişinin Adi : " + this.ad +
                "\nKişinin Soyadi :" +this.soyad +
                "\nKişinin Yasi :" +this.yas +
                "\nDoktorluk Alani :" +this.dokAlani +
                "\nUzmanlik Alani :" +this.uzmAlani +
                "\nAmeliyat Sayisi :" +this.ameliyatSayisi +
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
