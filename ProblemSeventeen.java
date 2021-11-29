class ProblemSeventeen{
    public static void main(String[] args){

    }

    public static boolean allLess(int[] FirstArr, int[] SecondArr){
        if (FirstArr.length != SecondArr.length) {
        return false;
    }
    else{
        for (int a = 0; a < FirstArr.length; a++) {
        if (FirstArr[a] >= list2[a]) {
            return false;
        }
    }
    return true;
    }
}