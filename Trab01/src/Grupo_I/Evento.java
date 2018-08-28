package Grupo_I;

import java.io.Serializable;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Marondo
 */
public class Evento implements Serializable {

    private String título;
    private String data_realizacao;
    public String categoria;
    public String estado = "activo";
    private int nr_bilhetes_disponíveis;

    public Evento() {
        this.setEstado("Activo");
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getData_realizacao() {
        return data_realizacao;
    }

    public void setData_realizacao(String data_realizacao) {
        this.data_realizacao = data_realizacao;
    }

    public int getNr_bilhetes_disponíveis() {
        return nr_bilhetes_disponíveis;
    }

    public void setNr_bilhetes_disponíveis(int nr_bilhetes_disponíveis) {
        this.nr_bilhetes_disponíveis = nr_bilhetes_disponíveis;
    }

    public String valida_estado(String dt) {
        this.setEstado("Activo");
        Calendar c = Calendar.getInstance();
        int dr, mr, ar;
        int d_act = c.get(Calendar.DAY_OF_MONTH);
        int m_act = c.get(Calendar.MONTH);
        int a_act = c.get(Calendar.YEAR);
        if (dt != null && dt.length() > 1) {

            dr = Integer.parseInt(dt.substring(0, 2));
            mr = Integer.parseInt(dt.substring(3, 5));
            ar = Integer.parseInt(dt.substring(6, 10));

            if ((d_act > dr && m_act >= (mr - 1) && a_act >= ar)
                    || (m_act > mr && a_act >= ar)
                    || (a_act > ar)
                    || (this.getNr_bilhetes_disponíveis() == 0)) {
                this.setEstado("Desactivo");
            }
        }
        return this.getEstado();
    }

}
