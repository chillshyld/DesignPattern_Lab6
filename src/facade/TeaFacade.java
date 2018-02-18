package facade;

public class TeaFacade {
    private TeaCup teaCup;
    private Water water;
    private TeaInfuser infuser;

    public TeaFacade(TeaCup teaCup, Water water, TeaInfuser infuser) {
        this.teaCup = teaCup;
        this.water = water;
        this.infuser = infuser;
    }

    public void makeTea(String teaType){
        this.infuser.addTea(new Tea(teaType));
        this.water.boilWater();
        this.teaCup.infuseTea(this.infuser);
        this.teaCup.addWater(this.water);
        this.teaCup.setSteepTime(15);
        this.teaCup.steep();

    }
}
