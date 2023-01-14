class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealthVal = accounts[0][0];
        int customerWealth = 0;
        for(int customer=0;customer<accounts.length;customer++)
        {
            customerWealth = 0;
            for(int bank = 0; bank<accounts[customer].length;bank++)
            {
                    customerWealth += accounts[customer][bank];
            }
            if(customerWealth>maxWealthVal)
                maxWealthVal = customerWealth;
        }
        return maxWealthVal;
    }
}