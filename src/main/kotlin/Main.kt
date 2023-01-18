fun main() {
    print(solution("AaBaa"))
}

fun solution(inputString: String): Boolean {
    if (inputString.lowercase() == inputString.reversed().lowercase())
        return true

    return false
}
