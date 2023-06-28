/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transporte;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class TranporteTerrestre {
    private ArrayList<Transporte> viagens;

    public TranporteTerrestre() {
        viagens = new ArrayList<>();
    }

    
    
    public void registrarViagem(Transporte viagem){
        viagens.add(viagem);
        System.out.println("Viagem registrada com sucesso");
    }
    public void atualizarViagem(int id,String origem, String destino, String dataViagem, double preco){
        for(Transporte viagem: viagens){
            if(viagem.getId()==id){
                viagem.origem=origem;
                viagem.destino=destino;
                viagem.dataViagem=dataViagem;
                viagem.preco=preco;
                System.out.println("Viagem atualizada com sucesso");
                
                System.out.println("");
                System.out.println("");
                return;
            }
            
        }System.out.println("Viagem nao encontrada");
    }
    public void consultar(int id){
        for(Transporte viagem: viagens){
            if(viagem.getId()==id){
                System.out.println(viagem.toString());
                return;
            }
        }
        System.out.println("Viagem nao encontrada");
    }
    public void CancelarViagem(int Id){
        for (Transporte viagem:viagens){
            if(viagem.getId()==Id){
                if(viagem.isCancelar()){
                    System.out.println("Esta viagem foi ja cancelada");
                }else{
                    viagem.cancelarViagem();
                    System.out.println("Viajem cancelada");
                }
            }
        }
    }

    
    public void verListaViagem(){
        if(viagens.isEmpty()){
            System.out.println("Nao ha uma viagens registrada");
        }else{
            System.out.println("Lista de viagens ");
            for(Transporte viagem: viagens)
                System.out.println(viagem.toString());
        }
    }
    
    public int obterResultado(){
        int contador=0;
        for(Transporte viagem: viagens){
            if(!viagem.isCancelar()){
                contador++;
            }
        }
        System.out.println("Viajens Realizadas "+ contador);
        return contador;
    }
    public int obterResultadoCancelado(){
        int contador=0;
        for(Transporte viagem: viagens){
            if(viagem.isCancelar()){
                contador++;
            }
        }
        System.out.println("Viajens Canceladas "+contador);
        return contador;
    }
}
