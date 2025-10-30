/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demopersegipanjang;

/**
 * File 'main' ini bertindak sebagai "Spring IoC Container" (versi simulasi).
 * Tugasnya adalah "merakit" (wiring) semua komponen dan menjalankan aplikasi.
 */
public class DemoPersegiPanjang {

    public static void main(String[] args) {
        
        // --- Area Inversion of Control (IoC) ---
        
        // 1. Container membuat semua 'bean' (komponen) yang dibutuhkan.
        System.out.println("[Container] Membuat CalculatorService...");
        CalculatorService service = new CalculatorService();
        
        // 2. Container membuat 'bean' aplikasi.
        System.out.println("[Container] Membuat ShapeApplication...");
        // 3. Container "menyuntikkan" (Inject) 'service' ke dalam 'app'.
        ShapeApplication app = new ShapeApplication(service);
        
        // --- Akhir dari Area IoC ---

        // 4. Container memberi tahu aplikasi untuk mulai bekerja.
        System.out.println("\n[Aplikasi] Mulai berjalan...\n");
        app.run();
    }
}
