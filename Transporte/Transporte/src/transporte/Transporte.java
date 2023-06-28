/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package transporte;

/**
 *
 * @author HP
 */
public class Transporte {

    public int Id;
    public String origem;
    public String destino;
    public String dataViagem;
    public double preco;
    public boolean cancelar;

    public Transporte(int Id, String origem, String destino, String dataViagem, double preco, boolean cancelar) {
        this.Id = Id;
        this.origem = origem;
        this.destino = destino;
        this.dataViagem = dataViagem;
        this.preco = preco;
        this.cancelar = false;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDataViagem() {
        return dataViagem;
    }

    public void setDataViagem(String dataViagem) {
        this.dataViagem = dataViagem;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isCancelar() {
        return cancelar;
    }

    public void setCancelar(boolean cancelar) {
        this.cancelar = cancelar;
    }
    public void cancelarViagem(){
        cancelar=true;
    }

    @Override
    public String toString() {
        return "Transporte: " + "Id=" + Id + ", origem=" + origem + ", destino=" + destino + ", dataViagem=" + dataViagem + ", preco=" + preco + ", cancelar=" + cancelar;
    }
    
   
    

    
}
