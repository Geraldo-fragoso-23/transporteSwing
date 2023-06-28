/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transporte;

/**
 *
 * @author HP
 */
public class TransporteLocal extends Transporte {
    public String local;
    public TransporteLocal(int Id, String origem, String destino, String dataViagem, double preco, boolean cancelar, String local) {
        super(Id, origem, destino, dataViagem, preco, cancelar);
        this.local=local;
    }

    @Override
    public String toString() {
        return "Transporte Local: "+super.toString()+" local=" + local + '}';
    }

   
    

}
