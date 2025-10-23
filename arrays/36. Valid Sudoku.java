class Solution {
    public boolean isValidSudoku(char[][] board) {

        //String is the value integer is the count
        //if the value is in the hashmap return false.
        HashMap<Character, Integer> map = new HashMap<>();

        //start with checking the columns
        for(int i=0; i<9; i++){
            for(int j=0;j<9;j++){
                if(board[i][j] != '.'){
                    if(map.containsKey(board[i][j])){
                    return false;
                }else{
                    map.put(board[i][j], 1);
                }
                }

            }
            map.clear();
        }

        map.clear();

        //Next we check the rows
        for(int i=0; i<9; i++){
            for(int j=0;j<9;j++){
                if(board[j][i] != '.'){
                if(map.containsKey(board[j][i])){
                    return false;
                }else{
                    map.put(board[j][i], 1);
                }
                }
            }
            map.clear();
        }

        map.clear();

        //HashMap<String, Integer> map = new HashMap<>();
        //string=value, Integer= the square where 1, 2, 3,...
        //[row][col]
        HashMap<Integer, List<Character>> map2 = new HashMap<>();
        for(int i=0; i<9; i++){
            for(int j=0;j<9;j++){ //i = rows, j = col
                if (board[i][j] == '.') continue;
                    //1. kolla vilken ruta
                    //ruta 1 [0-2][0-2]
                    //ruta 2 [0-2][3-5]
                    //ruta 3 [0-2][6-8]
                    //ruta 4 [3-5][0-2]
                    //ruta 5 [3-5][3-5]
                    //ruta 6 [3-5][6-8]
                    //ruta 7 [6-8][0-2]
                    //ruta 8 [6-8][3-5]
                    //ruta 9 [6-8][6-8]
                //ruta 1-3
                if(i <= 2 ){
                    //ruta 1
                    if(j <= 2 ){
                        map2.putIfAbsent(1, new ArrayList<>());

                        if(map2.get(1).contains(board[i][j])){
                            return false;
                        }else{
                            map2.get(1).add(board[i][j]);
                        }

                    }
                    //ruta 2
                    if(j >= 3 && j <=5){
                        map2.putIfAbsent(2, new ArrayList<>());

                        if(map2.get(2).contains(board[i][j])){
                            return false;
                        }else{
                            map2.get(2).add(board[i][j]);
                        }
                     }
                    //ruta 3
                    if(j >= 6){
                        map2.putIfAbsent(3, new ArrayList<>());

                        if(map2.get(3).contains(board[i][j])){
                            return false;
                        }else{
                            map2.get(3).add(board[i][j]);
                        }
                    }
                }
                //ruta 4-6
                if(i >= 3 && i <=5){
                    //ruta 4
                    if(j <= 2 ){
                        map2.putIfAbsent(4, new ArrayList<>());

                        if(map2.get(4).contains(board[i][j])){
                            return false;
                        }else{
                            map2.get(4).add(board[i][j]);
                        }
                    }
                    //ruta 5
                    if(j >= 3 && j <=5){
                        map2.putIfAbsent(5, new ArrayList<>());

                        if(map2.get(5).contains(board[i][j])){
                            return false;
                        }else{
                            map2.get(5).add(board[i][j]);
                        }
                     }
                    //ruta 6
                    if(j >= 6){
                        map2.putIfAbsent(6, new ArrayList<>());

                        if(map2.get(6).contains(board[i][j])){
                            return false;
                        }else{
                            map2.get(6).add(board[i][j]);
                        }
                    }
                }
                //ruta 6-9
                if(i >= 6){
                    //ruta 7
                    if(j <= 2 ){
                        map2.putIfAbsent(7, new ArrayList<>());

                        if(map2.get(7).contains(board[i][j])){
                            return false;
                        }else{
                            map2.get(7).add(board[i][j]);
                        }
                    }
                    //ruta 8
                    if(j >= 3 && j <=5){
                        map2.putIfAbsent(8, new ArrayList<>());

                        if(map2.get(8).contains(board[i][j])){
                            return false;
                        }else{
                            map2.get(8).add(board[i][j]);
                        }
                     }
                    //ruta 9
                    if(j >= 6){
                        map2.putIfAbsent(9, new ArrayList<>());

                        if(map2.get(9).contains(board[i][j])){
                            return false;
                        }else{
                            map2.get(9).add(board[i][j]);
                        }
                    }
                }

                //2. kolla om key finns med det value
                //3. Om den finns return false
                //4. Om den inte finns lägg value, och den
                //givna rutan


            }
        }

        return true;
    }
}