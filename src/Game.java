import java.util.ArrayList;

class Game {

    static void fullTournament() throws Exception {
        ArrayList<IAgent> al = new ArrayList<IAgent>();
        al.add(new PrescientMoron());
        al.add(new Mixed());
        al.add(new Human());
        al.add(new Blitz());
        al.add(new SittingDuck());
        al.add(new AggressivePack());
        al.add(new Winner2015a());
        al.add(new Winner2015b());
        al.add(new Winner2016a());
        al.add(new BrandtZach());

        Controller.doTournament(al);
    }

    public static void main(String[] args) throws Exception {
        //Controller.doBattle(new Winner2015a(), new BrandtZach());
        //Controller.doBattle(new Mixed(), new Blitz());
        //Controller.doBattle(new Mixed(), new AggressivePack());
        //Controller.doBattle(new Blitz(), new Mixed());
        //Controller.doBattle(new Human(), new SittingDuck());
        //Controller.doBattle(new Mixed(), new SittingDuck());
        //Controller.doBattle(new Human(), new Blitz());
        //Controller.doBattle(new PrescientMoron(), new SittingDuck());
        //Controller.doBattle(new PrescientMoron(), new Human());
        //Controller.doBattle(new Human(), new PrescientMoron());
        //Controller.doBattle(new BrandtZach(), new Mixed());
        Controller.doBattle(new BrandtZach(), new WebbNathaniel());
    }
}
