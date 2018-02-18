package facade;

public class TeaFacadeDemo {
    public static void main(String[] args){
        TeaCup blueCup = new TeaCup();
        Water water = new Water();
        TeaInfuser infuser = new TeaInfuser();
        TeaFacade teaMaker = new TeaFacade(blueCup,water,infuser);
        teaMaker.makeTea("Earl Grey");

    }
}
