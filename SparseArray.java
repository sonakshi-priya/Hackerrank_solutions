// Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
        int results[] = new int[queries.length];
        int index=0;
        for(String query:queries){
            int count=0;
            for(String s: strings){
                if(query.equals(s)){
                  count++;  
                }
            }
            results[index]=count;
            index++;
        }
    return results;
