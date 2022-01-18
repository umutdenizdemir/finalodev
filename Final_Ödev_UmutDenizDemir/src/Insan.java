import java.time.LocalDateTime;
import java.util.Calendar;

public class Insan {





    String ad;
    String soyad;
    int dogumyili;
    int yas;
    int yil;

    Insan() {
        ad = "EMİR";
        soyad = "ERTUNÇ";
        dogumyili = 2001;
        yil = LocalDateTime.now().getYear();
    }

    Insan(String ad,String soyad,int dogumyili) {
        this.ad = ad;
        this.soyad = soyad;
        this.dogumyili = dogumyili;
        this.yas = yashesapla(dogumyili);
    }

    private int tarihHesapla(int baslamaYili){
        Calendar simdi = Calendar.getInstance();
        int yil = simdi.get(Calendar.YEAR);
        int tecrube =yil-baslamaYili;
        return tecrube;
    }

    public int yashesapla(int dogumyili){
        Calendar simdi = Calendar.getInstance();
        int yil = simdi.get(Calendar.YEAR);
        int yas =yil-dogumyili;
        return yas;
    }

}