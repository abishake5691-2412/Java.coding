class DuplicateChar{
    public static void main(String[] args){
        String s="abccbdea";
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(s.charAt(i)==s.charAt(j)){
                    System.out.println(s.charAt(i));
                }
            }
        }
    }
}