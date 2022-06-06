public class Main {
    public static void main(String[] args) {
        Area area1 = new Area("Ahmatov",1500);
        Area area2 = new Area("Tashmatov",1300);
        Area area3 = new Area("Tashtanov",1400);
        Area area4 = new Area("Samatov",1600);
        Area area5 = new Area("Arslanbaev",1700);
        Area area6 = new Area("Bekeshev",1300);
        Area area7 = new Area("Dastanov",1100);
        Area area8 = new Area("Bekturov",1700);
        Area area9 = new Area("Tilekova",1900);

Locality [] city1 = new Locality[3];
    city1[0] = area1;
    city1[1] = area2;
    city1[2] = area3;

Locality [] city2 = new Locality[3];
    city2[0] = area4;
    city2[1] = area5;
    city2[2] = area6;

Locality [] city3 = new Locality[3];
    city3[0] = area7;
    city3[1] = area8;
    city3[2] = area9;

city1[0].getMayor();
city2[1].getMayor();
city3[2].getMayor();
city1[2].getPopulation();

Village village1 = new Village();
village1.setMayor("Akim");
village1.setPopulation(500);
Village village2 = new Village();
village2.setMayor("Akim2");
village2.setPopulation(400);




    }
}
