/**/
package model;

/**
 *
 * @author thamiricardoso
 */
public class Modelo {
    private int id;
    private String descricao;
    private Marca marca;
    
    public Modelo(int id, String descricao,Marca marca){
        this.id = id;
        this.descricao = descricao;
        this.marca = marca;
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
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the marca
     */
    public Marca getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    
    
}
