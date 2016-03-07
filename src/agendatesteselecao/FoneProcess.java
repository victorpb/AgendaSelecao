package agendatesteselecao;

import java.util.Arrays;
import javax.swing.JOptionPane;

class FoneProcess {
    
    private String fonesArray[];
    //private String foneNumberRecord;
    private int ValuesArray[];
    

    void setFonesArray(String Array[] ){
        this.fonesArray = Array; 
    }
    
    int retunAmountFieldEmpty(){
        
        int index = fonesArray.length;
        
        ValuesArray = new int[fonesArray.length];
        ValuesArray[0] = fonesArray[0].length();
        
        for (int i = 0; i < index; i++) {
            for (int j = i + 1; j < index; j++){
            
                int indexLengh;
                if (fonesArray[i].length() < fonesArray[j].length()){
                    indexLengh = fonesArray[i].length();
                }
                else{
                    indexLengh = fonesArray[j].length() ;
                }
                
                for (int k = 0; k < indexLengh; k++){
                    if (fonesArray[i].charAt(k) != fonesArray[j].charAt(k)){                
                        if ((ValuesArray[j] > fonesArray[j].substring(k).length()) || (i == 0)){
                            
                            ValuesArray[j] = fonesArray[j].substring(k).length();
                        }
                        
                        break;
                    }    
                }
            }
        }
        //JOptionPane.showMessageDialog(null, Arrays.toString(ValuesArray));
        return SumArray(ValuesArray);
    }
    
    int SumArray(int array[]){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
           sum = sum + array[i]; 
        }
       return sum;
    }   
}