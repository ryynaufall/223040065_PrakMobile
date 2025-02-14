// Bagian 1: Kelas PersegiPanjang
class PersegiPanjang(private val panjang: Int, private val lebar: Int) {
    fun hitungLuas(): Int {
        return panjang * lebar
    }

    fun hitungKeliling(): Int {
        return 2 * (panjang + lebar)
    }
}

fun main(args: Array<String>) {
    if (args.size < 2) {
        println("")
        return
    }

    val panjang = args[0].toIntOrNull()
    val lebar = args[1].toIntOrNull()

    if (panjang == null || lebar == null) {
        println("")
        return
    }

    val persegiPanjang = PersegiPanjang(panjang, lebar)
    println("Panjang: $panjang")
    println("Lebar: $lebar")
    println("Luas: ${persegiPanjang.hitungLuas()}")
    println("Keliling: ${persegiPanjang.hitungKeliling()}")
}
