/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demopersegipanjang;

import java.util.Scanner;

/**
 * Ini adalah "Aplikasi" utama.
 * Tugasnya menangani alur kerja dan I/O (input/output).
 * Kelas ini BUTUH 'CalculatorService' untuk bekerja.
 */
public class ShapeApplication {
    
    // --- Prinsip Dependency Injection (DI) ---
    // Kelas ini tidak membuat 'CalculatorService', tapi MENERIMA-nya.
    // Ini adalah 'dependency' (ketergantungan).
    private final CalculatorService calculator;

    // 'Dependency' disuntikkan (injected) melalui constructor
    public ShapeApplication(CalculatorService calculator) {
        this.calculator = calculator;
    }
    // --- Akhir dari DI ---

    
    // Metode utama untuk menjalankan aplikasi
    public void run() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan panjang (p): ");
        double p = input.nextDouble();
        
        System.out.print("Masukkan lebar (l): ");
        double l = input.nextDouble();
        
        // Menggunakan 'dependency' yang sudah disuntikkan
        // 'ShapeApplication' tidak peduli BAGAIMANA cara kalkulasi,
        // ia hanya percaya pada 'calculator' untuk melakukannya.
        ShapeResult result = calculator.calculate(p, l);
        
        // Menampilkan hasil
        System.out.println("--- Hasil ---");
        System.out.println("Bentuk    : " + result.getShapeType());
        System.out.println("Keliling  : " + result.getKeliling());
        System.out.println("Luas      : " + result.getLuas());
    }
}
