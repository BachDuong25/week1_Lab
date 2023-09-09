/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package function;

/**
 *
 * @author ADMIN
 */
public class Validate {
        public int checkNum(String num) throws Exception {
        int value = Integer.parseInt(num);
        if (value < 0 || value > 4) throw new Exception("Out of range");
        return value;
    }
//------------------------------------------------------------

}
