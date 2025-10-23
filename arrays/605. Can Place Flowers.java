class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        //n is the amounth of flowers
        //Kan endast planeras om
        //1. nuvarande är 0
        //den föregående var 0 och den nästa är 0


        //Finns ju undantasfall för första och sista elementet
        //Om första så 1. nuvarande 0 och följande 0
        //Om sista nuvarande 0 och den föregående var 0

        //Går igenom arrayn och analyserar varje position
        for(int i = 0;i<flowerbed.length;i++){
            //om arrayns längd är 1
            if(flowerbed.length == 1){
                if(flowerbed[i] == 0){
                    flowerbed[i] = 1;
                    n = n -1;
                }
            }
            //första position
            if(i == 0){
                if(flowerbed[i] == 0 && flowerbed[i+1] == 0){
                    flowerbed[i] = 1;
                    n = n -1;
                }
            }
            //sista position
            else if(i == flowerbed.length - 1){
                if(flowerbed[i] == 0 && flowerbed[i-1] == 0){
                    flowerbed[i] = 1;
                    n = n -1;
                }
                return n <= 0;
            }

            //Alla andra positioner emellan
            else if(flowerbed[i] == 0 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0){
                flowerbed[i] = 1;
                n = n -1;
            }

        }

        if(n <= 0){
            return true;
        }
        else{
            return false;
        }


    }
}