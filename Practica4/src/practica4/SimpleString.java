/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

/**
 *
 * @author FCFM
 */
public class SimpleString {
    private String str;
    public SimpleString(){
        this("");
    }
    
    public SimpleString(String cadena){
        setStr(cadena);
    }
    
    public int count(){
        int x = 0;
        for(char a:str.toCharArray()){
            x++;
        }
        return x;
    }
    public boolean compare(String other){
        return str==other;
    }
    public char[] order(){
        char[] word_array= str.toCharArray();
        return quickSort(word_array, 0, this.count()-1);
    }
    public char[] quickSort(char[] arr, int low, int high){
        int i = low;
        int j = high;
        int pivot =(arr[i]+arr[j])/2;
        while (i<j){
            while(arr[i]<pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(j>=i){
                char x = arr[i];
                arr[i] = arr[j];
                arr[j] = x;
                i++;
                j--;
            }
        }
        if(low<j){
            quickSort(arr, low, j);
        }
        if(high>i){
            quickSort(arr, i, high);
        }
        return arr;
        
    }
    public char[] split(int limit) {
    	char[] change = new char[limit];
    	int count = 0;
    	for(char a:str.toCharArray()) {
    		if(count<limit) {
    			change[count] =  a;
    		}
    		count++;
    	}
    	return change;
    }
    public String join(String str2) {
    	return str+str2;
    }
    /**
     * @return the str
     */
    public String getStr() {
        return str;
    }

    /**
     * @param str the str to set
     */
    public void setStr(String str) {
        this.str = str;
    }
    
    
}
