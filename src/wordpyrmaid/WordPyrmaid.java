/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordpyrmaid;
import javax.swing.JOptionPane;

/**
 *
 * @author Gloria Song
 */
public class WordPyrmaid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WordPyrmaid.pyrmid(JOptionPane.showInputDialog("What word would you like to get pyrmided?"));
    }

    private static void pyrmid(final String word) {
        System.out.println(word);
        if (word.length() == 1 || word.length() == 2) {
            return;
        }
        WordPyrmaid.pyrmid(word.substring(1, word.length() - 1));
    }
    
}
