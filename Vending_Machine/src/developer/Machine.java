package developer;

public class Machine {
    int coins;
    int cans;
    int temp;
    int dispensed;

    public Machine(){
        cans=20;
        coins=0;
        temp=0;
        dispensed=0;
    }

    public void insert(int coin){
        if(coin % 2 ==0){//8
            temp=coin/2;    //4 for cans
            //coins=coins+coin;//+8
            dispensedeve(temp,coin);
        }
        else{//9
            temp=coin/2;//4 for cans
           // int r = coin % 2;//1 for remain coins
            //int sub= coin - r;//9-1=8
            //coins=coins+sub;//+8
            dispensedodd(temp,coin);
        }
    }
    public void dispensedeve(int t,int c){
        int i=1;
        int co=0;
        while(i<=t){
            if(cans!=0){
               cans = cans-1;
               coins= coins+2;
                dispensed++;
                co+=2;
                System.out.println("Total" + dispensed+" Cans are dispendsed.");
                i++;

        }
            else{
                System.out.println("Not enough cans are available...");
                refill();
            }
        }
        int coo = c-co;
        System.out.println(coo+" coins are returned...");
    }
    public void dispensedodd(int t,int c){
        int i=1;
        int co=0;
        while(i<=t){
            if(cans!=0){
                cans = cans-1;
                coins= coins+2;
                dispensed++;
                co+=2;
                System.out.println("Total" + dispensed+" Cans are dispendsed.");
                i++;

            }
            else{
                System.out.println("Not enough cans are available...");
                refill();
            }
        }
        int coo = c-co;
        System.out.println(coo+" coins are returned...");
    }
    public void refill(){
        cans=20;
        coins=0;
        temp=0;
        dispensed=0;

    }
}
