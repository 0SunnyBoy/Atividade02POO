package mainq02;

public class MainQ02 {

    public static void main(String[] args) {
        carro car1 = new carro();
        carro car2 = new carro();
        
        car1.setMarca("Ford");
        car1.setAno(2016);
        
        car2.setMarca("Toyota");
        car2.setAno(2025);
        
        System.out.println("Carro 1: " + car1.getMarca() + "-" + car1.getAno());
        System.out.println("Carro 2: " + car2.getMarca() + "-" + car2.getAno());
    }    
}
