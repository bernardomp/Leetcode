class Solution {
    public String addStrings(String num1, String num2) {
    
        if(num1.length()<=num2.length()) {
            
            return sumaListaInt(num1,num2);
        }
        
        else {
            return sumaListaInt(num2,num1);
        }
        
        
    }
    
    public String sumaListaInt(String aa, String bb) {
        
        int ac = 0;
        int ax = 0;
        
        int la = aa.length();
        int lb = bb.length();
        
        char []a = aa.toCharArray();
        char []b = bb.toCharArray();
        
        
        String res = "";
    
        int bp = lb-1; 
        
        for(int i = la-1; i>-1; i--) {
                
            ax = toInt(b[bp]) + toInt(a[i]) + ac;
            res = ax%10 + "" + res;  
            ac = ax/10;
            bp--;
        }
            
        for(int j = bp; j>-1; j--) {
            ax = toInt(b[j]) + ac;
            res = ax%10 + "" + res;
            ac = ax/10;
        }
        
        if(ac!= 0) res = ac + "" + res;
            
        
        
        return res;
        
    }
    
    public int toInt(char d) {
        
        HashMap<Character,Integer> dicc = new HashMap();
        dicc.put('0',0);
        dicc.put('1',1);
        dicc.put('2',2);
        dicc.put('3',3);
        dicc.put('4',4);
        dicc.put('5',5);
        dicc.put('6',6);
        dicc.put('7',7);
        dicc.put('8',8);
        dicc.put('9',9);
        
       
        return dicc.get(d);
        
    }
}
