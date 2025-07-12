fun main() {
    val notations = listOf("qa5", "pa8", "qc3")
    val pieces = mutableListOf<ChessPiece>()
    for (n in notations) {
        pieces.add(createPiece(n))
    }
    println(pieces)
}

interface ChessPiece {
    val file: Char
    val rank: Char
}

data class Pawn(
    override val file: Char,
    override val rank: Char,
) : ChessPiece

data class Queen(
    override val file: Char,
    override val rank: Char,
) : ChessPiece

fun createPiece(notation: String): ChessPiece {
    val (type, file, rank) = notation.toCharArray()
    return when (type) {
        'q' -> Queen(file, rank)
        'p' -> Pawn(file, rank)
        // ...
        else -> error("Unknown piece: $type")
    }
}
