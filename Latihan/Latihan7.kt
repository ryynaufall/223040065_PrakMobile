// Bagian 2: Kelas IndeksNilaiMatkul
class IndeksNilaiMatkul(private val nilai: Int) {
    fun hitungIndeks(): String {
        return when {
            nilai in 85..100 -> "A"
            nilai in 70..84 -> "B"
            nilai in 60..69 -> "C"
            nilai in 0..59 -> "D"
            else -> "Nilai di luar jangkauan"
        }
    }
}

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Nilai harus diisi")
        return
    }
    
    val nilai = args[0].toIntOrNull()
    if (nilai == null) {
        println("Input harus berupa angka.")
        return
    }
    
    val indeksNilai = IndeksNilaiMatkul(nilai)
    println("$nilai ${indeksNilai.hitungIndeks()}")
}