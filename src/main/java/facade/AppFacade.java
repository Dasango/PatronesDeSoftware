package facade;

import facade.inter.ComputadorFacade;

public class AppFacade {

    public static void main(String[] args) {
        ComputadorFacade cf= new ComputadorFacade();
        cf.construirComputador("SanDisk Extreme SSD", "G.Skill Trident Z Neo 3600", "AMD Ryzen 7 7800X3D");
    }
}
