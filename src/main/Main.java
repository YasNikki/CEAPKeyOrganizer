
package main;

public class Main {

    public static void main(String[] args) {
        
        controller.Conexao_DB.carregaDriver();
        new view.Splash_CEAP_GUI().setVisible(true);
        
    }
    
}
