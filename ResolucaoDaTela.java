import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDaTela {

    public static void main (String [] args) {

        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();

        int largura = (int) tela.getWidth();
        int altura = (int) tela.getHeight();

        System.out.println("Resolução da tela: " + largura + "x" + altura);

    }
}
