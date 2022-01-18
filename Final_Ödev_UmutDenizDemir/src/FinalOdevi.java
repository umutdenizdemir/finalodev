import java.time.LocalDateTime;


public class FinalOdevi {
    public static void main(String args[]) {


        System.out.println("***Mühendis Bilgisi***\n");

        Muhendis muh = new Muhendis("ZORTİNGEN","ŞTRAYZE",1931,"Bilgisayar",
                "JAVA",2020,40000,39,13.2f);

        muh.Bilgi();
        muh.Zam(39);
        muh.Zam(10.2f);


        System.out.println("\n***Doktor Bilgisi***\n");

        Doktor dok = new Doktor("Umut Deniz", "DEMİR", 2002,
                "Egitim Arastirma", "CERRAH", 30, 2010,
                31940,45,12.5f);

        dok.Bilgi();
        dok.Zam(39);
        dok.Zam(10.2f);

        System.out.println("\n***Öğretmen Bilgisi***\n");

        Ogretmen ogr = new Ogretmen("ZART ECE","ZORT",2001,"İNGİLİZCE",
                2020,46,9674,57,21.0f);

        ogr.Bilgi();
        ogr.Zam(42);
        ogr.Zam(13.2f);

    }
}


