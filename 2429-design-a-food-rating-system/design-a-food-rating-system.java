class FoodRatings {
    static class node{ 
      String count;
      int rate;
      node(String count,int rate){
          this.count=count;
          this.rate=rate;
      }
    }
static HashMap<String,TreeMap<Integer,TreeSet<String>>>mp;
static HashMap<String,node> mp1;
    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        mp=new HashMap<>();
        mp1=new HashMap<>();

        for(int i=0;i<foods.length;i++){ 
            //bada map
            if(!mp.containsKey(cuisines[i])){
                mp.put(cuisines[i],new TreeMap<>());
            }
    
            if(!mp.get(cuisines[i]).containsKey(ratings[i])){ 
                mp.get(cuisines[i]).put(ratings[i],new TreeSet<>());
            }

            mp.get(cuisines[i]).get(ratings[i]).add(foods[i]);

            // chota map

            if(!mp1.containsKey(foods[i])){ 
                mp1.put(foods[i],new node(cuisines[i],ratings[i]));
            }

             

        }
       
    }
    
    public void changeRating(String food, int newRating) {
        String count=mp1.get(food).count;
        int rate=mp1.get(food).rate;

        mp.get(count).get(rate).remove(food);


        if(!mp.get(count).containsKey(newRating)){ 
                mp.get(count).put(newRating,new TreeSet<>());
        }

   mp.get(count).get(newRating).add(food);
//    System.out.println(mp.get(count));
        if(mp.get(count).get(rate).size()<=0){ 
            //    System.out.println(mp.get(count));
           mp.get(count).remove(rate);
        }

     

        mp1.get(food).rate=newRating;

    }
    
    public String highestRated(String cuisine) {

TreeMap<Integer,TreeSet<String>> newMap=mp.get(cuisine);

return newMap.get(newMap.lastKey()).first();
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */