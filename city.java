import java.util.Scanner;
class Newcity{
    String name;
    long population;

    Newcity(String name,long population){
        this.name=name;
        this.population=population;
    }
    void displayinfo(){
        System.out.println("city name is: "+name);
        System.out.println("population is: "+population);
    }
}

public class city {
    public static void main(String[] args) {
         Newcity[] cityname=new Newcity[5];
         cityname[0]=new Newcity("Aola",199238);
         cityname[1]=new Newcity("pcmc",199238);
         cityname[2]=new Newcity("delhi",199238);
         cityname[3]=new Newcity("nagpur ",199238);
         cityname[4]=new Newcity("pune",199238);

        for(int i=0;i<cityname.length;i++){
            cityname[i].displayinfo();
        }

    }
}
