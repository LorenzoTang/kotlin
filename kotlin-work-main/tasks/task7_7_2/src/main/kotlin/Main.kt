// Task 7.7.2: phone book simulator
// name: Tang Le
//Student ID:201912989
const val CSV_FILENAME = "phone.csv"

fun main() {
    // Implement the main program here
    // (You can add other functions to this file if you wish)

    val database = createDatabase()
    database.load(CSV_FILENAME)

    while (true) {
        print("Enter a contact name, or press Enter to quit: ")
        val name = readln()

        if (name.isBlank()) {
            break
        }

        if (database.containsKey(name)) {
            println("Phone number: ${database[name]}")
        } else {
            print("No contact found. Enter the phone number: ")
            val phoneNumber = readln()

            database[name] = phoneNumber
            database.save(CSV_FILENAME)

            println("Contact saved.")
        }
    }

    println("Goodbye.")
}
