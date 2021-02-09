/**/
package controller;

import java.util.Scanner;
import model.Marca;
import model.Modelo;
import model.Veiculo;

/**
 *
 * @author thamiriscardoso
 */
public class MainApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Registro de Veículo:");
        
        System.out.println("Digite o identificador e a Marca:");
        Marca ma1 = new Marca(sc.nextInt(),sc.nextLine());
        
        System.out.println("Digite o identificador e o Modelo:");
        Modelo mo1 = new Modelo(sc.nextInt(),sc.nextLine(),ma1);
        
        System.out.println("Digite o identificador, a placa");
        Veiculo v1 = new Veiculo(sc.nextInt(),sc.nextLine(),mo1);
        
        System.out.println("Dados do Veículo:");
        System.out.println("id:"+v1.getId());
        System.out.println("Placa:"+v1.getPlaca());
        System.out.println("Modelo:"+v1.getModelo().getDescricao());
        System.out.println("Marca:"+v1.getModelo().getMarca().getNome());
    }
}
