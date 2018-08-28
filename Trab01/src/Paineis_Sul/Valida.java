package Paineis_Sul;

import java.util.Calendar;

public class Valida {

    public boolean autentico;

    public Valida() {
        autentico = false;
    }

    public boolean isAutentico() {
        return autentico;
    }

    public void setAutentico(boolean autentico) {
        this.autentico = autentico;
    }
  
    public int anoActual() {
        Calendar c = Calendar.getInstance();
        return c.get(Calendar.YEAR); //  Retorna o ano actual
    }
    public String data_v(String dt) {
        //System.out.println(dt);
        String valido = "-";
        char ch = '-';
        int d, m, a, aux;
        char c1 = dt.charAt(2);
        char c2 = dt.charAt(5);

        if (dt.length() == 10) {
            if ((c1 == ch) && (c2 == ch)) {
                d = Integer.parseInt(dt.substring(0, 2));
                m = Integer.parseInt(dt.substring(3, 5));
                a = Integer.parseInt(dt.substring(6, 10));            
                
                    if (m >= 0 && m <= 12) {
                        switch (m) {
                            case 4:
                            case 6:
                            case 9:
                            case 11:
                                if (d < 31) {
                                    valido = dt;
                                } else {
                                    valido = ("Mes ivalido! Mes de "+m+" nao tem [31 dias]");
                                }
                                break;
                            case 2:
                                if (a % 2 == 0 && d > 28) {
                                    valido = ("Dia e mes ivalido. "+d+"/02/" + a + ", nao e verdade.");
                                } else if (a % 2 == 1 && d > 29) {
                                    valido = ("Dia e mes ivalido. "+d+"/02/" + a + ", nao e verdade.");
                                } else {
                                    valido = dt;
                                }
                                break;
                            default:
                                valido = dt;
                                break;
                        }
                    } else {
                        valido = (" Mes ivalido!");
                    }
                    

            } else {
                valido = (" Data ivalida! Modelo: [ aa-mm-aaaa ] -!" + c1 + " e " + c2);
            }
        } else {
            valido = ("Data ivalida! Modelo: [ aa-mm-aaaa ]. Longa " + dt.length());
        }
        return valido;
    }
}
