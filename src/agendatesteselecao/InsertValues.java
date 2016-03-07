package agendatesteselecao;
import javax.swing.JOptionPane;

public class InsertValues {  
    void insertValores(){
        String foneAmountStr;
        int foneAmountInt;
        String foneArray[];
        
        try {
            foneAmountStr = JOptionPane.showInputDialog(null, 
                    "Digite o número de telefones");
             foneAmountInt = Integer.parseInt(foneAmountStr);
            
             foneArray = new String[foneAmountInt];
            
            if (foneAmountInt <= 0) {
                JOptionPane.showMessageDialog(null, "Número digitado menor que zero");
            }
            
            for (int index = 1; index <= foneAmountInt; index++) {
                
                foneArray[index -1] = JOptionPane.showInputDialog("Digite o " + index + " telefone");
                 
            }
            FoneProcess FoneProcess;
            
            FoneProcess = new FoneProcess();
            FoneProcess.setFonesArray(foneArray);
            int EmptyField = FoneProcess.retunAmountFieldEmpty();
            
            JOptionPane.showMessageDialog(null,EmptyField + " espaços preenchidos" );
        } catch (NumberFormatException  e) {
            JOptionPane.showMessageDialog(null,"Você não digitou um número");
        }
    }
      
}
