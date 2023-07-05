package pooguiaextra4;

import Service.RectanguloService;

public class POOGuiaExtra4 {

    public static void main(String[] args) {
        
        RectanguloService recS = new RectanguloService();
        
        Rectangulo rect = recS.crearReactangulo();
        System.out.println("----------------------------------------------");
        System.out.println("");
        System.out.println("Superficie: " + RectanguloService.calcularSuperficie(rect));
        System.out.println("");
        
        System.out.println("Perímetro: " + RectanguloService.calcularPerimetro(rect));
        System.out.println("");
        
        recS.dibujarRectangulo(rect);
    }
    
}
