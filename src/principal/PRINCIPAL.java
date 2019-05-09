/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author AnaHernández
 */
public class PRINCIPAL {

  private static void dormir() {
    try { Thread.sleep(5000); }
    catch (InterruptedException ex) { 
      Thread.currentThread().interrupt(); 
    }
  }
  public static void main(String[] args) {
    System.out.println("3");
    dormir();
    System.out.println("2");
    dormir();
    System.out.println("1");
  }
}
    
