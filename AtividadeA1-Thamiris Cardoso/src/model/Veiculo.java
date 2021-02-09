/* */
package model;

/**
 *
 * @author thamiriscardoso
 */
public class Veiculo {
    private int id;
    private String placa;
    private Modelo modelo;
    
    public Veiculo(int id, String placa, Modelo modelo){
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the modelo
     */
    public Modelo getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
    
    
}
