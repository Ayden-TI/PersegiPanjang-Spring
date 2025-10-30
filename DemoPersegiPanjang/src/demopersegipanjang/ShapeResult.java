/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demopersegipanjang;

/**
 * Ini adalah POJO (Plain Old Java Object).
 * Tugasnya hanya membawa data hasil kalkulasi.
 */
public class ShapeResult {
    
    private final String shapeType; // "Bujur sangkar" atau "Persegi Panjang"
    private final double keliling;
    private final double luas;

    public ShapeResult(String shapeType, double keliling, double luas) {
        this.shapeType = shapeType;
        this.keliling = keliling;
        this.luas = luas;
    }

    // Getters untuk mengambil data
    public String getShapeType() {
        return shapeType;
    }

    public double getKeliling() {
        return keliling;
    }

    public double getLuas() {
        return luas;
    }
}
