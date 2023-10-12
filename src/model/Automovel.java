
package model;

public class Automovel 
{
  private String tipoAutomovel;
  private String marcaAutomovel;
  private String placaAutomovel;
  
  public Automovel(String tipo, String marca, String placa)
  {
      this.tipoAutomovel = tipo;
      this.marcaAutomovel = marca;
      this.placaAutomovel = placa;
  }

    public String getTipoAutomovel() {
        return tipoAutomovel;
    }

    public void setTipoAutomovel(String tipoAutomovel) {
        this.tipoAutomovel = tipoAutomovel;
    }

    public String getMarcaAutomovel() {
        return marcaAutomovel;
    }

    public void setMarcaAutomovel(String marcaAutomovel) {
        this.marcaAutomovel = marcaAutomovel;
    }

    public String getPlacaAutomovel() {
        return placaAutomovel;
    }

    public void setPlacaAutomovel(String placaAutomovel) {
        this.placaAutomovel = placaAutomovel;
    }
  
    
    
}
