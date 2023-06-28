/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transporte;

/**
 *
 * @author HP
 */
public class TransporteInterProvicial extends Transporte {

    public TransporteInterProvicial(int Id, String origem, String destino, String dataViagem, double preco, boolean cancelar) {
        super(Id, origem, destino, dataViagem, preco, cancelar);
    }

    @Override
    public String toString() {
        return "Transporte Provincial: " +super.toString();
    }
    
    
}
