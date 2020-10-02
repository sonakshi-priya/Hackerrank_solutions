/*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static List<Integer> dynamicArray(int N, List<List<Integer>> queries) {
        List<List<Integer>> seqList = new ArrayList<List <Integer>>(N);
        for(int i = 0; i < N; i++)  {
        seqList.add(new ArrayList<Integer>());
    }
        List<Integer> ans = new ArrayList<>();
        int lastAnswer = 0;
        for(List<Integer> query: queries){
            int x=query.get(1);
            int y=query.get(2);
            if(query.get(0)==1){
                
                int index= (x^lastAnswer)%N;
                System.out.println ("Adding " + y +" to " + index);
                List<Integer> seq=seqList.get(index);
                seq.add(y);
            }else{
                int index = (x^lastAnswer)%N;
                List<Integer> seq = seqList.get(index);
                int size = seq.size();
                System.out.println ("Size of " + index +" = " + size);
                lastAnswer = seq.get(y%size);
                ans.add(lastAnswer);
            }
            
        } 
    return ans;
    }
