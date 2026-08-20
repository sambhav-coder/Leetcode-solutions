class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int deck=n*n;
        int container=0;
        while(deck>0){
            if(deck*w<=maxWeight){
                container=deck;
                break;
             }
            else{
                deck--;
             }

        }

        return container;
        
    }
    
}