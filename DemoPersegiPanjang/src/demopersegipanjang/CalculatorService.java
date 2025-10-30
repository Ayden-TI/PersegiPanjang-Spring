/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demopersegipanjang;

/**
 * Ini adalah "Service" atau "Component".
 * Tugasnya HANYA melakukan kalkulasi dan logika bisnis.
 * Dia tidak tahu menahu soal input (Scanner) atau output (System.out.println).
 */
public class CalculatorService {
    
    public ShapeResult calculate(double p, double l) {
        // 1. Logika Kalkulasi
        double keliling = 2 * (p + l);
        double luas = p * l;
        
        // 2. Logika Penentuan Bentuk
        String shapeType;
        if (p == l) {
            shapeType = "Bujur sangkar";
        } else {
            shapeType = "Persegi Panjang";
        }
        
        // 3. Kembalikan hasil dalam bentuk objek
        return new ShapeResult(shapeType, keliling, luas);
    }
}
