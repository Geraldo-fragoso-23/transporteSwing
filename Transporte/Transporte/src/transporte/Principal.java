/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transporte;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Principal {
 
    
      public static void main(String[] args) {
          Scanner input= new Scanner(System.in);
          System.out.println("Nome do cliente");
          String Nome=input.next();
          System.out.println("Idade do cliente");
          int idade=input.nextInt();
          System.out.println("Rua do cliente");
          String rua=input.next();
          System.out.println("Cidade do cliente");
          String cidade=input.next();
          System.out.println("Provincia do cliente");
          String provincia=input.next();
          System.out.println("Telefone do cliente");
          String telefone=input.next();
          System.out.println("Email do cliente");
          String email=input.next();
          Endereco endereco = new Endereco(rua,cidade,provincia);
          Contacto contacto = new Contacto(telefone,email);
          Cliente cliente= new Cliente(Nome,idade,endereco,contacto);
          
          System.out.println("");
          
            System.out.println("Digite a oriegem:");
                         String origem;
                         String destino;
                         String dataViagem;
                         double preco;
                         String local;
         TranporteTerrestre transporte= new TranporteTerrestre();
          System.out.println("Menu de control");
          int op;
          
        
         do{
          System.out.println("Menu ");
          System.out.println("1- TrasnporteLocal");
          System.out.println("2- Transporte Interprovincial");
          System.out.println("3-Sair");
           op=input.nextInt();
          int op2;
          switch(op){
              case 1:
                  do{
                  System.out.println("1- Registrar Viagem");
                  System.out.println("2- Consultar viagem");
                  System.out.println("3- Actualizar viagem");
                  System.out.println("4- Ver lista viagem");
                  System.out.println("5- Cancelar viagem");
                  System.out.println("6-Viagens canceladas e Realizadas");
                  System.out.println("7-Sair");
                  op2=input.nextInt();
                  
                 switch(op2){
                     case 1:
                         System.out.println("Digite a Id");
                         int Id=input.nextInt();
                         System.out.println("Digite o local da  oriegem:");
                          origem=input.next();
                         System.out.println("Digite o Local do destino");
                         destino= input.next();
                         System.out.println("Data da viagem");
                          dataViagem= input.next();
                         System.out.println("Preco da viagem");
                          preco= input.nextFloat();
                         System.out.println("Digite a provincia onde esta localizado");
                          local=input.next();
                         TransporteLocal  viagemL= new TransporteLocal(Id,origem,destino,dataViagem,preco,false,local);
                         transporte.registrarViagem(viagemL);
                         break;
                     case 2:
                         System.out.println("Digite o ide da viagem");
                         int idconsulta=input.nextInt();
                         transporte.consultar(idconsulta);
                         break;
                         
                     case 3:
                         System.out.println("Digite a Id");
                         Id=input.nextInt();
                         System.out.println("Digite o local da oriegem:");
                          origem=input.next();
                         System.out.println("Digite o local do destino");
                          destino= input.next();
                         System.out.println("Data da viagem");
                          dataViagem= input.next();
                         System.out.println("Preco da viagem");
                          preco= input.nextFloat();
                         System.out.println("Digite a provincia onde esta localizado");
                          local=input.next();
                         transporte.atualizarViagem(Id, origem, destino, dataViagem, preco);
                         break;
                     case 4:
                         
                         transporte.verListaViagem();
                         break;
                     case 5:
                         System.out.println("Digite a Id");
                         Id=input.nextInt();
                         transporte.CancelarViagem(Id);
                         break;
                     case 6:
                         transporte.obterResultado();
                         transporte.obterResultadoCancelado();
                         break;
                     case 7:
                         break;
                     default :
                         System.out.println("Digite valores correspondentes ao menu");
                   
                 }
                     
                 }while(op2!=7);
                  break;
              case 2:
                  do{
                  System.out.println("1- Registrar Viagem");
                  System.out.println("2- Consultar viagem");
                  System.out.println("3- Actualizar viagem");
                  System.out.println("4- Ver lista viagem");
                  System.out.println("5- Cancelar viagem");
                  System.out.println("6-Viagens canceladas e Realizadas");
                  System.out.println("7-Sair");
                  op2=input.nextInt();
                  
                 switch(op2){
                     case 1:
                         System.out.println("Digite a Id");
                         int Id=input.nextInt();
                         System.out.println("Digite a provincia de origem:");
                          origem=input.next();
                         System.out.println("Digite a provincia de destino:");
                         destino= input.next();
                         System.out.println("Data da viagem");
                          dataViagem= input.next();
                         System.out.println("Preco da viagem");
                          preco= input.nextFloat();
                         TransporteInterProvicial  viagemP= new TransporteInterProvicial(Id,origem,destino,dataViagem,preco,false);
                         transporte.registrarViagem(viagemP);
                         break;
                     case 2:
                         System.out.println("Digite o ide da viagem");
                         int idconsulta=input.nextInt();
                         transporte.consultar(idconsulta);
                         break;
                         
                     case 3:
                         System.out.println("Digite a Id");
                         Id=input.nextInt();
                         System.out.println("Digite a provincia de origem:");
                          origem=input.next();
                         System.out.println("Digite a provincia de destino:");
                          destino= input.next();
                         System.out.println("Data da viagem:");
                          dataViagem= input.next();
                         System.out.println("Preco da viagem: ");
                          preco= input.nextFloat();
                         System.out.println("Local da viagem:  ");
                          local=input.next();
                         transporte.atualizarViagem(Id, origem, destino, dataViagem, preco);
                         break;
                     case 4:
                         
                         transporte.verListaViagem();
                         break;
                     case 5:
                         System.out.println("Digite a Id: ");
                         Id=input.nextInt();
                         transporte.CancelarViagem(Id);
                         break;
                     case 6:
                         transporte.obterResultado();
                         transporte.obterResultadoCancelado();
                         break;
                     case 7:
                         
                         break;
                     default :
                         System.out.println("Digite valores correspondentes ao menu");
                   
                   
                 }
                     
                 }while(op2!=7);
                 break;
                  
          }
          
          
          
          
    }while(op!=3);
}
}
