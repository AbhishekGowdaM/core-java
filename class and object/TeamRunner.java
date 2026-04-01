class TeamRunner{

    public static void main(String[] args) {

        IPLTeam t1 = new IPLTeam("RCB","Faf","Andy","Chinnaswamy",0,"Owner1","Bangalore",25,"Sponsor1",1);
        IPLTeam t2 = new IPLTeam("MI","Rohit","Mahela","Wankhede",5,"Owner2","Mumbai",25,"Sponsor2",2);
        IPLTeam t3 = new IPLTeam("CSK","Dhoni","Fleming","Chepauk",5,"Owner3","Chennai",25,"Sponsor3",3);
        IPLTeam t4 = new IPLTeam("KKR","Iyer","Chandrakant","Eden",2,"Owner4","Kolkata",25,"Sponsor4",4);
        IPLTeam t5 = new IPLTeam("SRH","Cummins","Lara","Hyderabad",1,"Owner5","Hyderabad",25,"Sponsor5",5);

        IPLTeam t6 = new IPLTeam("RR","Samson","Sangakkara","Jaipur",1,"Owner6","Jaipur",25,"Sponsor6",6);
        IPLTeam t7 = new IPLTeam("DC","Pant","Ponting","Delhi",0,"Owner7","Delhi",25,"Sponsor7",7);
        IPLTeam t8 = new IPLTeam("PBKS","Dhawan","Bayliss","Punjab",0,"Owner8","Punjab",25,"Sponsor8",8);
        IPLTeam t9 = new IPLTeam("GT","Gill","Nehra","Ahmedabad",1,"Owner9","Ahmedabad",25,"Sponsor9",9);
        IPLTeam t10 = new IPLTeam("LSG","Rahul","Flower","Lucknow",0,"Owner10","Lucknow",25,"Sponsor10",10);

        IPLTeam t11 = new IPLTeam("Team11","Cap11","Coach11","Ground11",0,"Owner11","City11",25,"Sponsor11",11);
        IPLTeam t12 = new IPLTeam("Team12","Cap12","Coach12","Ground12",0,"Owner12","City12",25,"Sponsor12",12);
        IPLTeam t13 = new IPLTeam("Team13","Cap13","Coach13","Ground13",0,"Owner13","City13",25,"Sponsor13",13);
        IPLTeam t14 = new IPLTeam("Team14","Cap14","Coach14","Ground14",0,"Owner14","City14",25,"Sponsor14",14);
        IPLTeam t15 = new IPLTeam("Team15","Cap15","Coach15","Ground15",0,"Owner15","City15",25,"Sponsor15",15);

        IPLTeam t16 = new IPLTeam("Team16","Cap16","Coach16","Ground16",0,"Owner16","City16",25,"Sponsor16",16);
        IPLTeam t17 = new IPLTeam("Team17","Cap17","Coach17","Ground17",0,"Owner17","City17",25,"Sponsor17",17);
        IPLTeam t18 = new IPLTeam("Team18","Cap18","Coach18","Ground18",0,"Owner18","City18",25,"Sponsor18",18);
        IPLTeam t19 = new IPLTeam("Team19","Cap19","Coach19","Ground19",0,"Owner19","City19",25,"Sponsor19",19);
        IPLTeam t20 = new IPLTeam("Team20","Cap20","Coach20","Ground20",0,"Owner20","City20",25,"Sponsor20",20);

        IPLTeam t21 = new IPLTeam("Team21","Cap21","Coach21","Ground21",0,"Owner21","City21",25,"Sponsor21",21);
        IPLTeam t22 = new IPLTeam("Team22","Cap22","Coach22","Ground22",0,"Owner22","City22",25,"Sponsor22",22);
        IPLTeam t23 = new IPLTeam("Team23","Cap23","Coach23","Ground23",0,"Owner23","City23",25,"Sponsor23",23);
        IPLTeam t24 = new IPLTeam("Team24","Cap24","Coach24","Ground24",0,"Owner24","City24",25,"Sponsor24",24);
        IPLTeam t25 = new IPLTeam("Team25","Cap25","Coach25","Ground25",0,"Owner25","City25",25,"Sponsor25",25);

        System.out.println(t1.name+" "+t1.captain+" "+t1.coach+" "+t1.homeGround+" "+t1.titles+" "+t1.owner+" "+t1.city+" "+t1.playersCount+" "+t1.sponsor+" "+t1.ranking);
        System.out.println(t2.name+" "+t2.captain+" "+t2.coach+" "+t2.homeGround+" "+t2.titles+" "+t2.owner+" "+t2.city+" "+t2.playersCount+" "+t2.sponsor+" "+t2.ranking);
        System.out.println(t3.name+" "+t3.captain+" "+t3.coach+" "+t3.homeGround+" "+t3.titles+" "+t3.owner+" "+t3.city+" "+t3.playersCount+" "+t3.sponsor+" "+t3.ranking);
        System.out.println(t4.name+" "+t4.captain+" "+t4.coach+" "+t4.homeGround+" "+t4.titles+" "+t4.owner+" "+t4.city+" "+t4.playersCount+" "+t4.sponsor+" "+t4.ranking);
        System.out.println(t5.name+" "+t5.captain+" "+t5.coach+" "+t5.homeGround+" "+t5.titles+" "+t5.owner+" "+t5.city+" "+t5.playersCount+" "+t5.sponsor+" "+t5.ranking);

        System.out.println(t6.name+" "+t6.captain+" "+t6.coach+" "+t6.homeGround+" "+t6.titles+" "+t6.owner+" "+t6.city+" "+t6.playersCount+" "+t6.sponsor+" "+t6.ranking);
        System.out.println(t7.name+" "+t7.captain+" "+t7.coach+" "+t7.homeGround+" "+t7.titles+" "+t7.owner+" "+t7.city+" "+t7.playersCount+" "+t7.sponsor+" "+t7.ranking);
        System.out.println(t8.name+" "+t8.captain+" "+t8.coach+" "+t8.homeGround+" "+t8.titles+" "+t8.owner+" "+t8.city+" "+t8.playersCount+" "+t8.sponsor+" "+t8.ranking);
        System.out.println(t9.name+" "+t9.captain+" "+t9.coach+" "+t9.homeGround+" "+t9.titles+" "+t9.owner+" "+t9.city+" "+t9.playersCount+" "+t9.sponsor+" "+t9.ranking);
        System.out.println(t10.name+" "+t10.captain+" "+t10.coach+" "+t10.homeGround+" "+t10.titles+" "+t10.owner+" "+t10.city+" "+t10.playersCount+" "+t10.sponsor+" "+t10.ranking);

        System.out.println(t11.name+" "+t11.captain+" "+t11.coach+" "+t11.homeGround+" "+t11.titles+" "+t11.owner+" "+t11.city+" "+t11.playersCount+" "+t11.sponsor+" "+t11.ranking);
        System.out.println(t12.name+" "+t12.captain+" "+t12.coach+" "+t12.homeGround+" "+t12.titles+" "+t12.owner+" "+t12.city+" "+t12.playersCount+" "+t12.sponsor+" "+t12.ranking);
        System.out.println(t13.name+" "+t13.captain+" "+t13.coach+" "+t13.homeGround+" "+t13.titles+" "+t13.owner+" "+t13.city+" "+t13.playersCount+" "+t13.sponsor+" "+t13.ranking);
        System.out.println(t14.name+" "+t14.captain+" "+t14.coach+" "+t14.homeGround+" "+t14.titles+" "+t14.owner+" "+t14.city+" "+t14.playersCount+" "+t14.sponsor+" "+t14.ranking);
        System.out.println(t15.name+" "+t15.captain+" "+t15.coach+" "+t15.homeGround+" "+t15.titles+" "+t15.owner+" "+t15.city+" "+t15.playersCount+" "+t15.sponsor+" "+t15.ranking);

        System.out.println(t16.name+" "+t16.captain+" "+t16.coach+" "+t16.homeGround+" "+t16.titles+" "+t16.owner+" "+t16.city+" "+t16.playersCount+" "+t16.sponsor+" "+t16.ranking);
        System.out.println(t17.name+" "+t17.captain+" "+t17.coach+" "+t17.homeGround+" "+t17.titles+" "+t17.owner+" "+t17.city+" "+t17.playersCount+" "+t17.sponsor+" "+t17.ranking);
        System.out.println(t18.name+" "+t18.captain+" "+t18.coach+" "+t18.homeGround+" "+t18.titles+" "+t18.owner+" "+t18.city+" "+t18.playersCount+" "+t18.sponsor+" "+t18.ranking);
        System.out.println(t19.name+" "+t19.captain+" "+t19.coach+" "+t19.homeGround+" "+t19.titles+" "+t19.owner+" "+t19.city+" "+t19.playersCount+" "+t19.sponsor+" "+t19.ranking);
        System.out.println(t20.name+" "+t20.captain+" "+t20.coach+" "+t20.homeGround+" "+t20.titles+" "+t20.owner+" "+t20.city+" "+t20.playersCount+" "+t20.sponsor+" "+t20.ranking);

        System.out.println(t21.name+" "+t21.captain+" "+t21.coach+" "+t21.homeGround+" "+t21.titles+" "+t21.owner+" "+t21.city+" "+t21.playersCount+" "+t21.sponsor+" "+t21.ranking);
        System.out.println(t22.name+" "+t22.captain+" "+t22.coach+" "+t22.homeGround+" "+t22.titles+" "+t22.owner+" "+t22.city+" "+t22.playersCount+" "+t22.sponsor+" "+t22.ranking);
        System.out.println(t23.name+" "+t23.captain+" "+t23.coach+" "+t23.homeGround+" "+t23.titles+" "+t23.owner+" "+t23.city+" "+t23.playersCount+" "+t23.sponsor+" "+t23.ranking);
        System.out.println(t24.name+" "+t24.captain+" "+t24.coach+" "+t24.homeGround+" "+t24.titles+" "+t24.owner+" "+t24.city+" "+t24.playersCount+" "+t24.sponsor+" "+t24.ranking);
        System.out.println(t25.name+" "+t25.captain+" "+t25.coach+" "+t25.homeGround+" "+t25.titles+" "+t25.owner+" "+t25.city+" "+t25.playersCount+" "+t25.sponsor+" "+t25.ranking);
    }
}