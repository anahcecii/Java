import java.util.Locale;

public class IdiomaSistema {
    
    public static void main (String [] args) {

        Locale locale = Locale.getDefault();

        String idioma = locale.getLanguage();

        String pais = locale.getCountry();

        System.out.println("O idioma do sistema está em " + idioma);
        System.out.println("O país do sistema é " + pais);

    }
}