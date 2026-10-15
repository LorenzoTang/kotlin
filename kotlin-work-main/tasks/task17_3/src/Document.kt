// Task 17.3: Document class, implementing Printable
//name: Le Tang
//Student ID: 201912989(Leeds)//SWJTU:2024117002
class Document(val filename: String) : Printable {
    override fun print() {
        println("Printing $filename")
    }
}