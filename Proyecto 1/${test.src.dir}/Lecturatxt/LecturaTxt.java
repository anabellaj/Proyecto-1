
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Maria Daniela
 */
public class LecturaTxt {
    public void escribir_txt(){
        
        try{
            PrintWriter pw = new PrintWriter("test\\txt.txt");
            pw.append("Valeria,30112727");
            pw.append("\n");
            pw.append("Cesar,15412727");
            pw.close();
            JOptionPane.showMessageDialog(null, "Guardado exitoso");
            
        }catch(Exception err){
            JOptionPane.showMessageDialog(null, err);
        }
    }
    
    public String leertxt(String url){
        String line;  
        String grafo_txt="";
        File file = new File(url);
        try{
            if (!file.exists()){
                file.createNewFile();
            }else {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while((line = br.readLine())!= null){
                    if (!line.isEmpty()){
                        grafo_txt += line+ "\n";
                        
                        
                    } 
                }
                br.close();
                
               
                JOptionPane.showMessageDialog(null, "Lectura Exitosa");
                
            }
        }catch(Exception err){
             JOptionPane.showMessageDialog(null, "Error al momento de leer los clientes");
        }
//        System.out.println(grafo_txt);
        Scanner scanner = new Scanner(grafo_txt);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        return grafo_txt;
    }
}
