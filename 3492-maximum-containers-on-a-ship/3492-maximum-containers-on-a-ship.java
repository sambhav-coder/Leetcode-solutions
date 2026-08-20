class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int cell = n*n;
        int weight = maxWeight / w;
        return Math.min(cell,weight);
    }
}