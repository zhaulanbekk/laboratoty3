package com.company;

public class Main {

    public static void main(String[] args) {
        Cow cow = new Cow("Konur",5,150);
        Cow cow1 = new Cow("Ala-too",4,145);
        Cow cow2 = new Cow("Kara-Too",6,176);
        Cow cow3 = new Cow("Russian",3,205);
        Cow cow4 = new Cow("Vietnam",1,140);
        Cow cow5 = new Cow("Chinese",9,300);
        Cow cow6 = new Cow("Batken's",1,105);

        Horse horse=new Horse("Ahiles",9,800);
        Horse hors2=new Horse("Gerkules",7,1207);
        Horse horse3=new Horse("Boyka",4,600);
        Horse horse4=new Horse("Messi",2,357);
        Horse horse5=new Horse("Teltoru",6,789);
        Horse horse6=new Horse("Pershoron",12,987);
        Horse horse7=new Horse("Fancy",9,543);

        Lamb lamb=new Lamb("lamby",1,8);
        Lamb lamb2=new Lamb("Puff",2,10);
        Lamb lamb3=new Lamb("Whisper",3,18);
        Lamb lamb4=new Lamb("Cupcake",4,50);
        Lamb lamb5=new Lamb("Bashful",5,34);
        Lamb lamb6=new Lamb("Kozubek",6,28);
        Lamb lamb7=new Lamb("Kozugul",5,47);
        Lamb lamb8=new Lamb("Chex",4,19);
        Lamb lamb9=new Lamb("Norman",3,25);
        Lamb lamb10=new Lamb("Barry",2,14);
        Lamb lamb11=new Lamb("Moses",1,10);
        Lamb lamb12=new Lamb("Jasper",1,8);



        Cow[] pastureCows = new Cow[]{cow,cow1,cow2,cow3,cow4};
        Cow []pasture2Cows=new Cow[]{cow5,cow6};

        Horse[] pastureHorses=new Horse[]{horse,hors2};
        Horse[] pasture2Horses=new Horse[]{horse3,horse4,horse5,horse6,horse7};

        Lamb []pastureLamb=new Lamb[]{lamb,lamb2,lamb3,lamb4,lamb5,lamb6,lamb7,lamb8};
        Lamb []pasture2Lamb=new Lamb[]{lamb9,lamb10,lamb11,lamb12};

        Pasture pasture=new Pasture("Ala-Archa","Isyk-kul","Dastan",pastureCows,pastureHorses,pastureLamb);
        System.out.println(pasture);
        System.out.println("_________________________________________________________'_");
        Pasture pasture2=new Pasture("Ak-Kaiyn","Batken","Nurdin",pasture2Cows,pasture2Horses,pasture2Lamb);
        System.out.println(pasture2);

    }
}
